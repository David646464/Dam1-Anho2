package API;

import java.util.Scanner;

public class LeerNumeroEntero {
    //Creador:david sánchez peso
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        int numero = sc.nextInt();

        System.out.println("El número entero indroducido es " + numero);
    }
    
}
