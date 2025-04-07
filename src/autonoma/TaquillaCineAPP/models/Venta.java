/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package autonoma.TaquillaCineAPP.models;

/**
 * Representa una venta de boletas realizada por un usuario en el sistema del cine.
 * Permite agregar boletas a la venta, calcular el total a pagar por todas ellas
 * y obtener el listado de boletas incluidas.
 * 
 * @author juanb
 * @version 20250405
 * @since 1.0
 * @see Boleta
 */
import java.util.ArrayList;

public class Venta {

    /** Lista de boletas incluidas en la venta */
    private ArrayList<Boleta> boletas;

    /**
     * Crea una nueva instancia de venta con una lista vacía de boletas.
     */
    public Venta() {
        boletas = new ArrayList<Boleta>();
    }

    /**
     * Agrega una boleta a la venta.
     *
     * @param boleta Boleta a incluir en la venta.
     */
    public void agregarBoleta(Boleta boleta) {
        boletas.add(boleta);
    }

    /**
     * Calcula el total a pagar sumando los precios finales de todas las boletas.
     *
     * @return Total acumulado de la venta.
     */
    public float calcularTotal() {
        float total = 0;
        for (Boleta boleta : boletas) {
            total += boleta.getPrecioFinal();
        }
        return total;
    }

    /**
     * Retorna la lista de boletas asociadas a esta venta.
     *
     * @return Lista de boletas en la venta.
     */
    public ArrayList<Boleta> getBoletas() {
        return boletas;
    }
}

