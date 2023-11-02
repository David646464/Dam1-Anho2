package estructurasDeControlCondicionales;

import java.util.Scanner;

public class E0210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una nota entero del 0 al 10 (incluidos)");
        int nota = sc.nextInt();

        /*
         * switch (nota) {
         * case 0, 1, 2, 3, 4 -> {
         * System.out.println("induficiente");
         * }
         * case 5 -> {
         * System.out.println("Suficiente");
         * }
         * case 6 -> {
         * System.out.println("Bien");
         * }
         * case 7, 8 -> {
         * System.out.println("Notable");
         * }
         * case 9,10 -> {
         * System.out.println("Sobresaliente");
         * }
         * default -> {
         * System.out.println("La nota tiene que ser entre 0 y 10");
         * }
         * 
         * }
         */

        String notaTexto = switch (nota) {
            case 0, 1, 2, 3, 4 -> {
                yield "Insuficiente";
            }
            case 5 -> {
                yield "Suficiente";
            }
            case 6 -> {
                yield "Bien";
            }
            case 7, 8 -> {
                yield "Notable";
            }
            case 9, 10 -> {
                yield "Sobresaliente";
            }
            default -> {
                yield "La nota debe estar entre 0 y 10.";
            }
        };
        System.out.println(notaTexto);

    }

}
