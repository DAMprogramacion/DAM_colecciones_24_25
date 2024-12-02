package teoria;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ejercicio7 {
    public static void main(String[] args) {
        Persona p1 = new Persona("joaquin", 22);
        Persona p2 = new Persona("maria", 21);
        Persona p3 = new Persona("esperanza", 33);
        Persona p4 = new Persona("luis", 18);
        //defino el diccionario, que tenga como clave el dni
        Map<String, Persona> censo = new HashMap<>();
        censo.put("12345678a", p1);
        censo.put("12345679b", p2);
        censo.put("12345670c", p3);
        censo.put("12345671d", p4);
        System.out.println(censo);
        for (int i = 0; i < 100; i++) {
            censo.put("12345678a", p1);
        }
        System.out.printf("Tamaño del censo %d%n", censo.size());
        Set<String> dnis = censo.keySet();
        for (String dni : dnis){
            Persona persona = censo.get(dni);
            System.out.printf("DNI-> %S: %s de edad %d%n",
                    dni, persona.nombre(), persona.edad());
        }
    }

}
