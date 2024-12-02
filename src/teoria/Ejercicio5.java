package teoria;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[][] ecuaciones1 = new int[2][3];
        ecuaciones1[0][0] = 1;
        ecuaciones1[0][1] = 1;
        ecuaciones1[0][2] = 1;
        ecuaciones1[1][0] = 2;
        ecuaciones1[1][1] = 2;
        ecuaciones1[1][2] = 2;
        SistemaEcuaciones s1 = new SistemaEcuaciones(ecuaciones1);
        if (s1.esResoluble()) {
            System.out.println("vamos a resolver.....");
            double x = s1.calcularX();
            double y = s1.calcularY();
            System.out.printf("X: %.2f, Y: %.2f%n", x, y);
        } else
            System.out.println("No se puede resolver");
/// ////////////////////////////////////////////////////////////////////////////////////////
        int[] valores = { 0, 1};
        int[][] ecuaciones2 = { {2, 1, 7} , {-1, 2, -1}};
        SistemaEcuaciones s2 = new SistemaEcuaciones(ecuaciones2);
        if (s2.esResoluble()) {
            System.out.println("vamos a resolver.....");
            double x = s2.calcularX();
            double y = s2.calcularY();
            System.out.printf("X: %.2f, Y: %.2f%n", x, y);
        } else
            System.out.println("No se puede resolver");
        /// /////////////////////////////////////////////////////////////////
        System.out.println("=====================================");
        SistemaEcuaciones[] ecuaciones = {s1, s2};
        resolverEcuaciones(ecuaciones);
    }

    private static void resolverEcuaciones(SistemaEcuaciones[] ecuaciones) {
        for (SistemaEcuaciones sistemaEcuaciones : ecuaciones)
            if (sistemaEcuaciones.esResoluble()) {
                System.out.println("vamos a resolver.....");
                double x = sistemaEcuaciones.calcularX();
                double y = sistemaEcuaciones.calcularY();
                System.out.printf("X: %.2f; Y: %.2f%n", x, y);
            } else
            System.out.println("No se puede resolver");
    }
}
