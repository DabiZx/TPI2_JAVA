package com.informatorio.tpi2_java.controller.usuario;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.informatorio.tpi2_java.dto.respuesta.RespuestaDto;
import com.informatorio.tpi2_java.dto.usuario_dto.UsuarioDto;


@RestController
@RequestMapping(value = "/api/v1/usuarios", produces = {MediaType.APPLICATION_JSON_VALUE})
public class UsuarioController {

    @PostMapping
    public ResponseEntity<RespuestaDto> crear_usuario_con_listas_reproduccion(@RequestBody UsuarioDto usuario_dto){
        return null;
    }
    
}
