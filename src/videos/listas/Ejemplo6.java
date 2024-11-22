package videos.listas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Ejemplo6 {
    public static void main(String[] args) {
        List<Persona> personas = List.of(
                new Persona ( "Jose", "Amancio Prada", "12345678a"),
                new Persona ( "Pepe", "Amancio Prada", "12345678a" ),
                new Persona ( "Josefa", "Amancio Prada", "12345679b" )
        );
        Map<Integer, Persona> diccionario = new HashMap<> ();
        for ( int i = 0; i < personas.size (); i++ ) {
            diccionario.put ( i + 1, personas.get ( i ) );
        }
        //recorremos
        for ( Integer id: diccionario.keySet () ) {
            Persona persona = diccionario.get ( id );
            System.out.printf ( "%d -> %S%n", id, persona );
        }
        System.out.println ( "*****************************" );
        Iterator<Integer> it = diccionario.keySet ().iterator ();
        while (it.hasNext ()) {
            int id = it.next ();
            Persona persona = diccionario.get ( id );
            System.out.printf ( "%d --> %S%n", id, persona );
        }
        System.out.println ( "*****************************" );
        for (Map.Entry<Integer, Persona> entry : diccionario.entrySet ()) {
            int id = entry.getKey ();
            Persona persona = entry.getValue ();
            System.out.printf ( "%d ---> %S%n", id, persona );
        }
    }


}
