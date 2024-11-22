package teoria;

import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        long[] longs = {1, 2, 3, 4, 5, 6, 1};
        long valorMasGrande = calcularMasGrande(longs);
        System.out.printf("El valor mas grande es: %d%n", valorMasGrande);
        //double new double[]
        double[] doubles = new double[]{1.7, 6, 3.2f};
        //Personas:
        Persona[] personas = {new Persona("joaquin medina", 18),
                new Persona("felicidad martínez", 56),
                new Persona("emilio molero", 45),
                new Persona("Jacinto Benavente", 65)};
        double media = calcularMedia(personas);
        System.out.printf("La media de %d personas es %.2f%n", personas.length, media);
        System.out.println("-------------------------------");
        System.out.println(Arrays.toString(personas));
        for ( Persona persona : personas ) {
            System.out.printf("%S : %d%n", persona.nombre(), persona.edad());
        }
    }

    private static long calcularMasGrande(long[] longs) {
        long grande = Long.MIN_VALUE;
        for (long numero : longs){
            if (numero > grande)
                grande = numero;
        }
        return grande;
    }

    private static double calcularMedia(Persona[] personas) {
        double suma = 0;
        /*for (int i = 0; i < personas.length; i++) {
            suma += personas[i].edad();
        }*/
        for (Persona persona : personas){
            suma += persona.edad();
        }
        return suma / personas.length;
    }
}
