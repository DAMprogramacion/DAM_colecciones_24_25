package ejercicios.ejercicio4;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> cadenas = ColeccionDinamica.leerCadenas();
        System.out.println(cadenas);
        List<String> cadenasMayorLongitud = ColeccionDinamica.obtenerCadenasMasLargas(cadenas);

    }
}
