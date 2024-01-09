//David Sanchez Peso
package examenud03;

import java.util.Scanner;

public class RecorridoDosAscensores {

    public static void main(String[] args) {
        //Variables
        Ascensor ascensor1 =  new Ascensor(0, 9);
        Ascensor ascensor2 =  new Ascensor(0, 9);
        Scanner sc = new Scanner(System.in);
        boolean indicador = true;
        int numAux1 = 0;
        int numAux2 = 0;
        int sumaDistancia1 = 0;
        int sumaDistancia2 = 0;
        int contadorAux = 0;

        //Explicación para el usuario
        System.out.println("Introduce una lista de numeros enteros y despues de cada uno pulsa 'enter'");
        System.out.println("Para salir del programa y calcule la distancia escribe -1");

        //Bucle while
        while (indicador){
            if (contadorAux ==0){
                System.out.println("Introduce el piso de origen");
                numAux1 = sc.nextInt();
                ascensor1.irAlPiso(numAux1);
            }else {
                System.out.println("Introduce el piso de origen");
                numAux1 = sc.nextInt();
            }
            contadorAux++;

            if (numAux1 == -1){
                indicador = false;
            }else{
                System.out.println("Introduce el piso de destino");
                numAux2 = sc.nextInt();

                //If para cuando el ascensor 1 esta mas cerca
                if (Math.abs(ascensor1.pisoActual - numAux1) <= Math.abs(ascensor2.pisoActual - numAux1)){
                    if (numAux2 == -1){
                        indicador = false;
                    }else{
                        if (ascensor1.pisoActual > numAux1){

                            sumaDistancia1 += ascensor1.pisoActual - numAux1;
                            ascensor1.bajarN(ascensor1.pisoActual- numAux1);

                        } else if (ascensor1.pisoActual < numAux1) {

                            sumaDistancia1 += numAux1 - ascensor1.pisoActual;
                            ascensor1.subirN(numAux1 - ascensor1.pisoActual);
                        }

                        if (numAux1 > numAux2){

                            sumaDistancia1 += numAux1 - numAux2;
                            ascensor1.bajarN(numAux1- numAux2);

                        } else if (numAux1 < numAux2) {

                            sumaDistancia1 += numAux2 - numAux1;
                            ascensor1.subirN(numAux2 - numAux1);
                        }
                    }
                    //If para cuando el ascensor 2 esta mas cerca
                } else if (Math.abs(ascensor1.pisoActual - numAux1) > Math.abs(ascensor2.pisoActual - numAux1)) {
                    if (ascensor2.pisoActual > numAux1){

                        sumaDistancia2 += ascensor2.pisoActual - numAux1;
                        ascensor2.bajarN(ascensor2.pisoActual- numAux1);

                    } else if (ascensor2.pisoActual < numAux1) {

                        sumaDistancia2 += numAux1 - ascensor2.pisoActual;
                        ascensor2.subirN(numAux1 - ascensor2.pisoActual);
                    }

                    if (numAux1 > numAux2){

                        sumaDistancia2 += numAux1 - numAux2;
                        ascensor2.bajarN(numAux1- numAux2);

                    } else if (numAux1 < numAux2) {

                        sumaDistancia2 += numAux2 - numAux1;
                        ascensor2.subirN(numAux2 - numAux1);
                    }
                }
            }

        }

        //Salida de informacion para el usuario
        System.out.println("La distacia total recorrida del ascensor 1 es: " + sumaDistancia1);
        System.out.println("La distacia total recorrida del ascensor 2 es: " + sumaDistancia2);
    }
}
