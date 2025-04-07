/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCineAPP.models;

/**
 * Representa una función de cine realizada en horario nocturno.
 * Actualmente no aplica ningún descuento por defecto (0%),
 * aunque este comportamiento puede modificarse mediante el método setter heredado.
 * 
 * Hereda de {@link Funcion} y utiliza directamente el porcentaje de descuento definido.
 * 
 * @author marti
 * @version 20250405
 * @since 1.0
 * @see Funcion
 */
public class FuncionNoche extends Funcion {

    /**
     * Crea una función nocturna sin descuento (0%).
     */
    public FuncionNoche() {
        super(0.0);
    }

    /**
     * Retorna el porcentaje de descuento aplicado por la función nocturna.
     * 
     * @return Descuento actual definido para esta función.
     */
    public double calcularPorc() {
        return getPorcentajeDescuento();
    }
}

