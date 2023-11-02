package funcionesparaninfo;

public class EP0413 {
    public static void main(String[] args) {
        muestraPares(2);
        muestraPares(10);
        muestraPares(20);
        /*Resultados
        0 2 
        0 2 4 6 8 10 12 14 16 18
        0 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38
         */
    }

    public static void muestraPares(int n) {
        int numPares = 0;
        int auxInt = 0;

        while (n > numPares) {
            System.out.print(auxInt + " ");
            auxInt += 2;
            numPares++;

        }
        System.out.println();
    }
}
