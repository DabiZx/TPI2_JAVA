package com.informatorio.tpi2_java.dto.cancion_dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class CancionDto {
    private String nombre;

    private Integer ranking;

    private List<Long> generos = new ArrayList<>();

    private Long artista;

    private String album;
}
