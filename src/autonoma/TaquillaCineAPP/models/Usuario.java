/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCineAPP.models;

import autonoma.TaquillaCineAPP.Exception.UsuarioNoRegistradoException;

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

    public void eliminarUsuario(Usuario usuario) {
    if (!usuario.contains(usuario)) {
        throw new UsuarioNoRegistradoException();
    }
    usuario.remove(usuario);
}
    
    public abstract double calcularPorcentajeDescuento();
}

