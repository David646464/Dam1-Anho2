//Creador:david sánchez peso
package operadores;

import java.util.Scanner;

public class E0110 {
    public static void main(String[] args) {
        /*Diseña un algoritmo que indique si podemos
        o no salir a la calle, lo que se determinará
        en función de ciertas condiciones, y que lo 
        muestre mediante un literal booleano (true o false)
        . En principio, podremos salir a la calle siempre 
        que no llueva y que hayamos terminado nuestras tareas.
        Además de lo anterior podremos salir a la calle si 
        tenemos que hacer algún recado, como ir al supermercado.
        Para obtener el resultado, el programa debe preguntar 
        por consola y mediante valores booleanos si está lloviendo,
        si hemos terminado nuestras tareas y si tenemos que hacer 
        algún recado.*/
            Scanner sc = new Scanner(System.in);

            System.out.println("Programa para verificar si puedes salr a la calle");
            System.out.println("responte a las preguntas con 'true' o 'false'");
            System.out.println("=====================================================");
            System.out.println("Esta lloviendo?");
            boolean preg1 = sc.nextBoolean();
            System.out.println("=====================================================");

            System.out.println("terminaste las tareas?");
            boolean preg2 = sc.nextBoolean();
            System.out.println("=====================================================");

            System.out.println("Tienes algún recado pendiente?");
            boolean preg3 = sc.nextBoolean();
            System.out.println("=====================================================");

            boolean se;
            boolean booleano = (preg1 == false && preg2 == true && preg3 == false);
            System.out.println(booleano);
    }
}
