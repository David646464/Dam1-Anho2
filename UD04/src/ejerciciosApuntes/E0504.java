package ejerciciosApuntes;

public class E0504 {
    public static int maximo(int t[]){
        int maximoNumero= -999999999;
        for (int numero:t) {
            if (numero > maximoNumero){
                maximoNumero = numero;
            }
        }

        return  maximoNumero;
    }

    public static void main(String[] args) {
        int[] t = {1,2,42,4,7,6,6};
        System.out.println(maximo(t));
    }
}
