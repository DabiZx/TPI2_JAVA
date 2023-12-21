package com.informatorio.tpi2_java.repository.lista_reproduccion;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.informatorio.tpi2_java.domain.ListaReproduccion;


@Repository
public interface ListaReproduccionRepository extends JpaRepository<ListaReproduccion, Long>{
    
}
