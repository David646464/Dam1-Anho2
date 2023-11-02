package estructurasDeControlCondicionales;

import java.util.Scanner;

public class MayorAMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aux = 0 ;

        System.out.println("Imprime el primer número: ");
        int num1 = sc.nextInt();
        System.out.println("Imprime el segundo número: ");
        int num2 = sc.nextInt();
        System.out.println("Imprime el tercer número: ");
        int num3 = sc.nextInt();
        sc.close();

        //Comprueba si el numero 1 es el mayor
        if (num1 >= num2 && num1 >= num3){
            //Comprueba si el numero 2 es mayor que el numero 3
            if (num2 <= num3){
                aux = num2;
                num2 = num3;
                num3 = aux;
            }
        //Comprueba si el numero 2 es el mayor
        }else if (num2 >= num1 && num2 >= num3){
            aux = num1;
            num1 = num2;
            //Comprueba si el numero 1 es mayor que el numero 3
            if (aux <= num3){
                num2 = num3;
                num3 = aux;
            }else{
                num2 = aux;
            }
        //Comprueba si el numero 3 es el mayor
        }else if (num3 >= num1 && num3 >= num2){
            aux = num1;
            num1 = num3;
            //Comprueba si el numero 1 es mayor que el numero 2
            if (aux <= num2){
                num3 = aux;
            }else{
                num3 = num2;
                num2 = aux;
            }
        }
        System.out.println("El orden de mayor a menos es: " + num1 + " " + num2 + " " + num3);
    }

    
    
}
