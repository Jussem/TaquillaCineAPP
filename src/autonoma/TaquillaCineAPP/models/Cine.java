/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCineAPP.models;
import java.util.ArrayList;
import java.util.List;
/**
 * Representa un cine que gestiona usuarios, cartelera de películas y la venta de boletas.
 * Proporciona funcionalidades para registrar usuarios, administrar la cartelera
 * y generar facturas a partir de ventas realizadas.
 * 
 * @author juanb
 * @version 20250405
 * @since 1.0
 * @see Usuario
 * @see Cartelera
 * @see Venta
 * @see Factura
 */
public class Cine {

    /** Lista de usuarios registrados en el cine */
    private ArrayList<Usuario> usuarios;

    /** Cartelera de películas disponibles en el cine */
    private Cartelera cartelera;

    /**
     * Crea una nueva instancia del cine con una cartelera vacía y sin usuarios registrados.
     */
    public Cine() {
        usuarios = new ArrayList<Usuario>();
        cartelera = new Cartelera();
    }

    /**
     * Procesa una venta de boletas y genera una factura con el total correspondiente.
     *
     * @param venta Venta realizada con una o más boletas.
     * @return Factura generada a partir del total de la venta.
     */
    public Factura venderBoletas(Venta venta) {
        double total = venta.calcularTotal();
        return new Factura(total);
    }

    /**
     * Registra un nuevo usuario en el sistema del cine.
     *
     * @param usuario Usuario que se desea agregar.
     */
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    /**
     * Elimina un usuario del sistema del cine.
     *
     * @param usuario Usuario que se desea eliminar.
     */
    public void eliminarUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    /**
     * Retorna la lista completa de usuarios registrados en el cine.
     *
     * @return Lista de usuarios.
     */
    public ArrayList<Usuario> listarUsuarios() {
        return usuarios;
    }

    /**
     * Agrega una película a la cartelera del cine.
     *
     * @param pelicula Película que se desea agregar a la cartelera.
     */
    public void agregarPelicula(Pelicula pelicula) {
        cartelera.agregarPelicula(pelicula);
    }

    /**
     * Elimina una película de la cartelera del cine.
     *
     * @param pelicula Película que se desea eliminar de la cartelera.
     */
    public void eliminarPelicula(Pelicula pelicula) {
        cartelera.eliminarPelicula(pelicula);
    }

    /**
     * Devuelve la lista de películas actualmente en cartelera.
     *
     * @return Lista de películas disponibles.
     */
    public ArrayList<Pelicula> listarPeliculas() {
        return cartelera.listarPeliculas();
    }
}