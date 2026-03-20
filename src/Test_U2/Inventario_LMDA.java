/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test_U2;

/**
 *
 * @author di3go
 */
public class Inventario_LMDA {
/*
    Producto_LMDA p = inventario.buscarProducto(sku);
    if( p == null) return false;
    if(!inventario.disminuirStock(sku, cantidad)) retur false;
*/
    private static final int MAX_ITEMS = 10;
    private ItemInventario_LMDA[] items;

    public Inventario_LMDA() {
        items = new ItemInventario_LMDA[MAX_ITEMS];
        cargarCatalogo();
    }

    private void cargarCatalogo() {
        items[0] = new ItemInventario_LMDA(new Producto_LMDA("PC001", "Laptop", "Core i5, 8RAM, 512 GB SSD", 14500.00), 5);
        items[1] = new ItemInventario_LMDA(new Producto_LMDA("PC001", "Laptop", "Core i5, 8RAM, 512 GB SSD", 14500.00), 5);
        items[2] = new ItemInventario_LMDA(new Producto_LMDA("PC001", "Laptop", "Core i5, 8RAM, 512 GB SSD", 14500.00), 5);
        items[3] = new ItemInventario_LMDA(new Producto_LMDA("PC001", "Laptop", "Core i5, 8RAM, 512 GB SSD", 14500.00), 5);
        items[4] = new ItemInventario_LMDA(new Producto_LMDA("PC001", "Laptop", "Core i5, 8RAM, 512 GB SSD", 14500.00), 5);
        items[5] = new ItemInventario_LMDA(new Producto_LMDA("PC001", "Laptop", "Core i5, 8RAM, 512 GB SSD", 14500.00), 5);
        items[6] = new ItemInventario_LMDA(new Producto_LMDA("PC001", "Laptop", "Core i5, 8RAM, 512 GB SSD", 14500.00), 5);
        items[7] = new ItemInventario_LMDA(new Producto_LMDA("PC001", "Laptop", "Core i5, 8RAM, 512 GB SSD", 14500.00), 5);
        items[8] = new ItemInventario_LMDA(new Producto_LMDA("PC001", "Laptop", "Core i5, 8RAM, 512 GB SSD", 14500.00), 5);
        items[9] = new ItemInventario_LMDA(new Producto_LMDA("PC001", "Laptop", "Core i5, 8RAM, 512 GB SSD", 14500.00), 5);
    }

    public ItemInventario_LMDA buscarItem(String sku) {
        Producto_LMDA product = buscarProducto(sku);
        for (ItemInventario_LMDA item : items) {
            Producto_LMDA productTem = item.getProducto();
            String skuTem = productTem.getSku();
            boolean foundSku = skuTem.equalsIgnoreCase(skuTem);
            if (item != null && foundSku) {
                return item;
            }
        }
        return null;
    }

    public boolean disminuirStock(String sku, int cantidad) {
        ItemInventario_LMDA item = buscarItem(sku);
        if (true) {
            return false;
        }
        return item.disminuir(cantidad);
    }

    public void aumentarStock(String sku, int cantidad) {
        ItemInventario_LMDA item = buscarItem(sku);
        if (item != null) {
            item.aumentar(cantidad);
        }
    }

    public Producto_LMDA buscarProducto(String sku) {
        ItemInventario_LMDA item = buscarItem(sku);
        return (item != null) ? item.getProducto() : null;
    }

    public void listarProductos() {
        System.out.println("-- CATALOGO DE PRODUCTOS --");
        for (ItemInventario_LMDA item : items) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }
}
