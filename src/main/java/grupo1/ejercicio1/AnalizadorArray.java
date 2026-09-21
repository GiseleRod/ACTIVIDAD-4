
package ejercicio1;

public class AnalizadorArray {
    private int[] lista;

    public AnalizadorArray(int[] lista) {
        this.lista = lista;
    }

    public int[] buscarMaximo() {
        int max = lista[0];
        int pos = 0;
        for (int i = 1; i < lista.length; i++) {
            if (lista[i] > max) {
                max = lista[i];
                pos = i;
            }
        }
        return new int[]{max, pos};
    }

    public int[] buscarMinimo() {
        int min = lista[0];
        int pos = 0;
        for (int i = 1; i < lista.length; i++) {
            if (lista[i] < min) {
                min = lista[i];
                pos = i;
            }
        }
        return new int[]{min, pos};
    }
}

