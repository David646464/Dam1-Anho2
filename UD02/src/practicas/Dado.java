package practicas;

public class Dado {
    public static void main(String[] args) {
        dado(1000);
    }

    private static void dado(int num) {
        int dado1 = 0;
        int dado2 = 0;
        int dado3 = 0;
        int dado4 = 0;
        int dado5 = 0;
        int dado6 = 0;

        for (int i = 0; i < num; i++) {
            int numero = NumAleat();
            switch (numero) {
                case 1:
                    dado1++;
                    break;
                case 2:
                    dado2++;
                    break;
                case 3:
                    dado3++;
                    break;
                case 4:
                    dado4++;
                    break;
                case 5:
                    dado5++;
                    break;
                case 6:
                    dado6++;
                    break;

            }
        }

        System.out.println("RESULTADOS:");
        System.out.println("Ha salido 1: " + dado1 + " ( " + dado1*100.0 / 1000.0 + "% )");
        System.out.println("Ha salido 2: " + dado2 + " ( " + dado2*100.0 / 1000.0 + "% )");
        System.out.println("Ha salido 3: " + dado3 + " ( " + dado3*100.0 / 1000.0 + "% )");
        System.out.println("Ha salido 4: " + dado4 + " ( " + dado4*100.0 / 1000.0 + "% )");
        System.out.println("Ha salido 5: " + dado5 + " ( " + dado5*100.0 / 1000.0 + "% )");
        System.out.println("Ha salido 6: " + dado6 + " ( " + dado6*100.0 / 1000.0 + "% )");
    }

    public static int NumAleat() {
        int numero = 0;

        numero = (1) + (int) (Math.random() * ((6 - 1) + 1));

        return numero;
    }

}
