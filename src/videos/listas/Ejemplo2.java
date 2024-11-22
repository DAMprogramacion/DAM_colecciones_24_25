package videos.listas;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo2 {
    public static void main(String[] args) {
        int[] enteros = new int[5];
        System.out.println ("Array:");
        System.out.println (enteros);
        System.out.println ("Lista:");
        List<Integer> listaEnteros = new ArrayList<> (); //lista vacía
        System.out.println (listaEnteros);
        //añadimos elementos:
        listaEnteros.add ( 1 );
        for ( int i = 2; i < 6; i++ ) {
            listaEnteros.add ( i );
        }
        listaEnteros.add ( 6 );
        listaEnteros.add ( 6 );
        System.out.println (listaEnteros);

        List<String> cadenas = new ArrayList<> ();
        cadenas.add ( "manuel" );
        cadenas.add ( "javier" );
        cadenas.add ( "marisa" );
        cadenas.add ( "belen" );
        System.out.println (cadenas);
        cadenas.remove ( 0 );
        System.out.println (cadenas);
        cadenas.remove ( "marisa" );
        System.out.println (cadenas);
        System.out.printf ("¿Existe javier? %B%n", cadenas.contains ( "javier" ));
        cadenas.clear ();
        System.out.printf ("¿Existe javier? %B%n", cadenas.contains ( "javier" ));
        System.out.println (cadenas);








    }
}
