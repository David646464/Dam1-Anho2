package paraninfo01;

import java.util.Scanner;

public class EP0111 {
    public static void main(String[] args) {
        /*Un economista te ha encargado un programa para realizar cálculos con el IVA. 
        La aplicación debe solicitar la base imponible y el IVA que se debe aplicar.
        Muestra en pantalla el importe correspondiente al IVA y al total */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introsuce el precio del producto");
        double precio = sc.nextDouble();
        System.out.println("Introduce el procentaje del IVA");
        double IVA = sc.nextDouble();

        double precioTotal = precio / 100 * IVA + precio;
        double precioIVA = precio / 100 * IVA;

        System.out.println("El importe del IVA va a ser: " + String.format( "%.2f", precioIVA) + " euros");
        System.out.println("El importe total va ser: " + String.format( "%.2f", precioTotal) + " euros");
        sc.close();
    }
    
}
