/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package autonoma.TaquillaCineAPP.models;

/**
 *
 * @author juanb
 */
import java.util.ArrayList;

class Venta {
    private ArrayList<Boleta> boletas;

    public Venta() {
        boletas = new ArrayList<Boleta>();
    }

    public void agregarBoleta(Boleta boleta) {
        boletas.add(boleta);
    }

    public float calcularTotal() {
        float total = 0;
        for (Boleta boleta : boletas) {
            total += boleta.getPrecioFinal();
        }
        return total;
    }

    public ArrayList<Boleta> getBoletas() {
        return boletas;
    }
}
