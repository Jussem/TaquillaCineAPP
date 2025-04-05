/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCineAPP.models;

import java.util.ArrayList;

/**
 *
 * @author marti
 */
class Cartelera {
    private ArrayList<Pelicula> peliculas;

    public Cartelera() {
        peliculas = new ArrayList<Pelicula>();
    }

    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    public void eliminarPelicula(Pelicula pelicula) {
        peliculas.remove(pelicula);
    }

    public ArrayList<Pelicula> listarPeliculas() {
        return peliculas;
    }
}
