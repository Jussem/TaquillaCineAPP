/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCineAPP.models;

/**
 * Representa la primera función del día en el cine.
 * Esta función aplica un descuento del 50% sobre el precio base de la boleta.
 * 
 * Extiende la clase {@link Funcion} y define su propio porcentaje de descuento.
 * 
 * @author marti
 * @version 20250405
 * @since 1.0
 * @see Funcion
 */
class PrimeraFuncion extends Funcion {

    /**
     * Crea una función correspondiente a la primera del día,
     * con un descuento del 50%.
     */
    public PrimeraFuncion() {
        super(0.5);
    }

    /**
     * Retorna el porcentaje de descuento aplicado por esta función.
     * 
     * @return Descuento del 50% como valor decimal (0.5).
     */
    public double calcularPorc() {
        return getPorcentajeDescuento();
    }
}

