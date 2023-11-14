package recursividad;

public class Suma {
    public static void main(String[] args) {
        System.out.println(suma(4));
    }

    private static int suma(int i) {
        int numero = 0;
        if (i == 1){
            numero = 1;
        }else{
            numero = i + suma(i-1) ;
        }
        return numero;

    }
    
}
