/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCineAPP.models;

/**
 *
 * @author marti
 */
class Mayor extends Usuario {
    public Mayor(String nombre) {
        super(nombre);
    }

    public double calcularPorcentajeDescuento() {
        return 1000.0;
    }
}
