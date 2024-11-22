package videos.listas;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Ejemplo4 {
    public static void main(String[] args) {
        long[] numeros = new long[5];
        System.out.println (numeros);
        System.out.println ( Arrays.toString ( numeros ) );
        Arrays.fill ( numeros, 6 );
        System.out.println ( Arrays.toString ( numeros ) );
        numeros[0] = 9;
        numeros[numeros.length - 1] = 1;
        System.out.println ( Arrays.toString ( numeros ) );
        Arrays.sort ( numeros );
        System.out.println ( Arrays.toString ( numeros ) );
        System.out.printf ( "El elemento más pequeño del array es %d%n", numeros[0] );
        System.out.printf ( "El elemento más grande del array es %d%n", numeros[numeros.length - 1] );
        System.out.println ( "=========================" );
        List<Integer> enteros = new ArrayList<> (List.of(5, 4, 2, -3, 25, 0));
        enteros.add ( 5 );
        System.out.println ( enteros );
        int maximo = Collections.max ( enteros );
        System.out.printf ( "El valor máximo de la colección vale: %d%n", maximo );
        int minimo = Collections.min ( enteros );
        System.out.printf ( "El valor máximo de la colección vale: %d%n", minimo );
        Collections.sort ( enteros );
        System.out.println (enteros);
        System.out.printf ( "El valor máximo de la colección vale: %d%n", enteros.get ( enteros.size () - 1 ) );
        System.out.printf ( "El valor máximo de la colección vale: %d%n", enteros.get ( 0 ) );
        int frecuencia5 = Collections.frequency ( enteros, 5 );
        System.out.printf ( "El nº 5 se repite %d veces %n", frecuencia5 );

    }
}
