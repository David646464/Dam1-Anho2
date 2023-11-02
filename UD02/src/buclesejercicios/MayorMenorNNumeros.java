package buclesejercicios;

import java.util.Scanner;

public class MayorMenorNNumeros {
    public static void main(String[] args) {
        mayorMenos();
    }

    private static void mayorMenos() {
        Scanner sc = new Scanner(System.in);
        boolean indicador = true;
        int auxInt = 0;
        int menor = 0;
        int mayor = 0;
        while (indicador) {
            System.out.println("Introduce un número entero positivo distinto a 0:");
            auxInt = sc.nextInt();
            if (menor == 0 && menor ==0){
                menor = auxInt;
                mayor = auxInt;
            }
            if (auxInt <=0){
                indicador = false;
            }
            if (auxInt > mayor){
                mayor = auxInt;
            }
            if (auxInt < menor && auxInt > 0){
                menor = auxInt;
            }
        }
        System.out.println("El númeor mayor introducido es: " + mayor + " y el número menor es: " + menor);
    }
}
