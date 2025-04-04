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
public class Factura {
    private List<Boleta> boletas;
    private double total;

    public Factura() {
        this.boletas = new ArrayList<>();
    }

    public void agregarBoleta(Boleta boleta) {
        boletas.add(boleta);
    }

    public double calcularTotal() {
        total = 0;
        for (Boleta b : boletas) {
            total += b.getCostoFinal();
        }
        return total;
    }

    public String generarDetalle() {
        StringBuilder detalle = new StringBuilder("Detalle de Factura:\n");
        for (Boleta b : boletas) {
            detalle.append("Pelicula: ").append(b.getPelicula().getTitulo())
                   .append(" | Funcion: ").append(b.getFuncion().getNombre())
                   .append(" | Usuario: ").append(b.getUsuario().getNombre())
                   .append(" | Costo: ").append(b.getCostoFinal())
                   .append("\n");
        }
        detalle.append("Total: ").append(total);
        return detalle.toString();
    }

    public double getTotal() {
        return total;
    }

    public List<Boleta> getBoletas() {
        return boletas;
    }
}
