/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCineAPP.models;

/**
 *
 * @author juanb
 */
public class Taquillero {
    private String nombre;
    private int id;

    private GestorPeliculas gestorPeliculas;
    private GestorUsuarios gestorUsuarios;
    private Venta gestorVenta;

    public Taquillero(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public void venderBoletas() {
        // Aquí iría la lógica de interacción con el usuario o sistema para vender boletas
        System.out.println("Vendiendo boletas...");
    }

    public Factura generarFactura() {
        // Puede usarse en conjunto con venderBoletas si hay una lista de boletas lista
        System.out.println("Generando factura...");
        return new Factura(); // Reemplazar con lógica real luego
    }

    public void usarGestorPeliculas(GestorPeliculas gestor) {
        this.gestorPeliculas = gestor;
        System.out.println("Gestor de películas asignado.");
    }

    public void usarGestorUsuarios(GestorUsuarios gestor) {
        this.gestorUsuarios = gestor;
        System.out.println("Gestor de usuarios asignado.");
    }

    public void usarGestorVenta(Venta gestor) {
        this.gestorVenta = gestor;
        System.out.println("Gestor de ventas asignado.");
    }

    // Getters opcionales
    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }
}

