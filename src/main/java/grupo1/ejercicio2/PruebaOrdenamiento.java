package grupo1.ejercicio2;

import java.util.List;

public class PruebaOrdenamiento {

    private static final int REPETICIONES = 10;

    private final int[] tamanios = {
            100,
            1_000,
            10_000,
            100_000
    };

    private final ComparadorOrdenamiento comparador;

    public PruebaOrdenamiento() {
        comparador = new ComparadorOrdenamiento();
    }

    public void ejecutar() {

        calentarJVM();

        mostrarEncabezado();

        for (int tamanio : tamanios) {

            int[] numeros =
                    comparador.generarNumeros(tamanio);

            List<Integer> arrayList =
                    comparador.crearArrayList(numeros);

            List<Integer> linkedList =
                    comparador.crearLinkedList(numeros);

            double tiempoArray =
                    promedioArray(numeros);

            double tiempoArrayList =
                    promedioArrayList(arrayList);

            double tiempoLinkedList =
                    promedioLinkedList(linkedList);

            mostrarResultado(
                    tamanio,
                    tiempoArray,
                    tiempoArrayList,
                    tiempoLinkedList
            );
        }
    }

    private void calentarJVM() {

        int[] numeros =
                comparador.generarNumeros(10_000);

        List<Integer> arrayList =
                comparador.crearArrayList(numeros);

        List<Integer> linkedList =
                comparador.crearLinkedList(numeros);

        for (int i = 0; i < REPETICIONES; i++) {

            comparador.ordenarArray(numeros);
            comparador.ordenarArrayList(arrayList);
            comparador.ordenarLinkedList(linkedList);
        }
    }

    private double promedioArray(int[] numeros) {

        long total = 0;

        for (int i = 0; i < REPETICIONES; i++) {
            total += comparador.ordenarArray(numeros);
        }

        return nanosegundosAMilisegundos(
                total / (double) REPETICIONES
        );
    }

    private double promedioArrayList(
            List<Integer> numeros) {

        long total = 0;

        for (int i = 0; i < REPETICIONES; i++) {
            total += comparador.ordenarArrayList(numeros);
        }

        return nanosegundosAMilisegundos(
                total / (double) REPETICIONES
        );
    }

    private double promedioLinkedList(
            List<Integer> numeros) {

        long total = 0;

        for (int i = 0; i < REPETICIONES; i++) {
            total += comparador.ordenarLinkedList(numeros);
        }

        return nanosegundosAMilisegundos(
                total / (double) REPETICIONES
        );
    }

    private double nanosegundosAMilisegundos(
            double nanosegundos) {

        return nanosegundos / 1_000_000.0;
    }

    private void mostrarEncabezado() {

        System.out.printf(
                "%-12s %-15s %-17s %-17s%n",
                "Elementos",
                "Array (ms)",
                "ArrayList (ms)",
                "LinkedList (ms)"
        );
    }

    private void mostrarResultado(
            int tamanio,
            double array,
            double arrayList,
            double linkedList) {

        System.out.printf(
                "%-12d %-15.6f %-17.6f %-17.6f%n",
                tamanio,
                array,
                arrayList,
                linkedList
        );
    }
}
