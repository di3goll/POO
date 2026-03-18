
package arreglos_caso1;


public class Producto {
    // Atributos privados
    private String nombre;   // [1]
    private double precio;   // [2]
    
    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;  // [3]
        this.precio = precio;  // [4] 
    }
    
    // Getters
    public String getNombre() {
        return nombre;  // [5]
    }
    
    public double getPrecio() {
        return precio;   //[6]
    }
    
    // Setter para precio
    public void setPrecio(double precio) {
        this.precio = precio;     //[7]
    }
    
    // Método toString() sobrescrito
    @Override
    public String toString() {    // [8]
        return "Producto: " + nombre + " - $" + precio  ;  // [9]
    }
}