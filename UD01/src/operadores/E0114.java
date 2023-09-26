//Creador:david sánchez peso
package operadores;

import java.util.Scanner;

public class E0114 {
    public static void main(String[] args) {
        /*Escribe un programa que solicite por
        teclado un número decimal y lo redondee
        al entero más próximo.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número decimal");
        double numero = sc.nextDouble();

        System.out.println("el numero entero mas proximo es: " + Math.round(numero));
            
    }
    
}
