package condicionalesparaninfo;

import java.util.Scanner;

public class EP0216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número: ");

        int numero = sc.nextInt();
        sc.close();
        System.out.println("El valor absoluto de " + numero + " es " + (numero < 0 ? numero * (-1) : numero));
    }

}
