package com.angelpuentesdevv.thundertomes.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


//Clase para realizar la petición de datos a la API
public class ConsumoAPI {

    //Método que implementa la petición de datos
    public String obtenerDatos(String url) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) { //Tratamiento de errores y excepciones
            throw new RuntimeException(e);
        }

        //Respuesta de la API
        String json = response.body();
        return json;
    }
}
