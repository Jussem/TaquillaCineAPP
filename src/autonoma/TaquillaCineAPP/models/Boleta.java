/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCineAPP.models;

/**
 *
 * @author juanb
 */
public class Boleta {
    private Pelicula pelicula;
    private Funcion funcion;
    private Usuario usuario;
    private double costoFinal;

    public Boleta(Pelicula pelicula, Funcion funcion, Usuario usuario, double costoFinal) {
        this.pelicula = pelicula;
        this.funcion = funcion;
        this.usuario = usuario;
        this.costoFinal = costoFinal;
    }
    
    public double calcularCostoFinal() throws ExcepcionValorNegativo{
    double costoBase = pelicula.getCostoBase();
        double descuentoFuncion = funcion.getDescuento();
        double descuentoUsuario = usuario.getTipo().getDescuento();
        
        costoFinal = costoBase - descuentoFuncion * costoBase - descuentoUsuario;

        if (costoFinal < 0) {
            throw new ExcepcionValorNegativo("El costo final no puede ser negativo.");
        }

        return costoFinal; 
    }

    public double getCostoFinal() {
        return costoFinal;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
}
