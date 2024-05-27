import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class Conversion {
    public static void convertirMoneda(String monedaReferencia, String monedaConversion, double valorMonedaOriginal) throws Exception {
        String busqueda = "https://v6.exchangerate-api.com/v6/21e2f8d34191cd3983a07711/latest/" + monedaReferencia;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(busqueda))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        var conversion = gson.fromJson(response.body(), Moneda.class);
        double valorMonedaNuevo = conversion.convertirMoneda(monedaConversion, valorMonedaOriginal);

        System.out.println("Resultado de la conversión: " + valorMonedaNuevo);
    }
}

