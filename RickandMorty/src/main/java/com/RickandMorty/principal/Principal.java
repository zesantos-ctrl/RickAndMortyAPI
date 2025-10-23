package com.RickandMorty.principal;

import com.RickandMorty.model.ResultadoApi;
import com.RickandMorty.service.ConsumoApi;
import com.RickandMorty.service.ConverterDados;

import java.util.Scanner;

public class Principal {
    private Scanner teclado = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private ConverterDados conversor = new ConverterDados();

    private final String ENDERECO ="https://rickandmortyapi.com/api/character/?name=";

    public void exibeMenu(){
        System.out.println("Digite o nome do personagem de RICK AND MORTY: ");
        var nomePersonagem = teclado.nextLine();

        var json =consumo.obterDados(ENDERECO + nomePersonagem.replace(" ", "+"));
        ResultadoApi resultado = conversor.obterDados(json, ResultadoApi.class);

        if(resultado.results() == null || resultado.results().isEmpty()) {
            System.out.println("Nenhum personagem encontrado!");
            return;
        }

        System.out.println("\n ==== Resultado personagem encontrados ====");
        resultado.results().forEach(p -> {
            System.out.println("----------------------------------------");
            System.out.println("Nome: " + p.name());
            System.out.println("Status: " + p.status());
            System.out.println("Espécies: " + p.species());
            System.out.println("Gênero: " + p.gender());
        });
    }
}
