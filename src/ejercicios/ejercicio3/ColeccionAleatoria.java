package ejercicios.ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ColeccionAleatoria {
    public static int[] crearArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }
        return array;
    }

    public static double calcularValorMedio(int[] datos) {
        double suma = 0;
        for (int numero : datos)
            suma += numero;
        return suma / datos.length;
    }

    public static List<Integer> obtenerValoresPares(int[] datos) {
        List<Integer> pares = new ArrayList<>();
        for (int numero : datos)
            if (numero % 2 == 0)
                pares.add(numero);
        return pares;
    }

    public static int[] obtenerMenorMayor(int[] datos) {
        int[] menorMayor = new int[2];
        menorMayor[0] = datos[0];
        menorMayor[1] = datos[datos.length - 1];
        return menorMayor;
    }
}
