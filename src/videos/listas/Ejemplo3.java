package videos.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejemplo3 {
    public static void main(String[] args) {
        List<Double> numeros = Arrays.asList ( 0.0, 1.1, 2.2, 3.3 );
       // numeros.add ( 4.4 );
        for ( int i = 0; i < numeros.size (); i++ ) {
            System.out.printf ( "Posición %d: %.2f%n", i, numeros.get ( i ) );
        }
        System.out.println ("========================");
        for ( Double numero : numeros )
            System.out.printf ( "Numero: %.2f%n", numero );
        System.out.println ("========================");
        numeros.forEach ( System.out::println );
        System.out.println ("========================");
        System.out.println (numeros);
        System.out.println ("========================");
        List<Float> floats = List.of (4.4f, 5.5f, 6.6f);
      //  floats.add ( 7.7f );
        floats.forEach ( System.out::println );
        System.out.println ("========================");
        List<Float> floats1 = new ArrayList<> (floats);
        floats1.add ( 7.7f );
        floats1.forEach ( System.out::println );

    }
}
