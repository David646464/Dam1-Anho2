package codigoVariado;

import java.io.IOException;

public class a {
    public static void main(String[] args) {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
        } catch (IOException e) {
        }
    }

}
