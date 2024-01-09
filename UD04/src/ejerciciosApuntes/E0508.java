package ejerciciosApuntes;

import java.util.Arrays;

public class E0508 {
    public static int[] getPares(int[] t){
        int []a = new int[0];
        for (int j : t) {
            if (j % 2 == 0) {
                a = Arrays.copyOf(a, a.length + 1);
                a[a.length - 1] = j;
            }
        }
        return a;
    }
    public static int[] getImpares(int[] t){
        int []a = new int[0];
        for (int j : t) {
            if (j % 2 != 0) {
                a = Arrays.copyOf(a, a.length + 1);
                a[a.length - 1] = j;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b = getPares(a);
        int[] c = getImpares(a);

        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
    }
}
