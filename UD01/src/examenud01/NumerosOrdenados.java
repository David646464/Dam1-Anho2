/*Creador: David Sánchez Peso */
package examenud01;

import java.util.Scanner;

public class NumerosOrdenados {
    public static void main(String[] args) {
        /*Entrada de informacion */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 3 números (pulsa ENTER después de cada uno): ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        sc.close();

        /*Creacion de variables tipo String con la stres posibilidades */
        String texto1 = (num1 < num2 && num2 > num3 || num1 > num2 && num2 < num3 ) ? "Números desordenados" : " ";
        String texto2 = (num1 <= num2 && num2 <= num3  ) ? "Números de menor a mayor" : " ";
        String texto3 = (num1 >= num2 && num2 >= num3  ) ? "Números de mayor a menor" : " ";

        /*Salida de la información */
        System.out.println(texto1);
        System.out.println(texto2);
        System.out.println(texto3);
    }
    
}
