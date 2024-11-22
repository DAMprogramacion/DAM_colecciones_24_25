package videos.arrays;

public class Ejemplo2 {
    public static void main(String[] args) {
        double[] numeros1 = new double[5];
        numeros1[0] = 5.5;
        numeros1[1] = 6.6;
        mostrarNumeros ( numeros1 );
        System.out.println ("========================");
        double[] numeros2 = {1.1, 2.2, 3.3, 4.4};
        mostrarNumeros ( numeros2 );
        System.out.println ("========================");
        double[] numeros3 = new double[] {3.3, 9.8, 7.9};
        mostrarNumeros ( numeros3 );
       // System.out.println (numeros3[3]); el tamaño del array es 3, pero el índice va de 0 a 2

    }

    private static void mostrarNumeros(double[] numeros1) {
        for (double numero : numeros1 ) {
            System.out.printf ( "Valor: %.2f%n", numero );
        }
    }
}
