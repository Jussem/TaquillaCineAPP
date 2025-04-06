/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCineAPP.models;

import java.util.ArrayList;

/**
 * Representa la cartelera de películas disponibles en el cine.
 * Permite agregar, eliminar y listar películas que se encuentran en exhibición.
 * 
 * @author marti
 * @version 20250405
 * @since 1.0
 * @see Pelicula
 */
class Cartelera {

    /** Lista de películas disponibles en la cartelera */
    private ArrayList<Pelicula> peliculas;

    /**
     * Crea una nueva instancia de la cartelera con una lista vacía de películas.
     */
    public Cartelera() {
        peliculas = new ArrayList<Pelicula>();
    }

    /**
     * Agrega una película a la cartelera.
     *
     * @param pelicula Película que se desea agregar.
     */
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    /**
     * Elimina una película de la cartelera si se encuentra en la lista.
     *
     * @param pelicula Película que se desea eliminar.
     */
    public void eliminarPelicula(Pelicula pelicula) {
        peliculas.remove(pelicula);
    }

    /**
     * Retorna la lista actual de películas disponibles en la cartelera.
     *
     * @return Lista de películas en exhibición.
     */
    public ArrayList<Pelicula> listarPeliculas() {
        return peliculas;
    }
}
