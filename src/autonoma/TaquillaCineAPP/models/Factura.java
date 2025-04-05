/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCineAPP.models;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author juanb
 */
class Factura {
    private double total;

    public Factura(double total) {
        this.total = total;
    }

    public String generarFactura(Venta venta) {
        String detalle = "--- FACTURA ---\n";
        for (Boleta boleta : venta.getBoletas()) {
            detalle += boleta.mostrarDetalle() + "\n";
        }
        detalle += "Total a pagar: $" + venta.calcularTotal();
        return detalle;
    }
}
