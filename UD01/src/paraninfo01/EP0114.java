package paraninfo01;

import java.util.Scanner;

public class EP0114 {
    public static void main(String[] args) {
        /*Crea un programa que pida la base y la altura de un triángulo y muestre su área */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la base");
        double base = sc.nextDouble();
        System.out.println("Introduce la atura");
        double altura = sc.nextDouble();

        double area = (base * altura) / 2;
        System.out.println("El area del triangulo es: " + String.format( "%.2f", area));
        sc.close();
    }
    
}
