package claseNoa;

public class funciones {

    public static void main(String[] args) {
        System.out.println(funcionSobrecargada(3.5, 4.7));
    }

    public static int funcionRecursiva(int i) {
        int numero = 0;
        if (i != 0) {
            numero += i + funcionRecursiva(i - 1);
        }
        return numero;
    }

    public static int funcionSobrecargada(int a, int b) {
        System.out.println("int");
        return a + b;
    }

    public static double funcionSobrecargada(double a, double b) {
        System.out.println("double");
        return a + b;
    }

    public static int funcionSobrecargada(int a, int b, int c) {
        return a + b + c;
    }



    public static void funcionVoid(int i) {
        for (int j = 0; j < i; j++) {
            System.out.println(j);
        }
        
    }

    public static int funcionSimple(int i) {
        return i;
    }

}
