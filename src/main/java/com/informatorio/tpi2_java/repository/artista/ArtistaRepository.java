package com.informatorio.tpi2_java.repository.artista;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.informatorio.tpi2_java.domain.Artista;

@Repository
public interface ArtistaRepository extends JpaRepository<Artista, Long>{
    
}
