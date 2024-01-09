package ejerciciosApuntes;

import java.util.Scanner;

public class E0502 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arrayDouble = new double[5];

        for (int i = 0; i < arrayDouble.length; i++) {
            System.out.println("Introduce el número " + (i + 1));
            arrayDouble[i] = sc.nextDouble();
        }

        for (int i = 0; i < arrayDouble.length; i++) {
            System.out.print("El número " + (i + 1) + " es el : ");
            System.out.println(arrayDouble[i]);
        }
    }
}
