package funcionesparaninfo;

public class EP0416 {
    public static void main(String[] args) {
        System.out.println(divisoresPrimos(20));
    }
    public static String divisoresPrimos(int num) {
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
