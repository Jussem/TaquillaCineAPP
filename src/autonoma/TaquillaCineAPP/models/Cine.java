/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCineAPP.models;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author juanb
 */
class Cine {
    private ArrayList<Usuario> usuarios;
    private Cartelera cartelera;

    public Cine() {
        usuarios = new ArrayList<Usuario>();
        cartelera = new Cartelera();
    }

    public Factura venderBoletas(Venta venta) {
        double total = venta.calcularTotal();
        return new Factura(total);
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void eliminarUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    public ArrayList<Usuario> listarUsuarios() {
        return usuarios;
    }

    public void agregarPelicula(Pelicula pelicula) {
        cartelera.agregarPelicula(pelicula);
    }

    public void eliminarPelicula(Pelicula pelicula) {
        cartelera.eliminarPelicula(pelicula);
    }

    public ArrayList<Pelicula> listarPeliculas() {
        return cartelera.listarPeliculas();
    }
}

