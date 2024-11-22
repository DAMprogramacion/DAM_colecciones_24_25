package videos.arrays;

public class Ejemplo3 {
    public static void main(String[] args) {
        char[][] letras = new char[2][3];
        letras[0][0] = 'a';
        letras[0][1] = 'b';
        letras[0][2] = 'c';
        letras[1][0] = 'a';
        letras[1][1] = 'b';
        letras[1][2] = 'c';
        for ( int i = 0; i < letras.length; i++ ) {
            for ( int j = 0; j < letras[i].length; j++ ) {
                System.out.printf ( "Fila %d, columna %d, letra: %c%n", i, j, letras[i][j] );
            }
        }
        System.out.println ("============================================");
        long[][][] numeros =  {
                                {
                                    {1, 2}
                                },
                                {
                                    {3}, {4, 5, 6}
                                },
                                {
                                    {7, 8}, {9}, {10, 11, 12, 13}
                                }
                              };
        for ( int i = 0; i < numeros.length; i++ ) {
            for ( int j = 0; j < numeros[i].length; j++ ) {
                for ( int k = 0; k < numeros[i][j].length; k++ ) {
                    System.out.printf ( "Alto %d, ancho %d, largo %d: %d%n", i, j, k, numeros[i][j][k]);
                }
            }

        }

    }
}
