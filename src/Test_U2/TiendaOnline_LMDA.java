/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test_U2;

import java.util.Scanner;

/**
 *
 * @author di3go
 */
public class TiendaOnline_LMDA {

    public static Inventario_LMDA inventario = new Inventario_LMDA();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carrito_LMDA carrito = new Carrito_LMDA(4);
        int opcion;
        do {
            System.out.println("\n -- TIENDA ONLINE --");
            System.out.println("1. Ver catalogo");
            System.out.println("2. Agregar producto al carrito");
            System.out.println("3. Ver carrito");
            System.out.println("4. Calcular total");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    inventario.listarProductos();
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Ingrese el SKU del producto: ");
                    String sku = sc.nextLine();
                    Producto_LMDA p = inventario.buscarProducto(sku);
                    if (p == null) {
                        System.out.println("Producto No Encontrado");
                    }
                    System.out.println("Cantidad: ");
                    int cantidad = sc.nextInt();
                    carrito.agregarProducto(p, cantidad);
                    break;
                case 3:
                    carrito.mostrarCarrito();
                    break;
                case 4:
                    System.out.println("Total a pagar: $" + carrito.calcularTotal());
                    break;
                case 0:
                    System.out.println("Gracias por su visita");
                    break;
                default:
                    System.out.println("No valida");
            }

        } while (opcion != 0);
    }
}
