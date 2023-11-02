package estructurasDeControlBucles;

import java.util.Scanner;

public class E0302 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mayoresDeEdad = "Mayores de edad: \n";
        int edad = 0;
        int edadtotal = 0;
        int totalAlumnos = 0;
        String alumno = "";
        double media = 0;
        while (edad >= 0) {
            System.out.println("Alumno:");
            alumno = sc.next();
            System.out.println("Edad:");
            edad = sc.nextInt();
            if (edad >= 0) {
                edadtotal += edad;
                if (edad >= 18) {
                    mayoresDeEdad += alumno + " -> " + edad + "\n";
                }
                totalAlumnos++;
            }

        }
        media = edadtotal / totalAlumnos;
        System.out.println("La edad sumada total es: " + totalAlumnos);
        System.out.println("La media es: " + media);
        System.out.println(mayoresDeEdad);

    }

}
