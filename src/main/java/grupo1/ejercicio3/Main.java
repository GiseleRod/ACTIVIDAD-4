package grupo1.ejercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Compra compra = new Compra();

        while (true) {

            System.out.print("Ingrese el nombre del producto o FIN para terminar: ");
            String nombre = scanner.nextLine();

            if (nombre.equalsIgnoreCase("FIN")) {
                break;
            }

            System.out.print("Ingrese el precio: $ ");
            double precio = Double.parseDouble(scanner.nextLine());

            Producto producto = new Producto(nombre, precio);
            compra.agregarProducto(producto);
        }

        compra.mostrarDetalle();

        scanner.close();
    }
}
