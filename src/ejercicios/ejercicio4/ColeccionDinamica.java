package ejercicios.ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        //falta el código
        return cadenasMasLargas;
    }
}
