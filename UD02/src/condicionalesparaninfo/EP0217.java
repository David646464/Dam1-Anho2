package condicionalesparaninfo;

import java.util.Scanner;

public class EP0217 {
    public static void main(String[] args) {
        int numero1 = (1) + (int) (Math.random() * ((99 - 1) + 1));
        int numero2 = (1) + (int) (Math.random() * ((99 - 1) + 1));
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la suma entre " + numero1 + " y " + numero2);
        int resultado = sc.nextInt();
        sc.close();
        if (resultado == numero1 + numero2) {
            System.out.println("Acertastes");
        } else {
            System.out.println("Fallastes.La solucion era: " + (numero1 + numero2));
        }
    }

}
