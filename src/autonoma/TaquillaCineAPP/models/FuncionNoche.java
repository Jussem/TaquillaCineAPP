/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCineAPP.models;

/**
 *
 * @author marti
 */
class FuncionNoche extends Funcion {
    public FuncionNoche() {
        super(0.0);
    }

    public double calcularPorc() {
        return getPorcentajeDescuento();
    }
}
