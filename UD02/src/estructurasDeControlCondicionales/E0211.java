package estructurasDeControlCondicionales;

import java.util.Scanner;

public class E0211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero del 1 al 7 respectivamente a los dias de la semana");
        int dia = sc.nextInt();
        sc.close();

        String diaTexto = switch (dia) {
            case 1 -> {
                yield "lunes";
            }
            case 2 -> {
                yield "martes";
            }
            case 3 -> {
                yield "miercoles";
            }
            case 4 -> {
                yield "jueves";
            }
            case 5 -> {
                yield "viernes";
            }
            case 6 -> {
                yield "sabado";
            }
            case 7 -> {
                yield "domingo";
            }
            default -> {
                yield "El dia tiene que ser entre 1 y 7";
            }
        };

        System.out.println(diaTexto);
    }

}
