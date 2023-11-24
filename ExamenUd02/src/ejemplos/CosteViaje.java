package ejemplos;

public class CosteViaje {

    static public double costeViaje(double km, byte tipoCombustible, double consumoMedio) {
        final double COSTE_GASOLINA = 1.638;
        final double COSTE_DIESEL = 1.638;
        final double COSTE_ELECTRICO = 0.1692;
        double aux = 0;
        double consumo = km * consumoMedio / 100;
        switch (tipoCombustible) {
            case 0:
                aux = consumo * COSTE_GASOLINA;
                break;

            case 1:
                aux = consumo * COSTE_DIESEL;
                break;

            case 2:
                aux = consumo * COSTE_ELECTRICO;
                break;

            default:
                System.out.println("No hay un tipo de combustible atribuido a ese valor");
                break;
        }

        return aux;
    }

    public static void main(String[] args) {
        costeViaje(0, (byte) 0, 0);
    }
}
