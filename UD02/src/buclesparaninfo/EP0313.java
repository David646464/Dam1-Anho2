package buclesparaninfo;

import java.util.Scanner;

public class EP0313 {
    public static void main(String[] args) {
        calcularHora();
    }

    private static void calcularHora() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la hora");
        System.out.println("Horas");
        int horas = sc.nextInt();
        System.out.println("Minutos");
        int minutos = sc.nextInt();
        System.out.println("Segundos");
        int segundos = sc.nextInt();

        System.out.println("Introduce los segundos a aumentar:");
        int segundosAumentar = sc.nextInt();

        int segundosAux=(segundos + segundosAumentar) % 60;
        int minutossAux= minutos +(segundos + segundosAumentar) / 60 % 60;
        int horasAux=horas +((segundos + segundosAumentar) / 60 + minutos) / 60 % 24;

        
        if (segundos + segundosAumentar < 60){
            segundos += segundosAumentar;
        }else{
            segundosAux = segundos + segundosAumentar  ;
            segundos = (segundos + segundosAumentar) % 60;
            if(minutos + ((segundosAux + segundosAumentar) /60) < 60){
                minutos +=(segundosAux + segundosAumentar) /60;
            }else{
                minutossAux = minutos;
            }
        }
        System.out.println(horas + " " + minutos + " " + segundos);
    }

}
