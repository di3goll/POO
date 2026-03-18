package arreglos_caso1;

public class Venta {

    private Producto[] productos;

    public Venta(int CantMax) {
        this.productos = new Producto[CantMax];
    }

    // Métodos para establecer productos
    public void setProducto(Producto producto) {
        if (producto == null) {  //   [14]
            System.out.println("Error: El producto no puede ser null");
            return;
        }

        for (int i = 0; i < productos.length; i++) {
            // Si encontramos una casilla vacía (null)...
            if (productos[i] == null) {
                // [15] Guardamos el objeto en esa posición
                productos[i] = producto;

                // Usamos return para salir del método inmediatamente
                // ya que el producto ya fue acomodado.
                return;
            }
        }
        int ProducExeso = (contarProductos()+1) - productos.length;
        System.out.println("---- ALERTA "+ProducExeso+" PRODUCTOS EXTRA----\nProductos Creados: " + (contarProductos()+1)+"  -- Limite De "+ productos.length +" --\n- - - - - - - -\n\n");
    }

    // Método para calcular el total
    public double calcularTotal() {
        double total = 0;

        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null) {  // [20]
                total += productos[i].getPrecio();  //[21]
            }

        }
        return total;   // [24]
    }

    // Método para aplicar descuento
    public void aplicarDescuento(double porcentaje) {
        double factor = 1 - (porcentaje / 100);

        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null) {
                double nuevoPrecio = productos[i].getPrecio() * factor;   // [25]
                productos[i].setPrecio(nuevoPrecio);  // [26]
            }
        }
    }

    // Método para contar productos
    public int contarProductos() {
        int contador = 0;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null) {
                contador++;  // [31]
            }
        }
        return contador;   // [33]
    }

    // Método toString simplificado (SIN StringBuilder)
    @Override
    public String toString() {
        String resultado = "=== FACTURA ===\n";

        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null) {
                resultado = resultado + (i+1) +". "+ productos[i].toString() + "\n";   // [34]
            }
        }

        resultado = resultado + "Total productos: " + contarProductos() + "\n";
        resultado = resultado + "TOTAL A PAGAR: $" + calcularTotal();

        return resultado;   // [36]
    }
}
