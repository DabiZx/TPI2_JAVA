package com.informatorio.tpi2_java.mapper.lista_reproduccion;

import com.informatorio.tpi2_java.domain.ListaReproduccion;
import com.informatorio.tpi2_java.dto.lista_reproduccion_dto.ListaReproduccionDto;



public class ListaReproduccionMapper {

    public static ListaReproduccion map_to_lista_reproduccion(ListaReproduccionDto lista_reproduccion_dto, ListaReproduccion lista_reproduccion){

        lista_reproduccion.setNombre(lista_reproduccion_dto.getNombre());
        
        return lista_reproduccion;
    }


    public static ListaReproduccionDto lista_reproduccion_to_map(ListaReproduccion lista_reproduccion, ListaReproduccionDto lista_reproduccion_dto){
        lista_reproduccion_dto.setNombre(lista_reproduccion.getNombre());

        return lista_reproduccion_dto;
    }
    
}
