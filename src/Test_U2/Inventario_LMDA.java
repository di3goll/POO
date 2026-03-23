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
    
    private static final int MAX_ITEMS = 10;
    private ItemInventario_LMDA[] items;

    public Inventario_LMDA() {
        items = new ItemInventario_LMDA[MAX_ITEMS];
        cargarCatalogo();
    }

    private void cargarCatalogo() {
        items[0] = new ItemInventario_LMDA(new Producto_LMDA("F1-P001", "Neumatico Blando", "Pirelli P Zero Rojo - Maximo agarre", 12500.00), 12);
        items[1] = new ItemInventario_LMDA(new Producto_LMDA("F1-P002", "Aleron Delantero", "Fibra de carbono - Alta carga aerodinamica", 45000.00), 3);
        items[2] = new ItemInventario_LMDA(new Producto_LMDA("F1-P003", "Volante Pro", "Display LED y 25 botones configurables", 32000.00), 5);
        items[3] = new ItemInventario_LMDA(new Producto_LMDA("F1-P004", "Casco Replica", "Certificacion FIA - Diseno Red Bull Racing", 18000.00), 8);
        items[4] = new ItemInventario_LMDA(new Producto_LMDA("F1-P005", "Unidad de Potencia", "Motor V6 Turbo Hibrido 1.6L", 150000.00), 2);
        items[5] = new ItemInventario_LMDA(new Producto_LMDA("F1-P006", "Guantes Ignifugos", "Proteccion Nomex - Estilo Mercedes AMG", 2500.00), 20);
        items[6] = new ItemInventario_LMDA(new Producto_LMDA("F1-P007", "Disco de Freno", "Ceramica de carbono para frenadas extremas", 9500.00), 15);
        items[7] = new ItemInventario_LMDA(new Producto_LMDA("F1-P008", "Tuerca de Rueda", "Aluminio aeroespacial - Cambio en 1.8s", 850.00), 50);
        items[8] = new ItemInventario_LMDA(new Producto_LMDA("F1-P009", "Aceite Sintetico", "Lubricante de alto rendimiento Petronas", 1200.00), 30);
        items[9] = new ItemInventario_LMDA(new Producto_LMDA("F1-P010", "Camara On-Board", "Transmision 4K para telemetria", 5500.00), 10);
    }

    public ItemInventario_LMDA buscarItem(String sku) {
        for (ItemInventario_LMDA item : items) {
            if (item != null) {
                String skuEnInventario = item.getProducto().getSku();
                if (skuEnInventario.equalsIgnoreCase(sku)) {
                    return item;
                }
            }
        }
        return null;
    }

    public boolean disminuirStock(String sku, int cantidad) {
        ItemInventario_LMDA item = buscarItem(sku);
        if (item == null) {
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
