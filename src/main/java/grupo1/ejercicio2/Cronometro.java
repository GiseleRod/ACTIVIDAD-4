package grupo1.ejercicio2;

public class Cronometro {

    private long inicio;
    private long fin;

    public void empezar() {
        inicio = System.nanoTime();
    }

    public void finalizar() {
        fin = System.nanoTime();
    }

    public void reset() {
        inicio = 0;
        fin = 0;
    }

    public long obtenerTiempo() {
        return fin - inicio;
    }
}
