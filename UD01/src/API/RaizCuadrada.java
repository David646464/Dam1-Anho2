package API;


import java.util.Scanner;

public class RaizCuadrada {
    //Creador:david sánchez peso
    public static void main(String[] args) {
        
        System.out.println("introduce un número que quieras la raiz");
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        double resultado = Math.sqrt(numero);
        String redondeoString = String.format("%.2f", resultado);
        
        


        
        System.out.println("La raíz cudrada de " + numero + " es " + redondeoString);

       
    }
}
