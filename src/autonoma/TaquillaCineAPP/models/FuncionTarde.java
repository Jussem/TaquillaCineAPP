/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCineAPP.models;

/**
 *
 * @author marti
 */
class FuncionTarde extends Funcion {
    public FuncionTarde() {
        super(0.1);
    }

    public double calcularPorc() {
        return getPorcentajeDescuento();
    }
}
