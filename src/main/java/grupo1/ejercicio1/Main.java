
package ejercicio1;

public class Main {
    public static void main(String[] args) {
        MiArray miArray = new MiArray(1000);
        miArray.llenarArray();

        AnalizadorArray analizador = new AnalizadorArray(miArray.getLista());

        int[] maximo = analizador.buscarMaximo();
        int[] minimo = analizador.buscarMinimo();

        System.out.println("\nEl número más alto: " + maximo[0] + " en la posición: " + maximo[1]);
        System.out.println("El número más bajo: " + minimo[0] + " en la posición: " + minimo[1]);
    }
}

