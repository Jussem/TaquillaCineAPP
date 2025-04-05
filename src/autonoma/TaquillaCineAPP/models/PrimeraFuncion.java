/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCineAPP.models;

/**
 *
 * @author marti
 */
class PrimeraFuncion extends Funcion {
    public PrimeraFuncion() {
        super(0.5);
    }

    public double calcularPorc() {
        return getPorcentajeDescuento();
    }
}
