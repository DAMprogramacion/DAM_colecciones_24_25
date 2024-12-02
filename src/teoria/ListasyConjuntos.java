package teoria;

import java.util.*;

public class ListasyConjuntos {
    public static void main(String[] args) {
        int[] datos1 = new int[2];
        datos1[0] = 0;
        datos1[1] = 1;
        int[] datos2 = new int[3];
        for (int i = 0; i < datos1.length; i++) {
            datos2[i] = datos1[i];
        }
        datos2[2] = 2;
        System.out.println("Datos del último array");
        System.out.println(datos2);
        System.out.println(Arrays.toString(datos2));
        int[] datos2_2 = Arrays.copyOf(datos2, 4 );
        System.out.println("=====array ampliado=========");
        System.out.println(Arrays.toString(datos2_2));
        datos2_2[3] = 3;
        System.out.println(Arrays.toString(datos2_2));
        Arrays.fill(datos2_2, 9);
        System.out.println(Arrays.toString(datos2_2));
        datos2_2[0] = 900;
        datos2_2[2] = 10;
        System.out.println(Arrays.toString(datos2_2));
        Arrays.sort(datos2_2);
        System.out.println(Arrays.toString(datos2_2));
        System.out.printf("Elemento más pequeño %d%n", datos2_2[0]);
        System.out.printf("Elemento más grande %d%n", datos2_2[datos2_2.length - 1]);

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        /// //////Lista dinámica /////////
        List<Integer> datos3 = new ArrayList<>(); //lista vacía, mutable, el orden es importante y puede haber repeticiones
        datos3.add(0); datos3.add(1); datos3.add(2); datos3.add(3);
        System.out.println(datos3);
        System.out.printf("Tamaño de la lista %d%n", datos3.size());
        datos3.remove(0);
        System.out.println(datos3);
        System.out.printf("Tamaño de la lista %d%n", datos3.size());
        datos3.add(1); //los datos se pueden repetir
        datos3.set(1, 11);
        System.out.println(datos3);
        System.out.printf("Tamaño de la lista %d%n", datos3.size());
        List datos4 = List.of(1, 1, 1, 1, 1);
        System.out.println("lista inmutable");
        System.out.println(datos4);
        //datos4.add(1); es inmutable
        //datos4.set(2, 2); inmutable

        //conjuntos, no es importante el orden, pero no puede haber repeticiones
        Set<Integer> datos5 = new HashSet<>();
        datos5.add(0); datos5.add(1); datos5.add(2);
        datos5.remove(2);
        System.out.println("=======Set=========");
        System.out.println(datos5);
        datos5.add(2); datos5.add(5); datos5.add(2);
        System.out.println(datos5);
        Set<Integer> datos6 = Set.of(1, 2, 3, 4, 5, 6);
        System.out.println(datos6);
        /////probando clase Collections
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int aleatorio = new Random().nextInt(10);
            list.add(aleatorio);
        }
        System.out.println("============================");
        System.out.println(list);
        System.out.printf("Valor máximo: %d%n", Collections.max(list));
        System.out.printf("Valor mínimo: %d%n", Collections.min(list));
        for (int dato : list){
            System.out.printf("El elemento %d se repite %d veces %n",
                    dato, Collections.frequency(list, dato));
        }
        Map<Integer, Integer> frecuenciaMap = new HashMap<>();
        for (int clave : list){
            int valor = Collections.frequency(list, clave);
            frecuenciaMap.put(clave, valor);
        }
        System.out.println(frecuenciaMap);








    }

}
