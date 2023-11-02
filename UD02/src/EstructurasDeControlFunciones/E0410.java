package EstructurasDeControlFunciones;

public class E0410 {
    static int pow(int a, int n) {
        int aux = a;
        if (n > 0) {
            for (int i = 1; i < n; i++) {
                aux = aux * a;
            }
        } else if (n == 0) {
            aux = 1;
        }
        return aux;
    }

}
