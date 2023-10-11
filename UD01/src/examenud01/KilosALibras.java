/*Creador: David Sánchez Peso */

package examenud01;

import java.util.Scanner;

public class KilosALibras {
    public static void main(String[] args) {
        /*Entrada de informacion */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de kilos para pasar a libras");
        double kilos = sc.nextDouble();
        sc.close();

        /*Cálculos */
        double libras = kilos /  0.453592;

        /*Salida de la información */
        System.out.println(kilos +" kilos son :" + libras + " libras");
    

    }
    
}
