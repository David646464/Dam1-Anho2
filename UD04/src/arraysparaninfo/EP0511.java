package arraysparaninfo;

import java.util.Arrays;

public class EP0511 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,4,3,2,1,2,3,4,5,6,4322,123};
        int[] b = buscarTodos(a, 3);

        System.out.println(Arrays.toString(b));
    }
    public static int[] buscarTodos(int t[], int clave){
        int[] a = new int[0];

        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave){
                a = Arrays.copyOf(a, a.length + 1 );
                a[a.length -1] = i;
            }
        }
        return a;
    }
}
