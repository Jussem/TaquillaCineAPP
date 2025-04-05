/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCineAPP.Exception;

/**
 *
 * @author marti
 */
public class UsuarioNoRegistradoException extends RuntimeException {
    public UsuarioNoRegistradoException() {
        super("El usuario no está registrado en el sistema");
    }
}

