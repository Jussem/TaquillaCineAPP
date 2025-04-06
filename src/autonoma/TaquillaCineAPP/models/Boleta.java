/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCineAPP.models;

import autonoma.TaquillaCineAPP.Exception.PrecioNegativoException;

/**
 * Representa una boleta de cine asociada a una película, una función y un usuario.
 * La boleta calcula automáticamente su precio final al ser creada,
 * teniendo en cuenta posibles descuentos por tipo de usuario y función.
 * 
 * @author juanb
 * @version 20250405
 * @since 1.0
 * @see Pelicula
 * @see Funcion
 * @see Usuario
 */
class Boleta {

    /** Película asociada a la boleta */
    private Pelicula pelicula;

    /** Función en la que se proyecta la película */
    private Funcion funcion;

    /** Usuario que adquiere la boleta */
    private Usuario usuario;

    /** Precio final de la boleta luego de aplicar descuentos */
    private double precioFinal;

    /**
     * Crea una nueva boleta con la información especificada.
     * Calcula automáticamente el precio final al momento de la creación.
     *
     * @param pelicula Película que se va a proyectar.
     * @param funcion Función en la que se proyecta la película.
     * @param usuario Usuario que adquiere la boleta.
     */
    public Boleta(Pelicula pelicula, Funcion funcion, Usuario usuario) {
        this.pelicula = pelicula;
        this.funcion = funcion;
        this.usuario = usuario;
        this.precioFinal = calcularPrecio();
    }

    /**
     * Calcula el precio final de la boleta considerando descuentos por función y usuario.
     *
     * @return Precio final de la boleta.
     * @throws PrecioNegativoException Si el precio resultante es menor que cero.
     */
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

    /**
     * Retorna una cadena con los detalles de la boleta, incluyendo película, usuario y precio.
     *
     * @return Detalle en formato legible para el usuario.
     */
    public String mostrarDetalle() {
        return "Boleta - Película: " + pelicula.getNombre()
             + ", Usuario: " + usuario.getNombre()
             + ", Precio Final: $" + precioFinal;
    }

    /**
     * Obtiene el precio final calculado para esta boleta.
     *
     * @return Precio final de la boleta.
     */
    public double getPrecioFinal() {
        return precioFinal;
    }
}

