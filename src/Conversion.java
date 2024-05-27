import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;
import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribi el codigo de referencia de la moneda: ");
        var referencia = teclado.nextLine();


        String busqueda = "https://v6.exchangerate-api.com/v6/21e2f8d34191cd3983a07711/latest/" + referencia;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(busqueda))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        //System.out.println(json);

        Gson gson = new Gson();
        var conversion = gson.fromJson(json, Moneda.class);
        System.out.println(conversion.getFactoresDeConversion());//muestra la lista de los factores en base a la denominacion elegida

        Map<String, Double> conversionRates = conversion.getFactoresDeConversion();
        Double tasaConversion = conversionRates.get("AED"); // Reemplaza "USD" con el código de la moneda que deseas consultar
        System.out.println(tasaConversion);
        System.out.println("#####################################");
        System.out.println(conversion.obtenerCoeficiente("AED"));
        System.out.println(conversion.convertirMoneda("AED", 6548));
    }
}
