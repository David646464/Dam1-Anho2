package clasesparaninfo.EP0714;

public class Cambio {
    // Todos los billetes estan pasados a centimos
    // En el nombre de las variables el final que sea E o C indica euro o centimo
    // respectivamente
    // Billetes
    final static int BILLETEDE500E = 50000;
    final static int BILLETEDE200E = 20000;
    final static int BILLETEDE100E = 10000;
    final static int BILLETEDE50E = 5000;
    final static int BILLETEDE20E = 2000;
    final static int BILLETEDE10E = 1000;
    final static int BILLETEDE5E = 500;

    // Monedas
    final static int MONEDADE2E = 200;
    final static int MONEDADE1E = 100;
    final static int MONEDADE50C = 50;
    final static int MONEDADE20C = 20;
    final static int MONEDADE10C = 10;
    final static int MONEDADE5C = 5;
    final static int MONEDADE2C = 2;
    final static int MONEDADE1C = 1;

    public static void devolverCambio(double ImporteCompra, double ImporteOfrecido) {
        double cambio = ImporteOfrecido - ImporteCompra;
        int cambioEntero = (int) (cambio * 100);
        int cambio500euros = cambioEntero / BILLETEDE500E;
        int cambio200euros = cambioEntero % BILLETEDE500E / BILLETEDE200E;
        int cambio100euros = cambioEntero % BILLETEDE500E % BILLETEDE200E / BILLETEDE100E;
        int cambio50euros = cambioEntero % BILLETEDE100E / BILLETEDE50E;
        int cambio20euros = cambioEntero % BILLETEDE50E / BILLETEDE20E;
        int cambio10euro = cambioEntero % BILLETEDE50E % BILLETEDE20E / BILLETEDE10E;
        int cambio5euros = cambioEntero % BILLETEDE10E / BILLETEDE5E;
        int cambio2euros = cambioEntero % BILLETEDE5E / MONEDADE2E;
        int cambio1euros = cambioEntero % BILLETEDE5E % MONEDADE2E / MONEDADE1E;
        int cambio50cent = cambioEntero % MONEDADE1E / MONEDADE50C;
        int cambio20cent = cambioEntero % MONEDADE50C / MONEDADE20C;
        int cambio10cent = cambioEntero % MONEDADE50C % MONEDADE20C / MONEDADE10C;
        int cambio5cent = cambioEntero % MONEDADE10C / MONEDADE5C;
        int cambio2cent = cambioEntero % MONEDADE5C / MONEDADE2C;
        int cambio1cent = cambioEntero % MONEDADE5C % MONEDADE2C / MONEDADE1C;

        imprimeCambio(cambio500euros, 500, 1);
        imprimeCambio(cambio200euros, 200, 1);
        imprimeCambio(cambio100euros, 100, 1);
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
                if (cambio == 1) {
                    System.out.println(cambio + " billete de " + billeteMoneda + " euros");
                } else {
                    System.out.println(cambio + " billetes de " + billeteMoneda + " euros");
                }

            } else if (indicador == 2) {
                if (cambio == 1) {
                    System.out.println(cambio + " moneda de " + billeteMoneda + " euro");
                } else {
                    System.out.println(cambio + " monedas de " + billeteMoneda + " euro");
                }

            } else if (indicador == 3) {

                if (cambio == 1) {
                    System.out.println(cambio + " moneda de " + billeteMoneda + " centimo");
                } else {
                    System.out.println(cambio + " monedas de " + billeteMoneda + " centimo");
                }

            }
        }
    }

}
