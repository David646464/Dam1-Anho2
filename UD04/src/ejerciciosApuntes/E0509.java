package ejerciciosApuntes;

import java.util.Arrays;
import java.util.Scanner;

public class E0509 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] participantes = new String[5];
        System.out.println("Introduce las pùntuaciones de los cinco participantes");
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce la puntuacion con el nombre del participante");
            System.out.println("Introducelo segun el ejemplo: 01 david");
            participantes[i] = sc.nextLine();
        }
        Arrays.sort(participantes);
        System.out.println("Las puntuaciones de los 5 participantes son:");
        for (int i = 0; i < participantes.length; i++) {
            System.out.println(participantes[i]);
        }

        System.out.println("Si hay participantes de exhibición escribe su puntuacion con su nombre a continuacion y escribe -1 para finalizar");
        boolean indicador = true;
        while (indicador){
            System.out.println("Introduce la puntuacion con el nombre del participante");
            System.out.println("Introducelo segun el ejemplo: 01 david");
            String puntuacion = sc.nextLine();
            if (puntuacion.equals("-1")){
                indicador = false;
            }else {
                participantes = Arrays.copyOf(participantes, participantes.length + 1);
                participantes[participantes.length - 1] = puntuacion;
            }
        }
        Arrays.sort(participantes);
        for (int i = 0; i < participantes.length; i++) {
            System.out.println(participantes[i]);
        }
    }
}
