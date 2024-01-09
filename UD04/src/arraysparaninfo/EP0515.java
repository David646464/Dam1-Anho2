package arraysparaninfo;

import java.util.Scanner;

public class EP0515 {
    public static void main(String[] args) {
        centroEducativo();
    }

    private static void centroEducativo() {
        //5 5 5 6 6 6 7 7 7 8 8 8 9 9 9 datos de prueba
        Scanner sc = new Scanner(System.in);
        double[][] grupoAlumnos = new double[5][4];
        double suma = 0;
        double media;
        boolean indicador = true;
        int numAlumno = 0;
        for (int i = 1; i <=5; i++) {
            grupoAlumnos[i-1][0] = i;
            for (int j = 1; j <= 3; j++) {
                System.out.println("Introduce la nota del trimestre " + j + " del alumno " + i);
                grupoAlumnos[i-1][j] = sc.nextDouble();
                suma += grupoAlumnos[i-1][j];
            }
        }

        media = suma / 15;
        System.out.println(suma);
        System.out.println(media);

        do{
            System.out.println("Quieres una media de un alumno en particular?");
            System.out.println("Si quieres escribe 'yes' y si no quieres escribe 'no'");
            sc = new Scanner(System.in);
            String confirmacion = sc.nextLine();
            if (confirmacion.equals("yes")){
                System.out.println("Que numero de usuario quieres buscar");
                numAlumno = sc.nextInt();
                System.out.println("La media del alumno " + numAlumno + " es: " + mediaAlumno(grupoAlumnos, numAlumno));
            } else if (confirmacion.equals("no")) {
                indicador = false;
            }else{
                System.out.println("No has introducido una instruccion adecuada '" + confirmacion + "'");
            }
        }
        while (indicador);
    }

    private static double mediaAlumno(double[][] grupoAlumnos, int numAlumno) {
        if (numAlumno < 1 || numAlumno > 5) throw new IllegalArgumentException("Valor fuera de rango 1-5");
        double suma = 0;
        for (int i = 1; i <= 3; i++) {
            suma += grupoAlumnos[numAlumno - 1 ][i];
        }

        return suma / 3;
    }
}
