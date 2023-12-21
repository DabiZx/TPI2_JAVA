package com.informatorio.tpi2_java.repository.usuario;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.informatorio.tpi2_java.domain.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
