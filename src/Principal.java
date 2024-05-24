import src.modelos.Moneda;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;



public class Principal {
    public static void main(String[] args) {
        Moneda moneda = new Moneda();
        moneda.setValor(1000);
        moneda.setDenominacion("ARS");
        System.out.println(moneda.getValor());
        System.out.println(moneda.getDenominacion());
//        https://v6.exchangerate-api.com/v6/21e2f8d34191cd3983a07711/latest/USD
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("https://v6.exchangerate-api.com/v6/21e2f8d34191cd3983a07711/latest/USD"))
//                .build();
//        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
//                .thenApply(HttpResponse::body)
//                .thenAccept(System.out::println)
//                .join();



    }
}
