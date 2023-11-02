package EstructurasDeControlFunciones;

public class E0404 {
    public static void main(String[] args) {
        System.out.println(mayorQue(2, 2));
    }

    static int mayorQue(int num1, int num2) {
        int numero = 0;
        if (num1 > num2){
            numero = num1;
        }else if (num1 < num2){
            numero = num2;
        }else{
            numero = num1;
        }
        return numero;
    }
    
}
