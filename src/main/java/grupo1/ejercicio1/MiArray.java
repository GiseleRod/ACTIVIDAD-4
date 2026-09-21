
package ejercicio1;

import java.util.Random;

public class MiArray {
    private int[] lista;
    private Random random;

    public MiArray(int tamaño) {
        lista = new int[tamaño];
        random = new Random();
    }

    public void llenarArray() {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = random.nextInt(1000) + 1;
        }
    }

    public void imprimirArray() {
        for (int i = 0; i < lista.length; i++) {
            System.out.println("El número: " + lista[i] + " está en la posición: " + i);
        }
    }

    public int[] getLista() {
        return lista.clone();
    }
}

