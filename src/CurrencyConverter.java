import java.text.DecimalFormat;
import java.util.Map;

public class CurrencyConverter {
    private Map<String, Double> rates;

    public CurrencyConverter(Map<String, Double> rates) {
        this.rates = rates;
    }

    public double convert(String from, String to, double amount) {
        if (rates.containsKey(from) && rates.containsKey(to)) {
            double rateFrom = rates.get(from);
            double rateTo = rates.get(to);
            return (amount / rateFrom) * rateTo;
        } else {
            throw new IllegalArgumentException("Moeda não suportada.");
        }
    }

    public String formatCurrency(double value, String currencyCode) {
        DecimalFormat df = new DecimalFormat("#,##0.00");

        switch (currencyCode) {
            case "ARS":
            case "BOB":
            case "CLP":
            case "COP":
                return "$ " + df.format(value);
            case "BRL":
                return "R$ " + df.format(value);
            case "USD":
                return "$ " + df.format(value); // Dólar americano também é representado por $
            default:
                return df.format(value);
        }
    }
}

