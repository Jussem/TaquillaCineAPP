/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCineAPP.models;

import java.util.List;
import java.util.ArrayList;
/**
 * Representa una factura generada a partir de una venta de boletas en el cine.
 * La factura incluye el detalle de cada boleta vendida y el total a pagar.
 * 
 * @author juanb
 * @version 20250405
 * @since 1.0
 * @see Venta
 * @see Boleta
 */
class Factura {

    /** Total a pagar registrado en la factura */
    private double total;

    /**
     * Crea una factura con el total especificado.
     *
     * @param total Monto total de la factura.
     */
    public Factura(double total) {
        this.total = total;
    }

    /**
     * Genera una representación textual de la factura,
     * incluyendo el detalle de cada boleta y el total a pagar.
     *
     * @param venta Venta de la cual se generará la factura.
     * @return Cadena con el contenido completo de la factura.
     */
    public String generarFactura(Venta venta) {
        String detalle = "--- FACTURA ---\n";
        for (Boleta boleta : venta.getBoletas()) {
            detalle += boleta.mostrarDetalle() + "\n";
        }
        detalle += "Total a pagar: $" + venta.calcularTotal();
        return detalle;
    }
}

