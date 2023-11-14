package recursividad;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(9));
    }

    private static int factorial(int i) {
        int numero = 0;
        if (i == 1){
            numero = 1;
        }else{
            numero = i * factorial(i-1) ;
        }
        return numero;

    }
    
}
