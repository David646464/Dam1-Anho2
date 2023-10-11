/*Creador: David Sánchez Peso */
package examenud01;

import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        /*Entrada de informacion */
        Scanner sc = new Scanner(System.in);
        System.out.print("Importe en efectivo que desea retirar (euros): ");
        int importe = sc.nextInt();
        sc.close();
        System.out.println("Se retirarán " + importe + " euros");

        /*Salida de la información  con cálculos*/
        System.out.println(importe / 50 + " billetes de 50 euros:");
        System.out.println(importe % 50 / 20 + " billetes de 20 euros:");
        System.out.println(importe % 50 % 20 / 10 + " billetes de 10 euro:");
        System.out.println(importe % 50 % 20 % 10 / 5 + " billetes de 5 euros:");
        
        String textoAuxiliar = (importe % 5 > 0) ? importe % 5 + " euros no se retirarán por no haber billetes tan pequeños" : " ";
        System.out.println(textoAuxiliar);
    }
}
