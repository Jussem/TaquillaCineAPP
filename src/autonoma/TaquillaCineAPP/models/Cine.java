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
public class Cine {
    private List<Pelicula> peliculas;
    private List<Funcion> funciones;
    private List<Usuario> usuarios;

    public Cine() {
        this.peliculas = new ArrayList<>();
        this.funciones = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void gestionarPeliculas() {
        // Lógica para gestionar películas (puede conectarse con un IGestorPeliculas)
        System.out.println("Gestionando películas...");
    }

    public void gestionarUsuarios() {
        // Lógica para gestionar usuarios (puede conectarse con un IGestorUsuarios)
        System.out.println("Gestionando usuarios...");
    }

    public Factura realizarVenta(List<Boleta> boletas) {
        Factura factura = new Factura();
        for (Boleta b : boletas) {
            try {
                b.calcularCostoFinal();
                factura.agregarBoleta(b);
            } catch (ExcepcionValorNegativo e) {
                System.out.println("Error en boleta: " + e.getMessage());
            }
        }
        factura.calcularTotal();
        return factura;
    }

    // Métodos adicionales para acceder a las listas (opcional)
    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public List<Funcion> getFunciones() {
        return funciones;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}

