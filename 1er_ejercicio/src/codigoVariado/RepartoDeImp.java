package codigoVariado;
import java.util.Scanner;

public class RepartoDeImp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuanto e sel importe");
        Double importe = sc.nextDouble();
        System.out.println("Cuantos comensales");
        Double comensales = sc.nextDouble();

        double inmpPers = importe / comensales;

        System.out.println("Cada persona tiene que pagar " + inmpPers + " euros");
    }
    
}
