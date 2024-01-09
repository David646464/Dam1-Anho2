package ejerciciosApuntes;

import java.util.Arrays;

public class E0512 {
    public static void main(String[] args) {
        int[][] cuadrado = crearCuadrado(5);
        mostrarCuadrado(cuadrado);
    }

    public  static  void mostrarCuadrado(int[][] cuadrado){
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado.length; j++) {
                System.out.print(cuadrado[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] crearCuadrado(int longituz){
        int[][] cuadrado = new int[longituz][longituz];

        for (int i = 0; i < longituz; i++) {
            for (int j = 0; j < longituz; j++) {
                cuadrado[i][j] = 10 * i + j;
            }
        }
        return  cuadrado;
    }
}
