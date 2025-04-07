/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCineAPP.models;

/**
 * Representa una función de cine realizada en horario de la tarde.
 * Por defecto aplica un descuento del 10% sobre el precio base de la boleta.
 * 
 * Extiende la clase {@link Funcion} y retorna directamente el porcentaje de descuento predefinido.
 * 
 * @author marti
 * @version 20250405
 * @since 1.0
 * @see Funcion
 */
public class FuncionTarde extends Funcion {

    /**
     * Crea una función de la tarde con un descuento del 10%.
     */
    public FuncionTarde() {
        super(0.1);
    }

    /**
     * Retorna el porcentaje de descuento aplicado por la función de la tarde.
     * 
     * @return Descuento actual definido para esta función (por defecto 0.1).
     */
    public double calcularPorc() {
        return getPorcentajeDescuento();
    }
}

