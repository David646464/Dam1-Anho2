package estructurasDeControlCondicionales;

import java.util.Scanner;

public class Factura {
    public static void main(String[] args) {
        final double IVA = 0.21;
        final double DESCUENTO = 0.5;
        final int UMBRAL = 100;
        double precioTotal = 0;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el precio del producto");
        double precio = sc.nextDouble();

        System.out.println("Introduce la cantidad de productos");
        double unidades = sc.nextDouble();

        sc.close();

        precioTotal = precio * unidades + (precio * unidades * IVA);

        if (precioTotal >= UMBRAL){
            precioTotal = precioTotal -precioTotal * DESCUENTO ;
        }

        System.out.println("El total a pagar es: " +  precioTotal + " €");
    }
    
}
