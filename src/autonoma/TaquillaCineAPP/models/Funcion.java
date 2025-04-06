/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCineAPP.models;

/**
 * Clase abstracta que representa una función de cine.
 * Define una estructura básica para aplicar descuentos sobre el precio base de las boletas,
 * y debe ser extendida por clases concretas que implementen la lógica específica del descuento.
 * 
 * @author juanb
 * @version 20250405
 * @since 1.0
 */
public abstract class Funcion {

    /** Porcentaje de descuento que aplica la función sobre el precio base */
    private double porcentajeDescuento;

    /**
     * Crea una función con el porcentaje de descuento especificado.
     *
     * @param porcentajeDescuento Porcentaje de descuento aplicado a la función (entre 0 y 1).
     */
    public Funcion(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    /**
     * Obtiene el porcentaje de descuento de la función.
     *
     * @return Porcentaje de descuento como valor decimal.
     */
    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    /**
     * Establece el porcentaje de descuento para la función.
     *
     * @param porcentajeDescuento Nuevo porcentaje de descuento (entre 0 y 1).
     */
    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    /**
     * Método abstracto que debe ser implementado por las subclases
     * para calcular el porcentaje de descuento efectivo aplicado por la función.
     *
     * @return Valor decimal correspondiente al descuento aplicado.
     */
    public abstract double calcularPorc();
}


