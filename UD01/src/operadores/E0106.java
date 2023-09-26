//Creador:david sánchez peso
package operadores;

import java.util.Scanner;

public class E0106 {
    public static void main(String[] args) {
        /*Crea una aplicación que calcule la 
        media aritmética de dos notas enteras. 
        Ten en cuenta que la media puede tener 
        decimales. */

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la primera nota");
        int nota1 = sc.nextInt();

        System.out.println("Dime la segunda nota");
        int nota2 = sc.nextInt();

        double media = ((double)nota1 + (double)nota2) / 2;

        System.out.println("La media entre las dos notas es " + media);
    }
    
}
