package practicas;

import java.util.Scanner;

public class Supermercado {
    static String tikect = "===================================================================== \n"
            + "Nombre producto ----- cantidad ----- precio/unidad ----- precio total \n";

    public static void main(String[] args) {
        supermercado();
    }

    public static void supermercado() {
        Scanner sc = new Scanner(System.in);
        double importeTotalProducto = 0;
        double importeTotal = 0;
        double dineroIntroducido = -1;
        double importe = 0;
        int cantidad = -1;
        String nombreProducto = "";
        while (importe >= 0) {
            System.out.println("Introduce el nombre del producto");
            nombreProducto = sc.next();
            cantidad = -1;
            importe = 0;
            if (nombreProducto.length() < "Nombre producto ----- ".length()) {
                while (nombreProducto.length() != "Nombre producto ----- ".length()) {
                    nombreProducto += " ";
                }
            }

            while (cantidad < 0) {
                System.out.println("Introduce la cantidad");
                cantidad = sc.nextInt();
                if (cantidad <= 0) {
                    System.out.println("La catidad introducida no es correcta ya que no puede ser negativa ni 0");
                }
            }
            while (importe <= 0 && importe != -1) {
                System.out.println("Introduce el importe por unidad");
                importe = sc.nextDouble();
                if (importe <= 0 && importe != -1) {
                    System.out.println("El importe introducido no es correcto ya que no puede ser negativo ni 0");
                }
            }
            if (importe != -1) {
                importeTotalProducto = (double) Math.round(cantidad * importe * 100) / 100;
                importeTotal += importeTotalProducto;
                tikect += nombreProducto + cantidad + "               " + importe + "               "
                        + importeTotalProducto + "\n";
            }
        }
        tikect += "Importe total: " + importeTotal + "\n";

        System.out.println("En efectivo o con tarjeta");
        System.out.println("escriba efectivo o tarjeta segun lo que quiera");
        String efectTarje = sc.next();

        efectTarje = efectTarje.toUpperCase();

        if (efectTarje.equals("EFECTIVO")) {
            System.out.println("Introduca el dinero ");
            while (dineroIntroducido < importeTotal) {
                dineroIntroducido = sc.nextDouble();
                if (dineroIntroducido < importeTotal) {
                    System.out.println("El dinero introducido no es suficiente vuelve a introducirlo:");
                }
            }

            calculoDelEfectivo(dineroIntroducido, importeTotal);
            tikect += "Metodo de pago: efectivo \n";
            tikect += "===================================================================== \n";
            System.out.println("Gracias por su compra");
            System.out.println("Aqui esta el tikect de su compra");
            System.out.println(tikect);
        } else if (efectTarje.equals("TARJETA")) {
            tikect += "Metodo de pago: tarjeta \n";
            tikect += "===================================================================== \n";
            System.out.println("Gracias por su compra");
            System.out.println("Aqui esta el tikect de su compra");
            System.out.println(tikect);
        }
    }

    private static void calculoDelEfectivo(double dineroIntroducido, double importeTotal) {
        double cambio = dineroIntroducido - importeTotal;
        int cambioEntero = (int) (cambio * 100);
        int cambio50euros = cambioEntero / 5000;
        int cambio20euros = cambioEntero % 5000 / 2000;
        int cambio10euro = cambioEntero % 5000 % 2000 / 1000;
        int cambio5euros = cambioEntero % 1000 / 500;
        int cambio2euros = cambioEntero % 500 / 200;
        int cambio1euros = cambioEntero % 5 % 200 / 100;
        int cambio50cent = cambioEntero % 100 / 50;
        int cambio20cent = cambioEntero % 50 / 20;
        int cambio10cent = cambioEntero % 50 % 20 / 10;
        int cambio5cent = cambioEntero % 10 / 5;
        int cambio2cent = cambioEntero % 5 / 2;
        int cambio1cent = cambioEntero % 5 % 2 / 1;

        tikect += "Dinero ofrecido: " + dineroIntroducido + "\n";
        tikect += "Cambio: " + cambio + "\n";
        imprimeCambio(cambio50euros, 50, 1);
        imprimeCambio(cambio20euros, 20, 1);
        imprimeCambio(cambio10euro, 10, 1);
        imprimeCambio(cambio5euros, 5, 1);
        imprimeCambio(cambio2euros, 2, 2);
        imprimeCambio(cambio1euros, 1, 2);
        imprimeCambio(cambio50cent, 50, 3);
        imprimeCambio(cambio20cent, 20, 3);
        imprimeCambio(cambio10cent, 10, 3);
        imprimeCambio(cambio5cent, 5, 3);
        imprimeCambio(cambio2cent, 2, 3);
        imprimeCambio(cambio1cent, 1, 3);

    }

    private static void imprimeCambio(int cambio, int billeteMoneda, int indicador) {
        if (cambio > 0) {
            if (indicador == 1) {
                tikect += (cambio + " billetes de " + billeteMoneda + " euros");
            } else if (indicador == 2) {
                tikect += (cambio + " monedas de " + billeteMoneda + " euros");
            } else if (indicador == 3) {
                tikect += (cambio + " monedas de " + billeteMoneda + " centimos" + "\n");
            }
        }
    }

}
