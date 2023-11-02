package estructurasDeControlCondicionales;

import java.util.Scanner;

public class Bisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = "El año no es bisiesto";

        System.out.println("Introduce el año para analizar:");
        int year = sc.nextInt();
        sc.close();

        if (year % 4 == 0){
            if ( year % 400 == 0){
                text = "El año es bisiesto";
            }else if (year % 100 != 0){
                text = "El año es bisiesto";
            }
        }

        System.out.println(text);
    }
    
}
