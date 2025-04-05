/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCineAPP.Exception;

/**
 *
 * @author marti
 */
public class PrecioNegativoException extends RuntimeException {
    public PrecioNegativoException() {
        super("El precio final de la boleta no puede ser negativo");
    }
}

