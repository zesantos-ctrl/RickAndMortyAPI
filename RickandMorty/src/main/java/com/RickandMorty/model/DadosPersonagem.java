package com.RickandMorty.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosPersonagem(String name, String status, String species,String gender) { }
