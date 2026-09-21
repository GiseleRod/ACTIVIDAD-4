package grupo1.ejercicio1;

public class Main {

    public static void main(String[] args) {

        MiArray miArray = new MiArray(1000);
        miArray.llenarArray();

        AnalizadorArray analizador = new AnalizadorArray(miArray.getNumeros());

        ResultadoExtremo maximo = analizador.buscarMaximo();
        ResultadoExtremo minimo = analizador.buscarMinimo();

        System.out.println(
                "El número más alto es: " + maximo.getValor() + ", en la posición: " + maximo.getPosicion()
        );

        System.out.println(
                "El número más bajo es: " + minimo.getValor() + ", en la posición: " + minimo.getPosicion()
        );
    }
}

