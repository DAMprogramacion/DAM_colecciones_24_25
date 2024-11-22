package videos.listas;

public class Ejemplo1 {
    public static void main(String[] args) {
        int[] enteros = {1, 2, 3, 4, 5};
        //¿Cómo podemos añadir un elemento más
        //enteros[5] = 6;
        int[] enterosAmpliado = new int[6];
        for ( int i = 0; i < enteros.length; i++ ) {
            enterosAmpliado[i] = enteros[i];
        }
        enterosAmpliado[5] = 6;
        for ( int numeros: enterosAmpliado )
            System.out.println (numeros );
    }

}
