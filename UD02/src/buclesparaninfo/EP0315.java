package buclesparaninfo;

public class EP0315 {
    public static void main(String[] args) {

        crearTrianguloPascal(4);
    }

    public static void crearTrianguloPascal(int num) {

        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(calculatePascal(i, j));
            }
            System.out.println();
        }

    }

    public static int factorial(int num) {
        int auxInt = 1;
        for (int i = num; i > 0; i--) {
            auxInt = auxInt * i;
        }
        return auxInt;
    }   

    public static int calculatePascal(int n, int m) {
        if (m == 0 || m == n) {
            return 1;
        } else {
            int numerator = 1;
            int denominator = 1;
            numerator = factorial(n);
            denominator = factorial(m);
            denominator *= factorial(n - m);
            return numerator / denominator;
        }
    }

}
