import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.HashMap;
import java.util.Map;

public class ExchangeRates {
    private Map<String, Double> rates;

    public ExchangeRates(JsonObject jsonObject) {
        rates = new HashMap<>();
        String[] desiredCurrencies = {"ARS", "BOB", "BRL", "CLP", "COP", "USD"};

        if (jsonObject.has("conversion_rates")) {
            JsonObject ratesObject = jsonObject.getAsJsonObject("conversion_rates");
            for (String currency : desiredCurrencies) {
                if (ratesObject.has(currency)) {
                    rates.put(currency, ratesObject.get(currency).getAsDouble());
                }
            }
        } else {
            throw new IllegalArgumentException("O campo 'conversion_rates' não está presente na resposta JSON.");
        }
    }

    public Map<String, Double> getRates() {
        return rates;
    }
}
