package ejerciciosApuntes;

import java.util.Arrays;

public class E0506 {
    public static int numAciertos(int[] apuesta, int[] ganadora) {
        int aciertos = 0;
        for (int i = 0; i < apuesta.length; i++) {
            for (int j = 0; j < ganadora.length; j++) {
                if (apuesta[i] == ganadora[j]) {
                    aciertos++;
                }
            }
        }
        return aciertos;
    }

    public static void main(String[] args) {
        /*int[] a ={1,2,3,4,10,6};
        int[] b ={10,3,56,10,6,10};
        System.out.println(numAciertos(b,a));*/
        int[] a = tablaAleatoria(1, 7, 6);
        System.out.println(Arrays.toString(a));
    }

    public static int[] tablaAleatoria(int minimo, int maximo, int longituz) {
        int[] a = new int[longituz];
        int aux = 0;
        int aux2 = -7;
        boolean indicador = true;
        for (int i = 0; i < a.length; i++) {
            while (indicador) {
                aux = numAleat(minimo, maximo);
                for (int j = 0; j < a.length; j++) {
                    if (a[j] == aux){
                        aux2 = j;
                    }
                }
                if (aux2  < 0 ) {
                    a[i] = aux;
                    indicador = false;
                }else {
                    aux2 = -1;
                }
            }
            indicador = true;

        }
    return  a;

    }


    public static int numAleat(int i, int j) {
        int numero ;
        numero = (i) + (int) (Math.random() * ((j - i) + 1));
        return numero;
    }

}
