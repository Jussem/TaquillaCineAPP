/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCineAPP.Exception;

/**
 *
 * @author marti
 */
public class PeliculaNoEncontradaException extends RuntimeException {
    public PeliculaNoEncontradaException() {
        super("La película no se encuentra en la cartelera");
    }
}

