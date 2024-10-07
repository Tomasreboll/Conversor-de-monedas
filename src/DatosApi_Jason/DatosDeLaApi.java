package DatosApi_Jason;

import Interacción.Interaccion;
import com.google.gson.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DatosDeLaApi {

    Interaccion interaccion = new Interaccion();

    Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .setPrettyPrinting().create();
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

    private String json = response.body();


    private String moneda = "USD";

    private JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
    private JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
    private double clpValue = conversionRates.get(moneda).getAsDouble();

    // Todos los getters y setters a utilizar:

    private void actualizarClpValue() {
        this.clpValue = conversionRates.get(moneda).getAsDouble();
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
        actualizarClpValue();
    }

    public double getClpValue() {
        return this.clpValue;
    }
}