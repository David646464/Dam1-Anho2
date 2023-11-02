package condicionalesparaninfo;

import java.util.Scanner;

public class EP0219 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero de grados tiene el ángulo");
        int grados = sc.nextInt();
        sc.close();
        if (grados > 360) {
            grados = grados % 360;
        }
        double radianes = (double) Math.round((grados * Math.PI / 180) * 10000) / 10000;
        System.out.println(radianes);
    }
}
