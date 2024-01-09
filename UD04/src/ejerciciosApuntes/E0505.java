package ejerciciosApuntes;

import java.lang.reflect.Array;
import java.util.Arrays;

public class E0505 {
    public static int[] rellenaPares(int longitud, int fin){
        int[] t = new int[longitud];
        for (int i = 0; i < t.length; i++) {
            t[i] = numAleatPar(2, fin);
        }
        Arrays.sort(t);
        return t;
    }

    public static int numAleatPar(int i, int j) {
        int numero = 3;
        while (numero % 2 != 0){
            numero = (i) + (int) (Math.random() * ((j - i) + 1));
        }
        return numero;
    }

    public static void main(String[] args) {
        int[] arrayInts = rellenaPares(10, 100);

        for (int i = 0; i < arrayInts.length; i++) {
            System.out.println(arrayInts[i]);
        }
    }
}
