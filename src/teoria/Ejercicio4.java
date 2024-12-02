package teoria;

public class Ejercicio4 {
    public static void main(String[] args) {
        String[] cadenas1 = new String[3];
        cadenas1[0] = "hola";
        cadenas1[1] = "hello";
        cadenas1[2] = "hi";
        //cadenas1[3] = "error";
        for (int i = 0; i < cadenas1.length; i++) {
            System.out.println(cadenas1[i]);
        }
        System.out.println("''''''''''''''");
        for (String cadena : cadenas1) {
            System.out.println(cadena);
        }
        /// /////literales en colecciones ////////////
        String[] cadenas2 = {"pepe", "juani", "isa"};
        System.out.println("''''''''''''''");
        for (String cadena : cadenas2) {
            System.out.println(cadena);
        }
    }
}
