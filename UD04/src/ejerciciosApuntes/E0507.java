package ejerciciosApuntes;

import java.util.Arrays;

public class E0507 {
    public  static  int[] sinRepetidos(int t[]){
        int[] a = new int[0];
        for (int i = 0; i < t.length; i++) {
            if (contiene(t[i], t)){
                if (!contiene(t[i], a)){
                    a = Arrays.copyOf(a, a.length + 1);
                    a[a.length -1 ] = t[i];
                }
            }else {
                a = Arrays.copyOf(a, a.length + 1);
                a[a.length -1 ] = t[i];
            }
        }
        Arrays.sort(a);
        return a;
    }


    public static int[] tablaRandom(int n){
        int[] t = new int[n];
        for (int i = 0; i < t.length; i++) {
            t[i] = numAleat(-999999999,999999999);
        }
        return  t;
    }

    public static int numAleat(int i, int j) {
        int numero ;
        numero = (i) + (int) (Math.random() * ((j - i) + 1));
        return numero;
    }

    public static boolean contiene (int numero, int[] a){
        boolean indicador = false;
        for (int i = 0; i <a.length ; i++) {
            if (a[i] == numero){
                indicador = true;
            }
        }
        return  indicador;
    }

    public static void main(String[] args) {
        int[] t = {1,1,1,1,2,3,3,3,2,4,4,4,4,5,5};
        System.out.println(Arrays.toString(t));
        t = sinRepetidos(t);
        System.out.println(Arrays.toString(t));

    }
}
