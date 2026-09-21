package grupo1.ejercicio1;

import java.util.Random;

public class MiArray {

    private final int[] numeros;
    private final Random random;

    public MiArray(int cantidad) {
        numeros = new int[cantidad];
        random = new Random();
    }

    public void llenarArray() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(1000) + 1;
        }
    }

    public int[] getNumeros() {
        return numeros.clone();
    }
}
