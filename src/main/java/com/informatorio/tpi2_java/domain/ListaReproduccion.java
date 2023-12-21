package com.informatorio.tpi2_java.domain;
import java.util.ArrayList;
import java.util.List;


import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class ListaReproduccion { 
    @Id
    @GeneratedValue(generator = "native", strategy = GenerationType.AUTO)
    @GenericGenerator(name = "native")
    // @JdbcTypeCode(SqlTypes.CHAR)
    @Column(updatable = false, nullable = false)
    private Long id; 

    @Column(nullable = false)
    private String nombre;

    @ManyToOne
    private Usuario usuario;


    @ManyToMany
    @JoinTable(name = "cancion_lista_reproduccion", joinColumns = @JoinColumn(name = "lista_reproduccion_id"),
    inverseJoinColumns = @JoinColumn(name = "cancion_id"))
    private List<Cancion> canciones = new ArrayList<>();

    private boolean repetir;

    private boolean puede_reproducir_aleatoriamente;

    private boolean es_publica;
}
