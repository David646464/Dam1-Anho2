package ejerciciosApuntes;

import java.util.Scanner;

public class E0503 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número de numeros a introducir");
        final int CANTIDAD_NUMEROS = sc.nextInt();

        int[] arrayInts = new int[CANTIDAD_NUMEROS];

        for (int i = 0; i < arrayInts.length; i++) {
            System.out.println("Introduce el número entero número " + i + 1);
            arrayInts[i] = sc.nextInt();
        }

        for (int i = arrayInts.length; i > 0 ; i--) {
            System.out.println("El numero " + i + " es: " + arrayInts[i - 1]);
        }
    }
}
