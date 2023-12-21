package com.informatorio.tpi2_java.bootstrap;

import java.util.List;
import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.informatorio.tpi2_java.domain.Artista;
import com.informatorio.tpi2_java.domain.Cancion;
import com.informatorio.tpi2_java.domain.Genero;
import com.informatorio.tpi2_java.domain.ListaReproduccion;
import com.informatorio.tpi2_java.domain.Usuario;

import com.informatorio.tpi2_java.repository.cancion.CancionRepository;
import com.informatorio.tpi2_java.repository.genero.GeneroRepository;
import com.informatorio.tpi2_java.repository.lista_reproduccion.ListaReproduccionRepository;
import com.informatorio.tpi2_java.repository.usuario.UsuarioRepository;
import com.informatorio.tpi2_java.repository.artista.ArtistaRepository;

import lombok.AllArgsConstructor;


@Component
@AllArgsConstructor
public class BootstrapData implements CommandLineRunner{

    private UsuarioRepository usuario_repository;

    private CancionRepository cancion_repository;
    private GeneroRepository genero_repository;
    private ArtistaRepository artista_repository;
    private ListaReproduccionRepository lista_reproduccion_repository;
    

    @Override
    public void run(String... args) throws Exception {
        cargar_usuarios();
        cargar_artista();
        cargar_canciones();
        cargar_generos();
        cargar_listas();
    }



    private void cargar_usuarios(){
        Usuario usuario = new Usuario();
        usuario.setId(1l);
        usuario.setNombre("davi");
        usuario.setUsername("Dabi");

        usuario_repository.save(usuario);

    }




    private void cargar_canciones(){
        Cancion cancion = new Cancion();
        cancion.setId(1l);
        cancion.setAlbum("album");
        cancion.setDuracion("4 semanas");
        cancion.setNombre("musiquita");
        cancion.setRanking(5);
        cancion.setGeneros(genero_repository.findAll());

        for (Artista artista: artista_repository.findAll()){
            cancion.setArtista(artista);
        

        cancion_repository.save(cancion);
    }}


    

    private void cargar_listas(){
        ListaReproduccion lista = new ListaReproduccion();
        lista.setId(1l);
        lista.setEs_publica(false);
        lista.setNombre("canciones favoritas");
        lista.setPuede_reproducir_aleatoriamente(true);
        lista.setRepetir(false);
        
        for (Usuario usuario: usuario_repository.findAll()){
            usuario.getListas_reproduccion().add(lista);
            lista.setUsuario(usuario);

        }

        for (Cancion cancion: cancion_repository.findAll()){
            lista.setCanciones(List.of(cancion));
        }

        lista_reproduccion_repository.save(lista);
    }



    private void cargar_generos(){
        Genero genero = new Genero();
        genero.setId(1l);
        genero.setNombre("rock");
        genero.setCanciones(cancion_repository.findAll());

        genero_repository.save(genero);
    }


    private void cargar_artista(){
        Artista artista = new Artista();
        artista.setId(1l);
        artista.setNombre("Luis Miguel");

        artista_repository.save(artista);


    }
}


