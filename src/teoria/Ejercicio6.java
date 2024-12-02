package teoria;

import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        float[] numeros = new float[4];  //solo tenemos reservado para 4 valores float, ninguno más
        ArrayList datos = new ArrayList(); //mejor parametrizar <Float>
        ArrayList<Float> valores = new ArrayList<>(); //lista vacía
        List<Float> floats = new ArrayList<>();
        System.out.println(numeros);
        System.out.println(Arrays.toString(numeros));
        System.out.println(floats);
        floats.add(3.3f);
        floats.add(6f);
        System.out.println(floats);
        //recorremos usando un fori
        for (int i = 0; i < floats.size(); i++) {
            System.out.printf("Posición: %d, valor: %.2f%n", i, floats.get(i));
        }
        //recorremos con foreach
        for (float numero : floats )
            System.out.println(numero);
        //foreach
        floats.forEach(System.out::println);

        //Usando literales
        List<String> strings = List.of("hola", "hello", "hi");
        for (String string : strings)
            System.out.println(string);
        //strings.add("kdskljflkd"); lista inmutable
        List<String> cadenas = new ArrayList<>(strings);  //cadenas ya NO es inmutable
        cadenas.add("bye");
        cadenas.add("bye");
        System.out.println(cadenas);
        cadenas.remove(0);
        System.out.println(cadenas);
        cadenas.remove("hi");
        System.out.println(cadenas);
        System.out.printf("Contiene hola: %B%n", cadenas.contains("hola"));
        System.out.printf("Contiene bye: %B%n", cadenas.contains("bye"));
        //no duplicados
        Set<Integer> enteros = new HashSet<>();
        System.out.println(enteros);
        enteros.add(6);
        enteros.add(15);
        enteros.add(-9);
        System.out.println(enteros);
        enteros.add(15);
        System.out.println(enteros);
    }
}
