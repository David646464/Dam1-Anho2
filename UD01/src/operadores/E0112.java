//Creador:david sánchez peso
package operadores;

import java.util.Scanner;

public class E0112 {
    public static void main(String[] args) {
        /*Escribe un programa que pida un 
        número entero al usuario y muestre 
        su valor absoluto. */
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número entero");
        int numero = sc.nextInt();

        int numeroAbsoluto = (numero >= 0) ? numero : (numero * (-1));

        /* variable = (condicion) ? (valor si es true) : (valor si es false); */

        
        System.out.println("El valor absoluto de " + numero + " es: " + numeroAbsoluto);
        
            
        
    }
    
}
