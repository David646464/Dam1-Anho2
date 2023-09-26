//Creador:david sánchez peso
package operadores;

import java.util.Scanner;

public class E0109 {
    public static void main(String[] args) {
        /*Programa que pida un número entero
        al usuario y que indique si es par 
        mediante un literal booleano 
        (true o false).*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        int numero = sc.nextInt();
        boolean booleano = numero % 2 >= 0;
        System.out.println(booleano);
    }
    
}
