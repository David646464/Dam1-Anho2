package buclesparaninfo;

public class EP0318 {
    public static void main(String[] args) {

        System.out.println(mcm(12, 8));
        System.out.println(mcm(4, 5)); 
        System.out.println(mcm(12, 18)); 
        System.out.println(mcm(7, 14)); 
        System.out.println(mcm(15, 25));
    }

    private static int mcm(int i, int j) {
        int multiplicacion1Aux = i;
        int contador2 = 1;

        int multiplicacion2Aux = j;
        int contador1 = 1;

        while (multiplicacion1Aux != multiplicacion2Aux) {
            if (multiplicacion1Aux < multiplicacion2Aux) {
                contador1++;
                multiplicacion1Aux = i * contador1;
            } else {
                contador2++;
                multiplicacion2Aux = j * contador2;
            }

        }

        return multiplicacion1Aux;
    }

}
