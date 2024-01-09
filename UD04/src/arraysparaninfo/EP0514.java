package arraysparaninfo;

import java.util.Arrays;
import java.util.Scanner;

public class EP0514 {
    public static void main(String[] args) {
        encuesta();
    }

    public static void encuesta(){
        Scanner sc = new Scanner(System.in);
        int sueldo = 0;
        int suma = 0;
        int media = 0;

        int[] arraySueldos = new int[0];
        //arraySueldos = new int[0];
        while (sueldo >= 0){
            System.out.println("Introduce el sueldo");
            sueldo = sc.nextInt();
            if (sueldo >= 0){
                arraySueldos = Arrays.copyOf(arraySueldos, arraySueldos.length + 1);
                arraySueldos[arraySueldos.length -1] = sueldo;
            }
        }
        Arrays.sort(arraySueldos);

        System.out.println(Arrays.toString(arraySueldos));;

        for (int i = 0; i < arraySueldos.length; i++) {
            suma+= arraySueldos[i];
        }

        media = suma / arraySueldos.length;



        System.out.println("Máximo sueldo: " + arraySueldos[arraySueldos.length -1]);
        System.out.println("Minimo sueldo: " + arraySueldos[0]);
        System.out.println("Media de sueldo: " + media);

    }
}
