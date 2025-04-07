/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCineAPP.models;

import autonoma.TaquillaCineAPP.Exception.PeliculaNoEncontradaException;
import java.util.List;

/**
 * Representa una película disponible en el cine, con su nombre y costo base.
 * Esta clase permite acceder y modificar los datos básicos de la película,
 * así como eliminarse de una lista externa de películas si existe una coincidencia por nombre.
 * 
 * @author juanb
 * @version 20250405
 * @since 1.0
 * @see PeliculaNoEncontradaException
 */
public class Pelicula {

    /** Nombre de la película */
    private String nombre;

    /** Costo base de la boleta para esta película */
    private float costoBase;

    /**
     * Crea una nueva película con el nombre y el costo base especificados.
     * 
     * @param nombre Nombre de la película.
     * @param costoBase Costo base de la boleta para la película.
     */
    public Pelicula(String nombre, float costoBase) {
        this.nombre = nombre;
        this.costoBase = costoBase;
    }

    /**
     * Obtiene el nombre de la película.
     *
     * @return Nombre actual de la película.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el costo base de la película.
     *
     * @return Costo base actual de la película.
     */
    public float getCostoBase() {
        return costoBase;
    }

    /**
     * Establece un nuevo nombre para la película.
     *
     * @param nombre Nuevo nombre de la película.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece un nuevo costo base para la película.
     *
     * @param costoBase Nuevo costo base de la película.
     */
    public void setCostoBase(float costoBase) {
        this.costoBase = costoBase;
    }

    /**
     * Elimina esta película de la lista proporcionada si existe una coincidencia por nombre.
     * 
     * @param listaPeliculas Lista de películas de donde se desea eliminar.
     * @throws PeliculaNoEncontradaException Si no se encuentra la película en la lista.
     */
    public void eliminarPelicula(List<Pelicula> listaPeliculas) {
        boolean encontrada = false;

        for (Pelicula p : listaPeliculas) {
            if (p.getNombre().equalsIgnoreCase(this.nombre)) {
                listaPeliculas.remove(p);
                encontrada = true;
                break;
            }
        }

        if (!encontrada) {
            throw new PeliculaNoEncontradaException();
        }
    }
}

