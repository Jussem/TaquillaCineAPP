/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCineAPP.models;

/**
 *
 * @author juanb
 */
public class Funcion {
    private String nombre;
    private double descuento;

    public Funcion(String nombre, double descuento) {
        this.nombre = nombre;
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
