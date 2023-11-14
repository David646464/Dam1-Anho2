package claseNoa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce un numero int");
            int numero = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Los datos itroducidos son incorrectos");
        }catch (Exception e) {
            System.out.println(e);
        }

    }

}
