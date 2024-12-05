package ejercicios.ejercicio4;

import java.util.*;

public class ColeccionDinamica {
    public static List<String> leerCadenas() {
        List<String> cadenas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String cadena = "";
        do {
            System.out.println("Introduce una cadena, fin ó FIN para terminar");
            cadena = sc.nextLine();
            cadenas.add(cadena);
            //} while (! (cadena.equals("FIN") || cadena.equals("fin")));
        } while (! cadena.equalsIgnoreCase("fin"));
            sc.close();
        cadenas.remove(cadenas.size() - 1);
        return cadenas;
    }

    public static List<String> obtenerCadenasMasLargas(List<String> cadenas) {
        List<String> cadenasMasLargas = new ArrayList<>();
        int longitudCadena = 0;
        for (String cadena : cadenas) {
            if (cadena.length() == longitudCadena) {
                cadenasMasLargas.add(cadena);  //añadimos otra cadena de igual longitud
            } else if (cadena.length() > longitudCadena) {
                longitudCadena = cadena.length();  //nueva longitud de cadena mas grande
                cadenasMasLargas.clear();  //vaciamos las cadenas de menor longitud
                cadenasMasLargas.add(cadena);  //añadimos la nueva cadena de mayor longitud
            }
        }
        return cadenasMasLargas;
    }

    public static boolean contieneCadena(List<String> cadenas, String cadena) {
        return cadenas.contains(cadena);
    }

    public static List<String> unirListas(List<String> cadenasAuxiliares, List<String> cadenas) {
        /*for (String cadena : cadenas)
            cadenasAuxiliares.add(cadena);*/
        cadenasAuxiliares.addAll(cadenas);
        return cadenasAuxiliares;
    }

    public static Set<String> unirListasDisjunto(List<String> cadenasAuxiliares, List<String> cadenas) {
        Set<String> conjunto = new HashSet<>();
        /*for (String cadena : cadenasAuxiliares)
            conjunto.add(cadena);
        for (String cadena : cadenas)
            conjunto.add(cadena);*/
        conjunto.addAll(cadenasAuxiliares);
        conjunto.addAll(cadenas);
        return conjunto;
    }
}








