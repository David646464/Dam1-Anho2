package recursividad;

public class Potencia {
    public static void main(String[] args) {
        System.out.println(potencia(4, 4));
    }

    private static int potencia(int i, int j) {
        int numero =0;
        if (j ==0){
            numero = 1;
        }else if (j >0){
            numero = i * potencia(i, j - 1);
        }
        return numero;
    }
    
}
