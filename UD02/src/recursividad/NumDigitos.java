package recursividad;

public class NumDigitos {
    public static void main(String[] args) {
        System.out.println(numeroDeDigitos(1));
        System.out.println(numeroDeDigitos(-1));
        System.out.println(numeroDeDigitos(10));
        System.out.println(numeroDeDigitos(-10));
    }

    private static int numeroDeDigitos(int i) {
        int numero = 1;
        if (i / 10 > 0 || i / 10 < 0) {
            numero = 1 + numeroDeDigitos(i / 10);
        }
        return numero;
    }

}
