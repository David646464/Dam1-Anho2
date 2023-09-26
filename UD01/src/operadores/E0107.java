//Creador:david sánchez peso
package operadores;

import java.util.Scanner;

public class E0107 {
    public static void main(String[] args) {
        /*Aplicación que calcule el perímetro 
        y el área de un círculo a partir del 
        valor del radio introducido por teclado.
        El radio puede contener decimales.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el radio de la circuferencia");
        double radio = sc.nextDouble();
        double perimetro = 2 * 3.1416 * radio;
        double area = 3.1416 * (radio * radio);

        System.out.println("El perimetro de la circunferencia es: " + perimetro);
        System.out.println("El area de la circunferencia es: " + area);


    }
}
