package paraninfo01;

import java.util.Scanner;

public class EP0115 {
    public static void main(String[] args) {
        /*crea un programa que pida los coeficientes a,
         b y c, así como el valor de x, y calcula el valor correspondiente de y */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor de A");
        int numA = sc.nextInt();
        System.out.println("Introduce el valor de B");
        int numB = sc.nextInt();
        System.out.println("Introduce el valor de C");
        int numC = sc.nextInt();
        System.out.println("Introduce el valor de X");
        int numX = sc.nextInt();
        sc.close();
        
        int numY = numA * numX * numX + numB * numX + numC;
        System.out.println("Y sera igual a : " + numY);
    }
}
