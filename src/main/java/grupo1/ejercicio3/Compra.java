package grupo1.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    private final List<Producto> productos;

    public Compra() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularTotal() {

        double total = 0;

        for (Producto producto : productos) {
            total += producto.getPrecio();
        }

        return total;
    }

    public void mostrarDetalle() {

        System.out.println("\n--- Productos escaneados ---");

        for (Producto producto : productos) {
            System.out.printf(
                    "%-20s $ %.2f%n",
                    producto.getNombre(),
                    producto.getPrecio()
            );
        }

        System.out.printf(
                "%nTOTAL: $ %.2f%n",
                calcularTotal()
        );
    }
}
