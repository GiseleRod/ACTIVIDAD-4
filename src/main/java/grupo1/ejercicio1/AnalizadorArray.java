package grupo1.ejercicio1;

public class AnalizadorArray {

    private final int[] numeros;

    public AnalizadorArray(int[] numeros) {
        this.numeros = numeros;
    }

    public ResultadoExtremo buscarMaximo() {

        int max = numeros[0];
        int pos = 0;

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
                pos = i;
            }
        }

        return new ResultadoExtremo(max, pos);
    }

    public ResultadoExtremo buscarMinimo() {

        int min = numeros[0];
        int pos = 0;

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
                pos = i;
            }
        }

        return new ResultadoExtremo(min, pos);
    }
}

