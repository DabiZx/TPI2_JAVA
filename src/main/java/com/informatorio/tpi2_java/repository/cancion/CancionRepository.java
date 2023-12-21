package com.informatorio.tpi2_java.repository.cancion;


import com.informatorio.tpi2_java.domain.Cancion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CancionRepository extends JpaRepository<Cancion, Long>{
    
}
