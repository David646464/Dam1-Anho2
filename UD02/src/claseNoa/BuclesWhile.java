package claseNoa;

public class BuclesWhile {
    public static void main(String[] args) {
        boolean indicador = true;
        int contador1 = 0;
        int contador2 = 0;
        // Bucle while simple
        while (contador2 <= 10) {
            System.out.println(contador2);
            
                contador2++;
            
        }
        // Bucle while con contador
        while (contador1 < 10) {
            System.out.println(contador1);
            contador1++;
        }

        // Reseteamos las variables
        indicador = true;
        contador1 = 0;
        contador2 = 0;

        // Bucle do while
        do {
            System.out.println(contador2);
            if (contador2 == 0) {
                indicador = false;
            } else {
                contador2++;
            }
        } while (indicador);
        // Bucle do while con contador
        do {
            System.out.println(contador1);
            contador1++;
        } while (contador1 < 10);
    }

}
