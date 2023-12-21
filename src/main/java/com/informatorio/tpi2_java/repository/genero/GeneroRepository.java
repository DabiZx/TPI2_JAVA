package com.informatorio.tpi2_java.repository.genero;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.informatorio.tpi2_java.domain.Genero;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, UUID>{
    
}
