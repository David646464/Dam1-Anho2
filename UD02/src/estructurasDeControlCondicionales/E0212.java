package estructurasDeControlCondicionales;

import java.util.Scanner;

public class E0212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean fechaCorrecta = true;
        System.out.println("Introduce un dia mes y año");
        System.out.println("Dia");
        int dia = sc.nextInt();
        System.out.println("Mes");
        int mes = sc.nextInt();
        System.out.println("Año");
        int anho = sc.nextInt();

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                if (dia < 1 || dia > 31) {
                    fechaCorrecta = false;
                }
            }
            case 2 -> {
                if (dia < 1 || dia > 28) {
                    fechaCorrecta = false;
                }
            }
            case 4, 6, 9, 11 -> {
                if (dia < 1 || dia > 30) {
                    fechaCorrecta = false;
                }
            }
            default ->{
                fechaCorrecta = false;
            }
        }

        if (fechaCorrecta) {
            System.out.println("La fecha es correcta");
        } else {
            System.out.println("La fecha es incorrecta");
        }
    }
}
