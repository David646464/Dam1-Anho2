package practicas;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class LaCalculadoraHumana {

    static final int MAXNUM = 200;
    static final int MINNUM = -200;
    static int solucionAnterior = NumAleat(MINNUM, MAXNUM);
    static final int MAXFALLOS = 7;
    static final int TIEMPO = 60;
    static final int MAXOPERACIONES = 7;
    static int fallos = 0;
    

    public static void main(String[] args) {
        calculadoraHumana();
    }

    public static void calculadoraHumana() {
        int contador = 0;
        System.out.println("===============================================================");
        System.out.println("Bienvenido a Saber y Ganar");
        System.out.println("===============================================================");
        System.out.println("La prueba que tiene a continuación es Calculadora Humana");
        System.out.println("===============================================================");
        System.out.println("Consiste en un juego de simples operaciones encadenadas ");
        System.out.println("en las que el resultado de la anterior estara en la siguiente");
        System.out.println("donde los errores maximos son " + MAXFALLOS + " y se tiene " + TIEMPO + " segundos");
        System.out.println("si no se termina en ese tiempo se perdera del mismo modo");
        System.out.println("===============================================================");
        System.out.println("Dicho esto que comience la Calculadora Humana");
        LocalDateTime segundosAntes = LocalDateTime.now();
        while (fallos != MAXFALLOS && contador != MAXOPERACIONES) {
            contador++;
            generarOperaciones(solucionAnterior);
        }

        LocalDateTime segundosDespues = LocalDateTime.now();
        if (fallos < 7) {
            if (ObtenerSegundos(segundosAntes, segundosDespues) < TIEMPO) {
                System.out.println("Ganastes");
                System.out.println("Tuvistes " + fallos + " fallos");
                System.out.println("Tardastes " + (ObtenerSegundos(segundosAntes, segundosDespues)) + " segundos");
            }
            if (ObtenerSegundos(segundosAntes, segundosDespues) >= TIEMPO) {
                System.out.println("Perdistes por el tiempo pero terminastes las operaciones");
                System.out.println("Tuvistes " + fallos + " fallos");
                System.out.println("Tardastes " + (ObtenerSegundos(segundosAntes, segundosDespues)) + " segundos");
            }
        } else {
            System.out.println("Perdistes por tener mas de " + MAXFALLOS + " fallos");
            System.out.println("Tardastes " + (ObtenerSegundos(segundosAntes, segundosDespues)) + " segundos");
        }
        System.out.println("Fin");
    }

    private static void generarOperaciones(int solucionAnteriorLocal) {

        boolean aux = true;
        Scanner sc = new Scanner(System.in);
        String texto = " ";
        int respuesta = 280;
        int resultado = 280;
        while (aux) {
            int otroOperando = NumAleat(MINNUM, MAXNUM);
            switch (NumAleat(0, 3)) {
                case 0 -> {
                    resultado = solucionAnteriorLocal + otroOperando;
                    texto = solucionAnteriorLocal + " + " + otroOperando;
                }
                case 1 -> {
                    resultado = solucionAnteriorLocal - otroOperando;
                    texto = solucionAnteriorLocal + " - " + otroOperando;
                }
                case 2 -> {
                    resultado = solucionAnteriorLocal * otroOperando;
                    texto = solucionAnteriorLocal + " * " + otroOperando;
                }
                case 3 -> {
                    if (otroOperando > 0 && solucionAnteriorLocal % otroOperando == 0) {
                        resultado = solucionAnteriorLocal / otroOperando;
                        texto = solucionAnteriorLocal + " / " + otroOperando;
                    }
                }

            }
            if (resultado < MAXNUM && resultado > MINNUM) {
                aux = false;
            }

        }
        System.out.println(texto);
        while (respuesta != resultado && fallos < MAXFALLOS) {
            System.out.print("Respuesta: ");
            respuesta = sc.nextInt();
            if (respuesta == resultado) {
                System.out.println("Bien siguiente");
                solucionAnterior = resultado;
            } else {
                System.out.println("Respuesta erronea");
                System.out.println(texto);
                fallos++;
            }
        }
        
    }

    public static int NumAleat(int a, int b) {
        int numero = 0;

        numero = (a) + (int) (Math.random() * ((b - a) + 1));

        return numero;
    }

    public static int ObtenerSegundos(LocalDateTime a, LocalDateTime b) {
        int numero = 0;

        numero = (int) Duration.between(a, b).toSeconds();

        return numero;
    }

}
