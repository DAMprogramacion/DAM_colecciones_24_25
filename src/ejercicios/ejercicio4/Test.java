package ejercicios.ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        List<String> cadenas = ColeccionDinamica.leerCadenas();
        System.out.println(cadenas);
        List<String> cadenasMayorLongitud = ColeccionDinamica.obtenerCadenasMasLargas(cadenas);
        System.out.println("Cadenas de mayor longitud:");
        System.out.println(cadenasMayorLongitud);
        String cadena = "hello";
        boolean contiene = ColeccionDinamica.contieneCadena(cadenas, cadena);
        String mensaje = contiene ? "si" : "no";
        System.out.printf("La cadena %s %S está en la colección%n", cadena, mensaje);
        List<String> cadenasAuxiliares = new ArrayList<>(List.of("uno", "dos", "tres", "cuatro"));
        List<String> listaUnion = ColeccionDinamica.unirListas(cadenasAuxiliares, cadenas);
        System.out.println("uniendo listas");
        System.out.println(listaUnion);
        Set<String> conjuntoUnion = ColeccionDinamica.unirListasDisjunto(cadenasAuxiliares, cadenas);
        System.out.println("uniendo listas disjunto");
        System.out.println(conjuntoUnion);

    }
}
