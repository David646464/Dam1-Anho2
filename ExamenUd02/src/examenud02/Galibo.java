//David Sánchez Peso
package examenud02;

import java.util.Scanner;

public class Galibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int carrilMasGrandeComun = 0;
        int carrilMasGrandeEnTunel = 0;

        System.out.println("introduce el numero de túneles:");
        int numTuneles = sc.nextInt();

        for (int i = 1; i < numTuneles + 1; i++) {
            System.out.println("Introduce el número de carriles del túnel " + i + ":");
            int carriles = sc.nextInt();

            for (int j = 1; j < carriles + 1; j++) {
                System.out.println("Introduce la anchura del carril " + j + " del túnel " + i + " en cm:");
                int anchura = sc.nextInt();

                if (carrilMasGrandeEnTunel == 0) {
                    carrilMasGrandeEnTunel = anchura;
                } else if (anchura > carrilMasGrandeEnTunel) {
                    carrilMasGrandeEnTunel = anchura;
                }

            }

            if (carrilMasGrandeComun == 0) {
                carrilMasGrandeComun = carrilMasGrandeEnTunel;
            } else if (carrilMasGrandeComun > carrilMasGrandeEnTunel && carrilMasGrandeEnTunel != 0) {
                carrilMasGrandeComun = carrilMasGrandeEnTunel;
            }
            carrilMasGrandeEnTunel = 0;
        }

        System.out.println("======================");
        System.out.println(carrilMasGrandeComun);
    }

}
