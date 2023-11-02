package codigoVariado;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Apuntes {

    
    public static void main(String[] args) {
        System.out.println(NumAleat(-200, 200));

    }

    /*número aletorio entre los numeros dados los cuales estan incluidos usando math.random, 
    el primero desde donde comienza el intervalo y el segundo donde termina (a <= numero >= b)*/
    public static int NumAleat(int a, int b){
        int numero =0;

        numero = (a) + (int) (Math.random()*((b-a) + 1));
    
        return numero;
    }  
    /*Programa que identifica primos con bucle for */
    public static boolean IdetPrimos(int a){
        
        boolean aux = false;
        System.out.println("dime el  número");
        
        if (a != 1 ){
            for (int i = 2 ; i != a/2 + 1 ; i++){
            
                if ((a % i) == 0 ) {
                    aux = true;
                    break;
                }
            }
        }
    return aux;
    }

    /*Codigo para identificar pares e impares */
    public static boolean IdentParImp(int numero){
    
        boolean aux = false;

        if ((numero % 2) == 0){
            aux = false;
        }
        else{
            aux = true;
        }

        return aux;
    }

    /*Programa calculadora usando switch y Scanner */
    public static void calculadora(){
        int numero1 = 1;
       try (Scanner sc = new Scanner(System.in)) {
        try (Scanner sc2 = new Scanner(System.in)) {
            while (numero1 == 1){
             
              System.out.println("dime el primer número");
               int a = sc.nextInt();

              System.out.println("dime el segundo número");
              int b = sc.nextInt();

               System.out.println("Escribe que quieres hacer");
               System.out.println("Sumar 1");
               System.out.println("Restar 2");
               System.out.println("Multiplicar 3");
               System.out.println("Dividir 4");
               int numero2 = sc2.nextInt();
               
              switch(numero2){
                case 1 :
                sumar(a, b);
                break;
                case 2 :
                restar(a, b);
                break;
                case 3 :
                multiplicar(a, b);
                break;
                case 4 :
                dividir(a, b);
                break;
                
              }
              System.out.println("Quieres hacer otra operación?");
              System.out.println("'1' para hacer otra operacion, '2' para salir");
               numero1 = sc2.nextInt();
            }
        }
    }
}
    public static void sumar(int a , int b){
        int c = 0; 
      c = a + b;
      System.out.println("La suma es " + c);
    }
    public static void restar(int a , int b){
        int c = 0; 
      c = a - b;
      System.out.println("La resta es " + c);

    }
    public static void multiplicar(int a , int b){
        int c = 0; 
      c = a * b;
      System.out.println("La multiplicación es " + c);
    }
    public static void dividir(int a , int b){
        double c = 0; 
      c = (double) a / (double) b;
      System.out.println("La división es " + c);
    }


}
