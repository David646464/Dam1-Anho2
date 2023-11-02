package condicionalesparaninfo;

import java.util.Scanner;

public class EP0215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura = -1;
        double base = -1;
        
        while (altura <= 0){
            System.out.println("Introduce la altura del triangulo");
            altura = sc.nextDouble();
            if (altura <= 0){
                System.out.println("Un triangulo no puede tener altura negativa o 0");
            }
        }
        while (base <= 0){
            System.out.println("Introduce la base del triangulo");
            base = sc.nextDouble();
            if (base <= 0){
                System.out.println("Un triangulo no puede tener base negativa o 0");
            }
        }
        sc.close();
        double calculoAreaTriangulo = base * altura / 2;
        System.out.println("El area del triangulo sera: " + (double) Math.round(calculoAreaTriangulo * 100) / 100);

    }
    
}
