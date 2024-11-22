package videos.arrays;

import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        System.out.println ("Introduce cinco datos enteros");
        int numero1 = scanner.nextInt ();
        int numero2 = scanner.nextInt ();
        int numero3 = scanner.nextInt ();
        int numero4 = scanner.nextInt ();
        int numero5 = scanner.nextInt ();
        int numero6 = scanner.nextInt ();

        int suma1 = sumarEnteros(numero1, numero2, numero3, numero4, numero5, numero6);
        System.out.printf ( "La suma de esos cinco valores vale: %d%n", suma1 );
        ///////////////////////////////////////////////////////////////////////////
        System.out.println ("======================================");
        System.out.println ("Introduce cinco datos enteros");
        int[] numeros = new int[6];
        for ( int i = 0; i < numeros.length; i++ ) {
            numeros[i] = scanner.nextInt ();
        }
        int suma2 = sumarEnteros ( numeros );

        System.out.printf ( "La suma de esos cinco valores vale: %d%n", suma2 );

    }

    private static int sumarEnteros(int[] numeros) {
        int suma = 0;
        for ( int i = 0; i < numeros.length; i++ ) {
            suma += numeros[i];
        }
        return suma;
    }

    private static int sumarEnteros(int numero1, int numero2, int numero3, int numero4,
                                    int numero5, int numero6) {
        return numero1 + numero2 + numero3 + numero4 + numero5 +numero6;
    }
}
