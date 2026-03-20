/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test_U2;

/**
 *
 * @author di3go
 */
public class Carrito_LMDA {

    private ItemInventario_LMDA[] items;
    private int contador;

    public Carrito_LMDA(int maxProductos) {
        items = new ItemInventario_LMDA[maxProductos];
        contador = 0;
    }
    
    public boolean agregarProducto(Producto_LMDA producto, int cantidad)
    {
        if (producto == null)return false;
        if (!TiendaOnline_LMDA.inventario.disminuirStock(producto.getSku(), cantidad)) {
            System.out.println("No hay suficientes existencias: " + producto.getNombre());
            return false;
        }
        for (int i = 0; i < contador; i++) {
            if (items[i].getProducto().getSku().equalsIgnoreCase(producto.getSku())) {
                items[i].aumentar(cantidad);
                System.out.println("Cantidad Actualizada: " + producto.getNombre());
                return true;
            }
        }
        items[contador++] = new ItemInventario_LMDA(producto, cantidad);
        System.out.println("Producto Agregado: " + producto.getNombre());
        return true;
    }
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < contador; i++) {
            total += items[i].calcular();
        }
        return total;
    }
    public void mostrarCarrito(){
        System.out.println("\n -- CONTENIDO DE EL CARRITO --");
        if (contador == 0) {
            System.out.println("Carrito vacio.");
            return;
        }
        for (int i = 0; i < contador; i++) {
            System.out.println(items[i]);
        }
        System.out.println("Total actual: $" + calcularTotal());
    }
}
