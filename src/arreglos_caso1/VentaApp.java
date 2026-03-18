package arreglos_caso1;

public class VentaApp {

    public static void main(String args[]) {
        Venta v1 = new Venta(6);
        final int Descuento = 10;
        Producto p1 = new Producto("Mouse", 100.0);
        Producto p2 = new Producto("Play", 12000.0);
        Producto p3 = new Producto("Iphone 13", 14300.0);
        Producto p4 = new Producto("Crema", 60.0);
        Producto p5 = new Producto("Torta de chicharron en salsa verde", 34.0);
        Producto p6 = new Producto("Mono", 55500.0);
        Producto p7 = new Producto("Paleta Pallaso", 550.0);

        v1.setProducto(p1);
        v1.setProducto(p2);
        v1.setProducto(p3);
        v1.setProducto(p4);
        v1.setProducto(p5);
        v1.setProducto(p6);
        v1.setProducto(p7);

        System.out.println("--- -- - Descuento " + Descuento + "% - -- ---");
        v1.aplicarDescuento(Descuento);

        System.out.println(v1.toString());

    }
}
