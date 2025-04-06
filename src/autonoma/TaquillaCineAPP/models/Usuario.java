/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCineAPP.models;

import autonoma.TaquillaCineAPP.Exception.UsuarioNoRegistradoException;
import java.util.ArrayList;

/**
 * Clase abstracta que representa a un usuario del sistema del cine.
 * Define los atributos y comportamientos comunes a todos los tipos de usuarios,
 * como su nombre y el método para calcular el porcentaje de descuento aplicable.
 * 
 * También provee una lógica para eliminar al usuario de una lista de usuarios
 * si coincide por nombre. En caso de no encontrarse, lanza una excepción personalizada.
 * 
 * @author juanb
 * @version 20250405
 * @since 1.0
 * @see UsuarioNoRegistradoException
 */
public abstract class Usuario {

    /** Nombre del usuario */
    private String nombre;

    /**
     * Crea un nuevo usuario con el nombre especificado.
     *
     * @param nombre Nombre del usuario.
     */
    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Retorna el nombre del usuario.
     * 
     * @return Nombre actual del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para el usuario.
     * 
     * @param nombre Nuevo nombre a asignar.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Elimina este usuario de la lista proporcionada si existe una coincidencia por nombre.
     * 
     * @param listaUsuarios Lista de usuarios donde se intentará eliminar este usuario.
     * @throws UsuarioNoRegistradoException Si no se encuentra el usuario en la lista.
     */
    public void eliminarUsuario(ArrayList<Usuario> listaUsuarios) {
        boolean encontrado = false;

        for (Usuario u : listaUsuarios) {
            if (u.getNombre().equalsIgnoreCase(this.getNombre())) {
                listaUsuarios.remove(u);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            throw new UsuarioNoRegistradoException();
        }
    }

    /**
     * Método abstracto que debe ser implementado por las subclases
     * para definir el porcentaje de descuento aplicable a cada tipo de usuario.
     * 
     * @return Porcentaje de descuento como valor decimal.
     */
    public abstract double calcularPorcentajeDescuento();
}


