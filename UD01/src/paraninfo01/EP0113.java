package paraninfo01;

import java.util.Scanner;

public class EP0113 {
    public static void main(String[] args) {
        /*Modifica la Actividad de Aplicación EP0112 para que, indicando dos números n y m, diga
        que cantidad hay que sumarle a n para que sea múltiplo de m.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        int numeroN = sc.nextInt();
        System.out.println("Introduce otro número entero");
        int numeroM = sc.nextInt();
        numeroN =(numeroN % numeroM != 0) ? numeroM - (numeroN % numeroM) : 0;
        System.out.println("Para que el primer numero sea multiplo de " + numeroM +" hay que sumarle " + numeroN);
        sc.close();
    }
}
