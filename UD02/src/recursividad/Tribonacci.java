package recursividad;

public class Tribonacci {
    public static void main(String[] args) {
        System.out.println(tribonacci(1));
        System.out.println(tribonacci(2));
        System.out.println(tribonacci(3));
        System.out.println(tribonacci(4));
    }

    private static int tribonacci(int i) {
        int numero = 0;
        if (i == 2 || i == 3){
            numero = 1;
        }else if (i < 2){
            numero = 0;
        }else {
            numero = tribonacci(i -1) + tribonacci( i - 2) + tribonacci(i - 3)  ;
        }
        return numero;
    }
    
}
