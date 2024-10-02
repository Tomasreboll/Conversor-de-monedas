import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DatosDeLaApi {
    //en este caso se deja la moneda USD como predeterminada en la Api, ya que todos los calculos van entorno a está.
    private String urlApi = "https://v6.exchangerate-api.com/v6/5a7ac2bce8d536fe9b389183/latest/USD";

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(urlApi))
            .build();
    HttpResponse<String> response;

    {
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    String json = response.body();




    // Todos los getters y setters a utilizar:


    public String getJson() {
        return json;
    }
}
