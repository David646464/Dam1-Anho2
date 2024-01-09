package ejerciciosApuntes;

public class E0501 {

    public static int suma10Aleatorios(){
        int suma = 0;
        int[] arrayInts = new int[10];

        for (int i = 0; i < arrayInts.length; i++) {
            arrayInts[i] = numAleat(1,100);
        }
        for (int i = 0; i < arrayInts.length; i++) {
            suma+= arrayInts[i];
        }
        System.out.println(suma);
        return  suma;
    }

    public static int numAleat(int i, int j) {
        int numero;
        numero = (i) + (int) (Math.random() * ((j - i) + 1));

        return numero;
    }

    public static void main(String[] args) {

        suma10Aleatorios();
    }
}
