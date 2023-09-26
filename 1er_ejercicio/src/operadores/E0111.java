//Creador:david sánchez peso
package operadores;

import java.util.Scanner;

public class E0111 {
    public static void main(String[] args) {
        /*Un frutero necesita calcular los beneficios
        anuales que obtiene de la venta de manzanas y
        peras. Escribe una aplicación que solicite 
        las ventas (en kilos) de cada semestre para 
        cada fruta y que muestre el importe total 
        siendo 2,35 € el precio del kilo de manzanas 
        y 1,95 el del kilo de peras.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("=====================================================");
        System.out.println("PERAS");
        System.out.println("=====================================================");
        System.out.println("Ventas en Kg de peras en el primer semestre");
        int perasSemes1 = sc.nextInt();
        System.out.println("Ventas en Kg de peras en el segundo semestre");
        int perasSemes2 = sc.nextInt();

        System.out.println("=====================================================");
        System.out.println("MANZANAS");
        System.out.println("=====================================================");
        System.out.println("Ventas en Kg de manzanas en el primer semestre");
        int manzaSemes1 = sc.nextInt();
        System.out.println("Ventas en Kg de manzanas en el segundo semestre");
        int manzaSemes2 = sc.nextInt();

        System.out.println("=====================================================");
        System.out.println("Ventas");
        System.out.println("=====================================================");
        System.out.println("SEMESTRE 1");
        System.out.println("Peras = " + String.format("%.2f", perasSemes1 * 1.95) + " euros");
        System.out.println("Manzanas = " + String.format("%.2f", manzaSemes1 * 2.35) + " euros");

        
        System.out.println("SEMESTRE 2");
        System.out.println("Peras = " + String.format("%.2f", perasSemes2 * 1.95) + " euros");
        System.out.println("Manzanas = " + String.format("%.2f", manzaSemes2 * 2.35) + " euros");


        System.out.println("ANUAL");
        System.out.println("Peras = " + String.format("%.2f", (perasSemes1 * 1.95 + perasSemes2 * 1.95)) + " euros");
        System.out.println("Manzanas = " + String.format("%.2f", (manzaSemes1 * 2.35 + manzaSemes2 * 2.35)) + " euros");
    }
    
}
