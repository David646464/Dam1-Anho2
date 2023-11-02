package estructurasDeControlBucles;

import java.util.Scanner;

public class E0301 {
    public static void main(String[] args) {
        espar();
    }

    public static void espar() {
        Scanner sc = new Scanner(System.in);
        int numero = 1;
        System.out
                .println("Introduce un número \ny si quieres salir del programa escribe 0");

        while (numero != 0) {
            numero = sc.nextInt();
            if (numero % 2 == 0) {
                System.out.println("Es par");
            } else {
                System.out.println("Es impar");
            }
            if (numero > 0) {
                System.out.println("Es positivo");
            } else {
                System.out.println("Es negativo");
            }

            System.out.println("Y su cuadrado es: " + (numero * numero));
        }
    }
}
