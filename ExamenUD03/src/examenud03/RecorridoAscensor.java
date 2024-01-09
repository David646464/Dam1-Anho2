//David Sánchez Peso
package examenud03;

import java.util.Scanner;

public class RecorridoAscensor {
    public static void main(String[] args) {
        //Variables
        Ascensor ascensor =  new Ascensor(0, 9);
        Scanner sc = new Scanner(System.in);
        boolean indicador = true;
        int numAux1 = 0;
        int numAux2 = 0;
        int sumaDistancia = 0;

        //explicacion para el usuario
        System.out.println("Introduce una lista de numeros enteros y despues de cada uno pulsa 'enter'");
        System.out.println("Para salir del programa y calcule la distancia escribe -1");

        System.out.println("Introduce el piso");
        numAux1 = sc.nextInt();

        //Bucle while
        while (indicador){
            System.out.println("Introduce el piso");
            numAux2 = sc.nextInt();
            if (numAux2 == -1){
                indicador = false;
            }else{
                if (numAux1 > numAux2){

                    sumaDistancia += numAux1 - numAux2;
                    ascensor.bajarN(numAux1- numAux2);

                } else if (numAux1 < numAux2) {

                    sumaDistancia += numAux2 - numAux1;
                    ascensor.subirN(numAux2 - numAux1);
                }
                numAux1 = numAux2;
            }

        }

        //Salida de informacion para el usuario
        System.out.println("La distacia total recorrida del ascensor es: " + sumaDistancia);
    }
}
