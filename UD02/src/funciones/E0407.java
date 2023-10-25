package funciones;

import org.junit.jupiter.api.Test;

public class E0407 {

    static String divisoresPrimos(int num) {
        String aux = "-";
        boolean aux2 = true;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {

                for (int j = 1; j < i; j++) {
                    if (i % j == 0 && j != 1) {
                        aux2 = false;
                    }
                }
                if (aux2) {
                    aux += i + "-";
                }
            }
        }
        return aux;
    }
}