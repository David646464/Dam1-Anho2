package estructurasDeControlBucles;

import java.util.Scanner;

public class E0303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAXIMO = 99;
        final int INDICACIONRENDIRSE = 10;
        int numero = 0; 
        int numeroSecreto = (int) (Math.random() * MAXIMO + 1);
        int intento = 0;
        System.out.println("Introduce un numero entre 1 y 99: ");
        do {
            intento++;
            if (intento == INDICACIONRENDIRSE){
                System.out.println("Si te quieres rendir escribe un número negativo");
            }else if (intento == INDICACIONRENDIRSE + 10){
                System.out.println("Aun no lo consigues?");
            }else if (intento == INDICACIONRENDIRSE + 20){
                System.out.println("Termina tu sufrimiento.Escribe -1 y rindete ya");
            }
            numero = sc.nextInt();

            if (numero > numeroSecreto){
                System.out.println("Demasiado alto");
            }else if (numero < numeroSecreto){
                System.out.println("Demasiado bajo");
            }else if (numero > 99 && numero < 1){
                System.out.println("El número introducido no esta en el rango");
            }else{
                System.out.println("Felicidades encontrates el numero secreto al intento: " + intento);
            }
        } while (numeroSecreto != numero && numero >= 0);
    }
    
}
