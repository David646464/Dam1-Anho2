package EstructurasDeControlFunciones;

public class E0406 {
    public static void main(String[] args) {
        System.out.println(esPrimo(2));
    }

    private static boolean esPrimo(int num) {
        boolean aux = true;
        for (int i = 1; i < num / 2; i++) {
            if (num % i == 0 && i != 1) {
                aux = false;
            }
        }
        return aux;
    }
}
