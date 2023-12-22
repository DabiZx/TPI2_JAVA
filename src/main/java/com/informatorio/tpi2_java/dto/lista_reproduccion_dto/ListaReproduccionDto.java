package com.informatorio.tpi2_java.dto.lista_reproduccion_dto;

import java.util.ArrayList;
import java.util.List;

// import com.informatorio.tpi2_java.domain.Cancion;

import lombok.Data;

@Data
public class ListaReproduccionDto {
    
    private String nombre;

    private List<Long> canciones = new ArrayList<>();

    private boolean es_publica;

    private boolean puede_reproducir_aleatoriamente;

    private boolean repetir;
}
