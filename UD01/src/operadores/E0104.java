//Creador:david sánchez peso
package operadores;

import java.time.LocalDate;
import java.util.Scanner;

public class E0104 {
    public static void main(String[] args) {
        /*Solicita el año actual y el año de nacimiento del usuario y 
        muestra la edad del usuario suponiendo que en el año en curso 
        ya haya cumplido años.*/

        Scanner sc = new Scanner(System.in);


        System.out.println("Introduce el año actual");
        int actualYear = sc.nextInt();

        System.out.println("Introduce tu año de nacimiento");
        int userYearBorn = sc.nextInt();

        System.out.println("La edad del usuario es: " + (actualYear - userYearBorn));
        
    }
}
