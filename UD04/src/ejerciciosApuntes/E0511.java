package ejerciciosApuntes;

import java.util.Arrays;
import java.util.Scanner;

public class E0511 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String combinacionUsuario = "     ";
        System.out.println("Introduce la longituz de la combinación");
        int[] combinacion = new int[sc.nextInt()];
        for (int i = 0; i < combinacion.length; i++) {
            combinacion[i] = numAleat(1, 5);
        }
        System.out.println(Arrays.toString(combinacion));



        while (comprobar(combinacion, combinacionUsuario)){
            System.out.println("Introduce la combinación como este ejemplo (1254");
            sc = new Scanner(System.in);
            combinacionUsuario = sc.nextLine();
            if (combinacionUsuario.length() == combinacion.length) {
                for (int i = 0; i < combinacion.length; i++) {
                    System.out.println(combinacionUsuario.charAt(i) +
                            sonIguales(combinacionUsuario.charAt(i),
                                    combinacion[i]));
                }
            }else {
                System.out.println("Hss introducido mal la combinación");
            }
        }
        System.out.println("Felicidades encontraste la combinacion");


    }
    public static boolean comprobar(int[] a, String combinacion){
        boolean indicador = true;
        String combinacionString = "";
        for (int i = 0; i < a.length; i++) {
            combinacionString += a[i];
        }
        if (combinacion.equals(combinacionString)){
            indicador = false;
        }
        return indicador;
    }
    public static String sonIguales(char digito, int numero){
        String frase = "";
        if (Character.getNumericValue(digito) == numero){
            frase = " son Iguales";
        } else if (Character.getNumericValue(digito) > numero) {
            frase = " es mayor";
        }else {
            frase = " es menor";
        }
        return frase;
    }
    public static int numAleat(int i, int j) {
        int numero ;
        numero = (i) + (int) (Math.random() * ((j - i) + 1));
        return numero;
    }
}
