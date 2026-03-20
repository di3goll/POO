/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test_U2;

/**
 *
 * @author di3go
 */
public class ItemInventario_LMDA {

    private Producto_LMDA producto;
    private int existencias;

    public ItemInventario_LMDA(Producto_LMDA producto, int existencias) {
        this.producto = producto;
        this.existencias = existencias;
    }

    public Producto_LMDA getProducto() {
        return producto;
    }
    
    public int getExistencias() {
        return existencias;
    }
    
    public void aumentar(int cantidad)
    {
        existencias += cantidad;
    }
    public boolean disminuir(int cantidad)
    {
        if (existencias >= cantidad)
        {
            existencias -= cantidad;
            return true;
        }
        return false;
    }
    
    @Override
    public String toString()
    {
        return producto.toString() + " |Stock: " + existencias;
    }
}
