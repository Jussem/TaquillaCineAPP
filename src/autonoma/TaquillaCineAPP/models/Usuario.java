/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCineAPP.models;

import autonoma.TaquillaCineAPP.Exception.UsuarioNoRegistradoException;
import java.util.ArrayList;

/**
 *
 * @author juanb
 */
public abstract class Usuario {
    private String nombre;
    
    public Usuario(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

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

    public abstract double calcularPorcentajeDescuento();
}

