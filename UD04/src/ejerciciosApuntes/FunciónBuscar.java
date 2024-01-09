package ejerciciosApuntes;

import java.util.Arrays;

public class FunciónBuscar {
    public static int buscar(int t[], int clave){
        int posicion = -1;

        for (int i = 0; i < t.length; i++) {
            if (clave == t[i]){
                posicion = i;
            }
        }

        return posicion;
    }

    public static int contar(int t[], int clave){
        int numVecesAparece = 0;

        for (int i = 0; i < t.length; i++) {
            if (clave == t[i]){
                numVecesAparece++;
            }
        }
        return  numVecesAparece;
    }
    public static int[] buscarVarios(int t[], int clave){
        int[] posiciones = new int[0];

        for (int i = 0; i < t.length; i++) {
            if (clave == t[i]){
                posiciones = Arrays.copyOf(posiciones, posiciones.length + 1);
                posiciones[posiciones.length -1 ] = i;
            }
        }
        return  posiciones;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,2,1,2,1,2,1,5,3,2,1,3};
        int[] b = buscarVarios(a, 1);

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

}
