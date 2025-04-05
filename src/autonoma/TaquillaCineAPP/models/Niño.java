/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCineAPP.models;

/**
 *
 * @author marti
 */
class Niño extends Usuario {
    public Niño(String nombre) {
        super(nombre);
    }

    public double calcularPorcentajeDescuento() {
        return 500.0;
    }
}
