import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiClient {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/d8cc9b2e10bede65d30ff4ce/latest/USD";

    public static JsonObject getRates() throws Exception {
        URL url = new URL(API_URL);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonObject jsonobj = root.getAsJsonObject();

        System.out.println("Resposta JSON da API: " + jsonobj.toString()); // Log para verificar a resposta
        return jsonobj;
    }
}
