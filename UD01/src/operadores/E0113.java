//Creador:david sánchez peso
package operadores;

import java.util.Scanner;

public class E0113 {
    public static void main(String[] args) {
        /* Escribe un programa que solicite por
        teclado las notas del primer, segundo y
        tercer trimestre del curso, que serán 
        números enteros. El programa deberá 
        mostrar la nota media del curso como 
        se utiliza en el boletín de
        calificaciones (sólo la parte 
        entera) y como se usa en el expediente
        académico (con decimales). */


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la nota del primer trimestre");
        int nota1 = sc.nextInt();
        System.out.println("Introduce la nota del segundo trimestre");
        int nota2 = sc.nextInt();
        System.out.println("Introduce la nota del tercer trimestre");
        int nota3 = sc.nextInt();

        System.out.println("PRIMER TRIMESTRE -->" + nota1);
        System.out.println("SEGUNDO TRIMESTRE -->" + nota2);
        System.out.println("TERCER TRIMESTRE -->" + nota3);
        System.out.println("NOTA BOLETIN -->" + (nota1 + nota2 + nota3)/3);
        System.out.println("NOTA EXPEDIENTE -->" + String.format("%.3f",(double)(nota1 + nota2 + nota3)/3));
        System.out.printf("%.2f", 3.456);
        

    }
    
}
