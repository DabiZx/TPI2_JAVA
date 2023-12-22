package com.informatorio.tpi2_java.mapper.usuario;

import com.informatorio.tpi2_java.domain.Usuario;
import com.informatorio.tpi2_java.dto.usuario_dto.UsuarioDto;
import com.informatorio.tpi2_java.repository.usuario.UsuarioRepository;



public class UsuarioMapper {

    // private UsuarioRepository usuario_repository;
    

    public static Usuario map_to_usuario(UsuarioDto usuario_dto, Usuario usuario){
        usuario.setNombre(usuario_dto.getNombre());
        usuario.setUsername(usuario_dto.getUsername());


        return usuario;
    }
    

    public static UsuarioDto usuario_to_map(Usuario usuario, UsuarioDto usuario_dto){
        usuario_dto.setNombre(usuario.getNombre());
        usuario_dto.setUsername(usuario.getUsername());

        return usuario_dto;
    }
}
