package condicionalesparaninfo;

import java.util.Scanner;

public class EP0213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la comida diaria");
        double comidaDiaria = sc.nextDouble();
        System.out.println("Introduce el número de animales");
        int numAnimales = sc.nextInt();
        System.out.println("Introduce la comida diaria que come de media cada animal");
        double kilosPorAnimal = sc.nextDouble();
        sc.close();
        if (numAnimales > 0) {
            if (kilosPorAnimal * numAnimales <= comidaDiaria) {
                System.out.println("La comida es suficiente");
            } else {
                System.out.println("La comida no es suficiente");
            
                System.out.println(
                        "Por cada animal le corresponte : " + Math.round(comidaDiaria * 100 / numAnimales ) / 100.0);
            }
        } else {
            System.out.println("Los datos introducidos sono erroneos");
        }

    }

}
