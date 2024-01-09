package ejerciciosApuntes;

import java.util.Scanner;

public class ArrayNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroDeNegativos = 0;
        int sumaNegativos = 0;
        int numeroDePositivos = 0;
        int sumaPositivos = 0;
        int numerodeCeros = 0;

        System.out.println("Introduce el número de números a introducir");
        int[] arrayInts = new int[sc.nextInt()];

        for (int i = 0; i < arrayInts.length; i++) {
            System.out.println("Introduce el numero");
            arrayInts[i] = sc.nextInt();
        }
        for (int i = 0; i < arrayInts.length; i++) {
            if (arrayInts[i] > 0){
                numeroDePositivos++;
                sumaPositivos+= arrayInts[i];
            } else if (arrayInts[i] < 0) {
                numeroDeNegativos++;
                sumaNegativos+= arrayInts[i];
            }else{
                numerodeCeros++;
            }
        }

        System.out.println("La media de los numeros positivos es: " + (sumaPositivos * 1.0 / numeroDePositivos));
        System.out.println("La media de los numeros negativos es: " + (sumaNegativos * 1.0 / numeroDeNegativos));
        System.out.println("La cantidad de ceros introducidos es: " + numerodeCeros);

    }
}
