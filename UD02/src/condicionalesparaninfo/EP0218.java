package condicionalesparaninfo;

import java.util.Scanner;

public class EP0218 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1 = (1) + (int) (Math.random() * ((99 - 1) + 1));
        int numero2 = (1) + (int) (Math.random() * ((99 - 1) + 1));
        int operacion = (1) + (int) (Math.random() * ((3 - 1) + 1));
        int resultadoCalculado =0;
        
        switch (operacion) {
            case 1 -> {
                System.out.println("Dime la suma entre " + numero1 + " y " + numero2);
                resultadoCalculado = numero1 + numero2;
            }
            case 2 -> {
                System.out.println("Dime la resta entre " + numero1 + " y " + numero2);
                resultadoCalculado = numero1 - numero2;

            }
            case 3 -> {
                System.out.println("Dime la multiplicación entre " + numero1 + " y " + numero2);
                resultadoCalculado = numero1 * numero2;

            }
        }

        int resultadoDelUsuario = sc.nextInt();
        sc.close();
        if (resultadoDelUsuario == resultadoCalculado) {
            System.out.println("Acertastes");
        } else {
            System.out.println("Fallastes.La solucion era: " + (resultadoCalculado));
        }
    }

}
