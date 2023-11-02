package condicionalesparaninfo;

import java.util.Scanner;

public class EP0211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean esCapicua = true;
        System.out.println("Escribe un número entre 0 y 9999 inclusive: ");
        int numero = sc.nextInt();
        sc.close();
        if (numero / 1000 > 0) {
            if (numero / 1000 != numero % 10 && numero % 1000 / 100 != numero % 100 / 10) {
                esCapicua = false;
            }
        } else if (numero / 100 > 0) {
            if (numero / 100 != numero % 10) {
                esCapicua = false;
            }
        } else if (numero / 10 > 0) {
            if (numero / 10 != numero % 10) {
                esCapicua = false;
            }
        }

        System.out.println(esCapicua);

    }

}
