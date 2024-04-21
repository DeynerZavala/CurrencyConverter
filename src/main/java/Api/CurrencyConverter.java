package Api;


import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyConverter {
    private static final String API_KEY = "56a831e738c8f4fcf528c092";
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/";

    public static double currencyConverter(String fromCurrency, String toCurrency, double amount) {
        if (fromCurrency == null || toCurrency == null || fromCurrency.isEmpty() || toCurrency.isEmpty() || amount <= 0) {
            System.out.println("Parámetros de entrada inválidos.");
            return -1;
        }

        String url = API_URL + API_KEY + "/pair/" + fromCurrency + "/" + toCurrency;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() != 200) {
                System.out.println("Error en la solicitud: " + response.statusCode());
                return -1;
            }

            String json = response.body();
            JsonObject jsonObject = new Gson().fromJson(json, JsonObject.class);

            if (jsonObject.has("conversion_rate")) {
                String convertedAmount = jsonObject.get("conversion_rate").getAsString();
                return Double.parseDouble(convertedAmount);
            } else {
                System.out.println("La respuesta JSON no tiene la estructura esperada.");
            }
        } catch (IOException e) {
            System.out.println("Error de IO al hacer la solicitud: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("La solicitud fue interrumpida: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir la tasa de conversión: " + e.getMessage());
        } finally {
            client = null;
        }

        return -1;
    }
}
