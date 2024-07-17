package Busqueda_Api;



import Modelos_Moneda.Divisa;
import Modelos_Moneda.Monedas;
import com.google.gson.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexionApi {


    public Divisa Peticion(String codBase, String codDestino, String cantidad) {


        //String apiKeyAccess = "e58262329c36c4ae15c17b35";
        String codigoMonedaBase = codBase;
        String codigoMonedaConversion = codDestino;
        Double valor = Double.parseDouble(cantidad);


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/e58262329c36c4ae15c17b35/pair/"+codigoMonedaBase+"/"+codigoMonedaConversion+"/"+valor))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            //System.out.println(json);

            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_DASHES).create();

            Monedas monedas = gson.fromJson(json, Monedas.class);

            //System.out.println(monedas);

            Divisa divisa = new Divisa(monedas);
            //System.out.println(divisa);


            return divisa;

        } catch (Exception e) {
            throw new RuntimeException("hay algun error" + e);
        }


    }

}



