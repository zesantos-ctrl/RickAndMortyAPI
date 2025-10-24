package com.RickandMorty.service;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverterDados {

    private final ObjectMapper mapper = new ObjectMapper(); // Objeto para converter JSON em objeto Java

    public <T> T obterDados(String json, Class<T> classe) {
        try {
            // Converte o JSON recebido em um objeto da classe desejada
            return mapper.readValue(json, classe);
        } catch (Exception e) {
            // Lança exceção caso a conversão falhe
            throw new RuntimeException("Erro ao converter JSON: " + e.getMessage());
        }
    }

}
