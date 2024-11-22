package videos.listas;

import java.util.HashSet;
import java.util.Set;

public class Ejemplo5 {
    public static void main(String[] args) {
        Persona p1 = new Persona ( "Jose", "Amancio Prada", "12345678a" );
        Persona p2 = new Persona ( "Pepe", "Amancio Prada", "12345678a" );
        Persona p3 = new Persona ( "Josefa", "Amancio Prada", "12345679b" );

        System.out.println (p1.equals ( p2 ));
        Set<Persona> personas = new HashSet<> ();
        personas.add ( p1 ); personas.add ( p2 ); personas.add ( p3 );
        System.out.println (personas);
        for ( Persona persona: personas ) {
            System.out.println (persona);
        }
    }
}
