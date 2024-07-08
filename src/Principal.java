import com.google.gson.JsonObject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try {
            JsonObject jsonResponse = ApiClient.getRates();
            ExchangeRates exchangeRates = new ExchangeRates(jsonResponse);
            CurrencyConverter converter = new CurrencyConverter(exchangeRates.getRates());
            ConversionHistory history = new ConversionHistory();

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Menu de Conversão de Moedas:");
                System.out.println("1. USD para ARS");
                System.out.println("2. ARS para USD");
                System.out.println("3. USD para BOB");
                System.out.println("4. BOB para USD");
                System.out.println("5. USD para BRL");
                System.out.println("6. BRL para USD");
                System.out.println("7. USD para CLP");
                System.out.println("8. CLP para USD");
                System.out.println("9. USD para COP");
                System.out.println("10. COP para USD");
                System.out.println("11. Ver Histórico de Conversões");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");
                int option = scanner.nextInt();

                if (option == 0) {
                    break;
                } else if (option == 11) {
                    history.showHistory();
                    continue;
                }

                String fromCurrency = "";
                String toCurrency = "";

                switch (option) {
                    case 1:
                        fromCurrency = "USD";
                        toCurrency = "ARS";
                        break;
                    case 2:
                        fromCurrency = "ARS";
                        toCurrency = "USD";
                        break;
                    case 3:
                        fromCurrency = "USD";
                        toCurrency = "BOB";
                        break;
                    case 4:
                        fromCurrency = "BOB";
                        toCurrency = "USD";
                        break;
                    case 5:
                        fromCurrency = "USD";
                        toCurrency = "BRL";
                        break;
                    case 6:
                        fromCurrency = "BRL";
                        toCurrency = "USD";
                        break;
                    case 7:
                        fromCurrency = "USD";
                        toCurrency = "CLP";
                        break;
                    case 8:
                        fromCurrency = "CLP";
                        toCurrency = "USD";
                        break;
                    case 9:
                        fromCurrency = "USD";
                        toCurrency = "COP";
                        break;
                    case 10:
                        fromCurrency = "COP";
                        toCurrency = "USD";
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        continue;
                }

                System.out.print("Digite o valor: ");
                double amount = scanner.nextDouble();
                double result = converter.convert(fromCurrency, toCurrency, amount);

                String formattedResult = converter.formatCurrency(result, toCurrency);

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();
                String entry = String.format("[%s] Convertido %.2f %s para %s", formatter.format(now),
                        amount, fromCurrency, formattedResult);
                history.addEntry(entry);

                System.out.println("Resultado: " + formattedResult);
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println("Erro ao obter taxas de câmbio: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
