package teoria;

public class SistemaEcuaciones {
    private int[][] ecuaciones = new int[2][3];   //int[][] ecuaciones1 = new int[2][3];
    private int determinante;

    public SistemaEcuaciones(int[][] ecuaciones) {
        this.ecuaciones = ecuaciones;
        determinante = ecuaciones[0][0] * ecuaciones[1][1] - ecuaciones[0][1] * ecuaciones[1][0];
    }
    public boolean esResoluble(){
        return determinante != 0;
    }
    public double calcularX() {
        return 1.0 * (ecuaciones[0][2] * ecuaciones[1][1] - ecuaciones[0][1] * ecuaciones[1][2]) / determinante;
    }
    public double calcularY() {
        return 1.0 * (ecuaciones[0][0] * ecuaciones[1][2] - ecuaciones[0][2] * ecuaciones[1][0]) / determinante;
    }
}





