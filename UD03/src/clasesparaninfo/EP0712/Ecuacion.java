package clasesparaninfo.EP0712;

import clasesparaninfo.EP0711.Libro;

public class Ecuacion {
    static double a;
    static double b;
    static double c;

    public Ecuacion(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public  void calculo() {
        double calculoRaiz = (b * b) - (4 * c * a);
        if (calculoRaiz >= 0) {
            System.out.println("Las dos soluciones son:");
            System.out.println(calculoPositivo(calculoRaiz));
            System.out.println(calculoNegativo(calculoRaiz));
        } else {
            System.out.println("No tiene solución");
        }
    }

    public  double calculoPositivo(double calculoRaiz) {
        double numero = 0;
        numero = (-b + Math.sqrt(calculoRaiz)) / (2 * a);
        return numero;
    }

    public  double calculoNegativo(double calculoRaiz) {
        double numero = 0;
        numero = (-b - Math.sqrt(calculoRaiz)) / (2 * a);
        return numero;
    }
}
