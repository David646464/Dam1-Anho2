package paraninfo01;

import java.util.Scanner;

public class EP0112 {
    public static void main(String[] args) {

        /* Escribe un programa que tome como entrada un número entero e
        indique qué cantidad hay que sumarle para que el resultado sea
        múltiplo de 7. Un ejemplo */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        int numero = sc.nextInt();
        numero =(numero % 7 != 0) ? 7 - (numero % 7) : 0;
        System.out.println("Para que el numero sea multiplo de 7 hay que sumarle " + numero);
        sc.close();
    }
    
}
