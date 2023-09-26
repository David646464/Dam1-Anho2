//Creador:david sánchez peso
package operadores;

import java.time.LocalDate;
import java.util.Scanner;

public class E0103 {
    public static void main(String[] args) {
        /*Solicita la edad del usuario y muestra la que tendrá el año que viene.*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu edad");
        int edad = sc.nextInt();
        
        System.out.println("En " + (LocalDate.now().getYear() + 1) + " tendras " + (edad + 1 )+ " años.");
    }
    
}
