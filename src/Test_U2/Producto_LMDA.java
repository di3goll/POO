/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test_U2;


/**
 *
 * @author di3go
 */
public class Producto_LMDA {

    private String sku, nombre, descripcion;
    private double precio;

    public Producto_LMDA(String sku, String nombre, String descripcion, double precio) {
        this.sku = sku;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getSku() {
        return sku;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return sku + " | " + nombre + " - " + descripcion + " | $" + String.format("%.2f", precio);
    }

}
