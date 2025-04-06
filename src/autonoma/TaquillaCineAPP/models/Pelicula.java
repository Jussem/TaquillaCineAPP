/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCineAPP.models;

import autonoma.TaquillaCineAPP.Exception.PeliculaNoEncontradaException;
import java.util.List;

/**
 *
 * @author juanb
 */
class Pelicula {
    private String nombre;
    private float costoBase;

    public Pelicula(String nombre, float costoBase) {
        this.nombre = nombre;
        this.costoBase = costoBase;
    }

    public String getNombre() {
        return nombre;
    }

    public float getCostoBase() {
        return costoBase;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCostoBase(float costoBase) {
        this.costoBase = costoBase;
    }
    
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
