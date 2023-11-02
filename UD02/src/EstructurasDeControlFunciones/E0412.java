package EstructurasDeControlFunciones;

public class E0412 {
    public static void main(String[] args) {
        System.out.println(fibonacci(0));
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(6));
        System.out.println(fibonacci(7));
        System.out.println(fibonacci(8));
        System.out.println(fibonacci(9));
        System.out.println(fibonacci(10));
        System.out.println(fibonacci(11));
        
    }

    public static int fibonacci(int i) {
        int numero = 0;
        if (i == 0 || i == 1){
            numero = 1;
        }else {
            numero = fibonacci(i -1) + fibonacci( i - 2);
        }
        return numero;
    }
}
