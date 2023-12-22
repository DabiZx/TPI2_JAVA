package com.informatorio.tpi2_java.mapper.artista;

import com.informatorio.tpi2_java.domain.Artista;
import com.informatorio.tpi2_java.dto.artista_dto.ArtistaDto;

public class ArtistaMapper {

    public static Artista map_to_artista(ArtistaDto artista_dto, Artista artista){
        artista.setNombre(artista_dto.getNombre());

        return artista;
    }

    public static ArtistaDto artista_to_map(Artista artista, ArtistaDto artista_dto){
        artista_dto.setNombre(artista.getNombre());

        return artista_dto;
    }
    

    
}
