package paraninfo01;

import java.util.Scanner;

public class EP0116 {
    public static void main(String[] args) {
        /*Diseña una aplicación que solicite al usuario que introduzca una cantidad de segundos
        La aplicación debe mostrar cuántas horas, minutos y segundos hay en el número de segundos 
        introducidos por el usuario*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los segundos");
        int segundos = sc.nextInt();
        sc.close();

        int horas = segundos / 3600;
        int minutos = segundos % 3600 / 60 ;
        segundos = segundos % 60;
        
        System.out.println("horas: " + horas);
        System.out.println("minutos: " + minutos);
        System.out.println("segundos: " + segundos);
    }
    
}
