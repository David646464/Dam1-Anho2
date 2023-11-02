package estructurasDeControlCondicionales;

import java.util.Scanner;

public class E0213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int segundosSumados = 0;
        int minutosSumados = 0;
        int horasSumados = 0;

        System.out.println("Introduce la hora minutos y segundos");
        System.out.println("Hora");
        int horas = sc.nextInt();
        System.out.println("Minutos");
        int minutos = sc.nextInt();
        System.out.println("Segundos");
        int segundos = sc.nextInt();

        if (segundos == 59) {
            if (minutos == 59) {
                if (horas != 23) {
                    horasSumados = horas + 1;
                }else{
                    horasSumados = 0;
                }
            } else {

                minutosSumados = minutos + 1;
                horasSumados = horas;
            }
        } else {
            segundosSumados = segundos + 1;
            minutosSumados = minutos;
            horasSumados = horas;
        }
        System.out.println("Hora actual (" + horas + ":" + minutos + ":" + segundos + ") => hora actual + 1 segundo ("
                + horasSumados + ":" + minutosSumados + ":" + segundosSumados + ")");

    }
}
