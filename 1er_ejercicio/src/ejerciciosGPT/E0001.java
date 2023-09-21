package ejerciciosGPT;

import java.time.LocalDate;
import java.util.Scanner;

public class E0001 {
    public static void main(String[] args) {
        /*Diseña un programa que solicite la fecha de nacimiento de una persona (día, mes y año)
         y calcule automáticamente la edad actual de la persona en base a la fecha actual. */
        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la fecha de tu nacimiento con el formato yyyymmdd"); 
        int fecha = sc.nextInt();
        
        int anho = fecha / 10000;
        int mes = (fecha % 10000) / 100;
        int dia = fecha % 100;
        int anhoActual = LocalDate.now().getYear();
        int mesActual = LocalDate.now().getMonthValue();
        int diaActual = LocalDate.now().getDayOfMonth();

        
            if (mesActual > mes){
                System.out.println("Tu edad es:" + (anhoActual - anho));
            }else{
                if (diaActual > dia){
                    System.out.println("Tu edad es:" + (anhoActual - anho));
                }else{
                    System.out.println("Tu edad es:" + ((anhoActual - anho)-1));
                }
            } 
        }
        


    }
    

