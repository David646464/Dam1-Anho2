package arraysparaninfo;

import java.util.Arrays;

public class EP0512 {
    public static void desordenar(int j[]){
        int[] a = new int[j.length];
        int[] orden = tablaIndices(j.length);

        for (int i = 0; i < a.length; i++) {
            a[i] = j[orden[i]];
        }
        System.arraycopy(a, 0, j, 0, a.length);
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        desordenar(a);
        System.out.println(Arrays.toString(a));
    }

    public static int[] tablaIndices( int longituz) {
        int[] a = new int[longituz];
        Arrays.fill(a, -1);
        int aux = 0;
        int aux2 = -7;
        boolean indicador = true;
        for (int i = 0; i < a.length; i++) {
            while (indicador) {
                aux = numAleat(0, longituz -1);
                for (int j = 0; j < a.length; j++) {
                    if (a[j] == aux){
                        aux2 = j;
                    }
                }
                if (aux2  < 0 ) {
                    a[i] = aux;
                    indicador = false;
                }else {
                    aux2 = -1;
                }
            }
            indicador = true;

        }
        return  a;

    }



    public static int numAleat(int i, int j) {
        int numero ;
        numero = (i) + (int) (Math.random() * ((j - i) + 1));
        return numero;
    }
}
