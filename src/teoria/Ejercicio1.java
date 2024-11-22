package teoria;

import java.util.Arrays;
import java.util.Scanner;

//programa que lee 10 nº enteros
//y nos dice cuanto nº hay por debajo de la media
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] datos = new int[10];
        for (int i = 0; i < datos.length; i++) {
            System.out.println("Introduce nº");
            datos[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(datos));
        int numero = calcularValoresPorDebajoMedia(datos);
        System.out.printf("%d valores por debajo de la media%n", numero);
    }

    private static int calcularValoresPorDebajoMedia(int[] datos) {
        double media = calcularMedia(datos);
        int contador = 0;
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] < media)
                contador++;
        }
        return contador;
    }

    private static double calcularMedia(int[] datos) {
        double suma = 0;
        for (int i = 0; i < datos.length; i++) {
            suma += datos[i];
        }
        return suma / datos.length;
    }
}
