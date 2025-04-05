/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCineAPP.models;

import autonoma.TaquillaCineAPP.Exception.PrecioNegativoException;

/**
 *
 * @author juanb
 */
class Boleta {
    private Pelicula pelicula;
    private Funcion funcion;
    private Usuario usuario;
    private double precioFinal;

    public Boleta(Pelicula pelicula, Funcion funcion, Usuario usuario) {
        this.pelicula = pelicula;
        this.funcion = funcion;
        this.usuario = usuario;
        this.precioFinal = calcularPrecio();
    }

    public double calcularPrecio() {
    double base = pelicula.getCostoBase();
    double descuentoFuncion = base * funcion.calcularPorc();
    double descuentoUsuario = usuario.calcularPorcentajeDescuento();
    double precio = base - descuentoFuncion - descuentoUsuario;
    
    if (precio < 0) {
        throw new PrecioNegativoException();
    }
    
    return precio;
}


    public String mostrarDetalle() {
        return "Boleta - Película: " + pelicula.getNombre() + ", Usuario: " + usuario.getNombre() + ", Precio Final: $" + precioFinal;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }
}
