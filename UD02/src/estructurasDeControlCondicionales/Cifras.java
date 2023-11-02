package estructurasDeControlCondicionales;

import java.util.Scanner;

public class Cifras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroCifras = 1;
        System.out.println("introduce un numeor entre -99999 y 99999");
        int numero = sc.nextInt();

        if (numero / 10 != 0){
            numeroCifras++;
            if (numero / 100 != 0){
                numeroCifras++;
                if (numero / 1000 != 0){
                    numeroCifras++;
                    if (numero / 10000 != 0){
                        numeroCifras++;
                    }
                }
            }
            
        }

        System.out.println(numeroCifras);
    }
    
}
