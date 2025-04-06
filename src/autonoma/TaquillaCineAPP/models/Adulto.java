/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCineAPP.models;

/**
 * Representa un usuario adulto dentro del sistema.
 * Este tipo de usuario no cuenta con descuento en la compra de boletas.
 *
 * @author marti
 * @version 20250405
 * @since 1.0
 * @see Usuario
 */
class Adulto extends Usuario {

    /**
     * Crea un nuevo usuario adulto con el nombre especificado.
     *
     * @param nombre Nombre del usuario adulto.
     */
    public Adulto(String nombre) {
        super(nombre);
    }

    /**
     * Calcula el porcentaje de descuento aplicable al usuario adulto.
     * Los adultos no tienen descuento, por lo tanto retorna 0.0.
     *
     * @return Porcentaje de descuento como valor decimal (0.0 representa 0%).
     */
    public double calcularPorcentajeDescuento() {
        return 0.0;
    }
}

