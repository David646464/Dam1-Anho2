package condicionalesparaninfo;

import java.util.Scanner;

public class EP0212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número del DNI");
        int numeroDNI = sc.nextInt();
        sc.close();
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

        System.out.println("La letra del dni es: " + letras.charAt(numeroDNI % 23));

    }

}
