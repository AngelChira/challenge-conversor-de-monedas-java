import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConsultarCambioMoneda {
    public Moneda obtenerCambio(String monedaOrigen, String monedaDestino) {
        // Setting URL
        String apiKey = "b4f453280d464f15fd79b67a";
        String url_str = "https://v6.exchangerate-api.com/v6/"+apiKey+"/latest/"+monedaOrigen;

        try {
            URL url = new URL(url_str);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();
            // Convert to JSON
            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            JsonObject jsonobj = root.getAsJsonObject();

            // Accessing object
            String req_result = jsonobj.get("result").getAsString();

            // Validamos que la respuesta fue exitosa
            if (!req_result.equalsIgnoreCase("success")) {
                System.out.println("Error en la respuesta de la API.");
                return null;
            }

            // Obtener la tasa de conversión específica
            JsonObject conversionRates = jsonobj.getAsJsonObject("conversion_rates");
            double tasaCambio = conversionRates.get(monedaDestino).getAsDouble();

            Moneda monedaObtenida = new Moneda(monedaOrigen, monedaDestino, tasaCambio);
            return monedaObtenida;
        } catch (IOException e) {
            System.out.println("Error:\n"+e.getMessage());
            return null;
        }
    }
}
