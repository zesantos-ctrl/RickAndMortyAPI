package com.RickandMorty.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApi {
    public String obterDados(String url) {
        try {
            // Cria o cliente HTTP
            HttpClient client = HttpClient.newHttpClient();
            // Cria a requisição GET para a URL da API
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();
            // Envia a requisição e recebe a resposta como String
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao obter dados da API: " + e.getMessage());
        }

    }
}
