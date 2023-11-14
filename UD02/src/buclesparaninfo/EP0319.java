package buclesparaninfo;

public class EP0319 {
    public static void main(String[] args) {
        raizAproximada(25);

    }

    private static void raizAproximada(int i) {
        int auxInt = 0;
        int contador = 1;
        boolean indicador = true;

        while (indicador) {
            if (contador * contador > i) {
                System.out.println("La raíz aproximada es " + (contador - 1) + " y su resto "
                        + (i - ((contador - 1) * (contador - 1))));
                indicador = false;
            } else {
                contador++;
            }

        }

    }

}
