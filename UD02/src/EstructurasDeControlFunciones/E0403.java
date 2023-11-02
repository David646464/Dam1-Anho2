package EstructurasDeControlFunciones;

import java.util.Scanner;

public class E0403 {
    final static double PIVALUE = 3.14;

    public static void main(String[] args) {
        calculoCilindro(1, 3.4, 4.4);

    }

    private static void calculoCilindro(int opcion, double radio, double altura) {
        double calculo;

        if (opcion == 1) {
            calculo = 2 * PIVALUE * radio * (altura + radio);
            System.out.println(calculo);
        } else if (opcion == 2) {
            calculo = PIVALUE * (radio * radio) * altura;
            System.out.println(calculo);
        } else {
            System.out.println("El número introducido es incorrecto");
        }
    }

}
