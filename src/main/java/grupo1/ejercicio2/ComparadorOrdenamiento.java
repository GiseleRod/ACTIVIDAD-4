package grupo1.ejercicio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ComparadorOrdenamiento {

    private final Random random = new Random();
    private final Cronometro cronometro = new Cronometro();

    public int[] generarNumeros(int cantidad) {

        int[] numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            numeros[i] = random.nextInt(100_000);
        }

        return numeros;
    }

    public List<Integer> crearArrayList(int[] numeros) {

        List<Integer> lista = new ArrayList<>();

        for (int numero : numeros) {
            lista.add(numero);
        }

        return lista;
    }

    public List<Integer> crearLinkedList(int[] numeros) {

        List<Integer> lista = new LinkedList<>();

        for (int numero : numeros) {
            lista.add(numero);
        }

        return lista;
    }

    public long ordenarArray(int[] numeros) {

        // La copia se hace antes de iniciar el cronómetro,
        // porque queremos medir solamente el ordenamiento.
        int[] copia = Arrays.copyOf(numeros, numeros.length);

        cronometro.reset();
        cronometro.empezar();

        Arrays.sort(copia);

        cronometro.finalizar();

        return cronometro.obtenerTiempo();
    }

    public long ordenarArrayList(List<Integer> numeros) {

        List<Integer> copia = new ArrayList<>(numeros);

        cronometro.reset();
        cronometro.empezar();

        copia.sort(null);

        cronometro.finalizar();

        return cronometro.obtenerTiempo();
    }

    public long ordenarLinkedList(List<Integer> numeros) {

        List<Integer> copia = new LinkedList<>(numeros);

        cronometro.reset();
        cronometro.empezar();

        copia.sort(null);

        cronometro.finalizar();

        return cronometro.obtenerTiempo();
    }
}
