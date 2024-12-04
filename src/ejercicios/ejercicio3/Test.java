package ejercicios.ejercicio3;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] datos = ColeccionAleatoria.crearArray();
        System.out.println(Arrays.toString(datos));
        double valorMedio = ColeccionAleatoria.calcularValorMedio(datos);
        System.out.printf("Valor medio %.2f%n", valorMedio);
        List<Integer> listaPares = ColeccionAleatoria.obtenerValoresPares(datos);
        System.out.println("Lista de pares:");
        System.out.println(listaPares);
        int[] menorMayor = ColeccionAleatoria.obtenerMenorMayor(datos);
        System.out.println(Arrays.toString(menorMayor));
        System.out.println(Arrays.toString(datos)); //efecto colateral, se queda el array ordenado
    }
}
