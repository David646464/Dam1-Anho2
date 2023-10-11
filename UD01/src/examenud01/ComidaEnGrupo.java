/*Creador: David Sánchez Peso */
package examenud01;

import java.util.Locale;
import java.util.Scanner;

public class ComidaEnGrupo {
    public static void main(String[] args) {
        /*Entrada de informacion */
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Número de personas: ");
        double comensales = sc.nextDouble();
        System.out.print("Importe total de la comida (euros): ");
        double importeTotal = sc.nextDouble();
        sc.close();
        
        /*Salida de la información con cálculos */
        System.out.println("Cantidad a pagar por comensal: " + String.format("%.2f", (importeTotal / comensales)));
    }
    
}
