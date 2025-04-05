/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TaquillaCineAPP.models;

/**
 *
 * @author juanb
 */
class Pelicula {
    private String nombre;
    private float costoBase;

    public Pelicula(String nombre, float costoBase) {
        this.nombre = nombre;
        this.costoBase = costoBase;
    }

    public String getNombre() {
        return nombre;
    }

    public float getCostoBase() {
        return costoBase;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCostoBase(float costoBase) {
        this.costoBase = costoBase;
    }
}
