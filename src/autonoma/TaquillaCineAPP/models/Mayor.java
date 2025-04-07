/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCineAPP.models;

/**
 * Representa a un usuario de tipo adulto mayor en el sistema del cine.
 * Los adultos mayores tienen derecho a un descuento especial aplicado
 * al precio de sus boletas.
 * 
 * Esta clase extiende de {@link Usuario} e implementa el método para calcular
 * el porcentaje de descuento aplicable a este tipo de usuario.
 * 
 * @author marti
 * @version 20250405
 * @since 1.0
 * @see Usuario
 */
public class Mayor extends Usuario {

    /**
     * Crea un nuevo usuario de tipo adulto mayor con el nombre especificado.
     *
     * @param nombre Nombre del usuario adulto mayor.
     */
    public Mayor(String nombre) {
        super(nombre);
    }

    /**
     * Calcula el porcentaje de descuento aplicable a un adulto mayor.
     *
     * @return Descuento aplicado como valor decimal (1000.0 en este caso).
     */
    public double calcularPorcentajeDescuento() {
        return 1000.0;
    }
}

