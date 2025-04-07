/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autnoma.taquillacineapp.main;
import autonoma.TaquillaCineAPP.models.Cine;
import autonoma.TaquillaCineAPP.models.Adulto;
import autonoma.TaquillaCineAPP.models.Boleta;
import autonoma.TaquillaCineAPP.models.Factura;
import autonoma.TaquillaCineAPP.models.Funcion;
import autonoma.TaquillaCineAPP.models.FuncionNoche;
import autonoma.TaquillaCineAPP.models.FuncionTarde;
import autonoma.TaquillaCineAPP.models.Mayor;
import autonoma.TaquillaCineAPP.models.Niño;
import autonoma.TaquillaCineAPP.models.Pelicula;
import autonoma.TaquillaCineAPP.models.PrimeraFuncion;
import autonoma.TaquillaCineAPP.models.Usuario;
import autonoma.TaquillaCineAPP.models.Venta;
/**
 *
 * @author juanb
 */
public class TaquillaCineAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear el cine
        Cine cine = new Cine(); 

        // Agregar películas a la cartelera
        Pelicula pelicula1 = new Pelicula("Spider-Man", 5000);
        Pelicula pelicula2 = new Pelicula("El Padrino", 7000);
        cine.agregarPelicula(pelicula1);
        cine.agregarPelicula(pelicula2);

        // Crear usuarios
        Usuario niño = new Niño("Carlos");
        Usuario adulto = new Adulto("Lucia");
        Usuario mayor = new Mayor("Don Pedro");

        // Agregar usuarios al sistema del cine
        cine.agregarUsuario(niño);
        cine.agregarUsuario(adulto);
        cine.agregarUsuario(mayor);

        // Crear funciones
        Funcion funcion1 = new PrimeraFuncion(); // 50% de descuento
        Funcion funcion2 = new FuncionTarde();   // 10% de descuento
        Funcion funcion3 = new FuncionNoche();   // 0% de descuento

        // Crear venta
        Venta venta = new Venta();

        // Crear boletas y agregarlas a la venta
        Boleta boleta1 = new Boleta(pelicula1, funcion1, niño);
        Boleta boleta2 = new Boleta(pelicula2, funcion2, adulto);
        Boleta boleta3 = new Boleta(pelicula1, funcion3, mayor);

        venta.agregarBoleta(boleta1);
        venta.agregarBoleta(boleta2);
        venta.agregarBoleta(boleta3);

        // Generar y mostrar la factura
        Factura factura = cine.venderBoletas(venta);
        System.out.println(factura.generarFactura(venta));
    }
    
    
}
