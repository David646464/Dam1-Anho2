//Creador:david sánchez peso
package ejerciciosVariados;

import java.util.Scanner;

public class E0108 {
    public static void main(String[] args) {
        /*Crea un programa que solicite al 
        usuario su edad y muestre si es o no
         mayor de edad imprimiendo un literal
          booleano: true o false.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad = sc.nextInt();
        boolean booleano = edad >= 18;
        System.out.println(booleano);


       
    }
    
}
