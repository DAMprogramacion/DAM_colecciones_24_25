package teoria;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        float[] floats = new float[10];
        System.out.printf("Valor de la posción 0: %.2f%n", floats[0]);
        System.out.printf("Valor de la posción 5: %.2f%n", floats[5]);
        System.out.printf("Valor de la posción 0: %.2f%n", floats[9]);

        boolean[] booleans = new boolean[10];
        System.out.printf("Valor de la posción 0: %B%n", booleans[0]);
        System.out.printf("Valor de la posción 5: %B%n", booleans[5]);
        System.out.printf("Valor de la posción 0: %B%n", booleans[9]);

        floats[7] = 3.1f;  floats[6] = 2.2f; floats[0] = 1.1f;
        System.out.printf("Valor de la posción 0: %.2f%n", floats[0]);
        System.out.printf("Valor de la posción 5: %.2f%n", floats[6]);
        System.out.printf("Valor de la posción 0: %.2f%n", floats[7]);

        booleans[1] = 3 > 0; booleans[2] = true; booleans[9] = true;
        System.out.printf("Valor de la posción 0: %B%n", booleans[1]);
        System.out.printf("Valor de la posción 5: %B%n", booleans[2]);
        System.out.printf("Valor de la posción 0: %B%n", booleans[9]);

        for (int i = 0; i < floats.length; i++) {
            System.out.printf("Valor de la posción %d: %.2f%n",i, floats[i]);
        }
        System.out.println("==========================");
        System.out.println(booleans);
        System.out.println(Arrays.toString(booleans));

        int[] enteros = new int[10];
        rellenarAleatoriamente(enteros);
        System.out.println(Arrays.toString(enteros));

        System.out.println("**********************");
        Persona[] personas = new Persona[3];
        System.out.println(Arrays.toString(personas));
       // personas[0].edad(); NullPointerException porque en la pila se ha almacenado un null
        personas[0] = new Persona("joaquin medina", 18);
        personas[1] = new Persona("antonia lendinez", 15);
        System.out.println(Arrays.toString(personas));
        System.out.println(personas[0].edad());
    }

    private static void rellenarAleatoriamente(int[] enteros) {
        Random random = new Random();
        for (int i = 0; i < enteros.length; i++) {
            int valor = random.nextInt(100);
            enteros[i] = valor;
        }
    }
}








