package ejercicios.ejercicio2;

import java.util.Arrays;

public class Colecciones {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int array2[] = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = 3;
        }
        System.out.println(Arrays.toString(array1));
        Arrays.fill(array2, 5);
        System.out.println(Arrays.toString(array2));
        mostrarArrays(array1, array2);

    }

    private static void mostrarArrays(int[] array1, int[] array2) {
        System.out.printf("%S %s %s%n", "posición", "array1", "array2");
        for (int i = 0; i < array1.length; i++) {
            System.out.printf("%4d %7d %7d%n", i + 1 , array1[i], array2[i]);
        }
    }
}
