package ejerciciosApuntes;

import java.util.Arrays;

public class E0510 {
    public  static int[] eliminarMayores(int t[], int valor){
        int[] a = new int[0];
        for (int i = 0; i < t.length; i++) {
            if (t[i] <= valor ){
                a = Arrays.copyOf(a, a.length + 1 );
                a[a.length -1 ] = t[i];
            }
        }
    return  a;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        a = eliminarMayores(a, 5);
        System.out.println(Arrays.toString(a));
    }
}
