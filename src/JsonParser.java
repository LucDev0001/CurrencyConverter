import com.google.gson.Gson;

public class JsonParser {
    public static ExchangeRates parseRates(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, ExchangeRates.class);
    }
}
