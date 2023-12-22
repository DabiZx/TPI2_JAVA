package com.informatorio.tpi2_java.dto.usuario_dto;

import java.util.List;


import lombok.Data;

import com.informatorio.tpi2_java.dto.lista_reproduccion_dto.ListaReproduccionDto;


@Data
public class UsuarioDto {
    
    private String nombre;

    private String username;

    private List<Long> listas_reproduccion;
}
