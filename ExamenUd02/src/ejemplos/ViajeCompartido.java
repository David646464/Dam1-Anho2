package ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ViajeCompartido {
    public void viajeCompartido() {
        Scanner sc = new Scanner(System.in);
        final double PRECIO_MAXIMO_KM = 0.05;
        String origen;
        String destino;
        double distancia = 0;
        int plazas = 0;
        int tipoConbustible = -1;
        double consumoMedio = -1;
        double costeDelViaje = 0;
        double precioPlaza = 0;
        int numeroPasajeros = -1;
        double ganaciaPasajeros = 0;

        System.out.println("Introduce el nombre del origen");
        origen = sc.nextLine();
        System.out.println("Introduce el nombre del destino");
        destino = sc.nextLine();
        
        while (distancia < 1) {
            try {
                System.out.println("Introduce la distancia del viaje en km: ");
                distancia = sc.nextDouble();
                if (distancia < 1) {
                    System.out.println("La distancia tiene que ser uno o mayor");
                }

            } catch (InputMismatchException e) {
                System.out.println("Los datos introducidos no son de tipo double");
            }
        }

        while (plazas < 1 || plazas > 4) {
            try {
                System.out.println("Introduce el numero de plazas : ");
                plazas = sc.nextInt();
                if (plazas < 1 || plazas > 4) {
                    System.out.println("Las plazas pueden ser ente 1 y 4");
                }

            } catch (InputMismatchException e) {
                System.out.println("Los datos introducidos no son de tipo int");
            }
        }

        while (tipoConbustible != 0 && tipoConbustible != 1 && tipoConbustible != 2) {
            try {
                System.out.println("Introduce el tipo de conbustible: ");
                System.out.println("0: para gasolina");
                System.out.println("1: para diesel");
                System.out.println("2: para electrico");
                plazas = sc.nextInt();
                if (tipoConbustible != 0 && tipoConbustible != 1 && tipoConbustible != 2) {
                    System.out.println("Los valores aceptados son: 0, 1 y 2");
                }

            } catch (InputMismatchException e) {
                System.out.println("Los datos introducidos no son de tipo int");
            }
        }

        while (consumoMedio <= 0) {
            try {
                System.out.println("Introduce el consumo medio del vehículo: ");
                consumoMedio = sc.nextDouble();

                if (consumoMedio <= 0) {
                    System.out.println("El consumo tiene que ser mayor que 0");
                }

            } catch (InputMismatchException e) {
                System.out.println("Los datos introducidos no son de tipo double");
            }
        }
        costeDelViaje = costeViaje(distancia, (byte) tipoConbustible, consumoMedio);

        while (precioPlaza <= 0 || precioPlaza > distancia * PRECIO_MAXIMO_KM) {
            try {
                System.out.println("Introduce el precio de la plaza: ");
                precioPlaza = sc.nextDouble();

                if (precioPlaza <= 0 || precioPlaza > distancia * PRECIO_MAXIMO_KM) {
                    System.out.println("El precio de la plaza debe ser mayor a 0 y menor a 5 céntimos por KM");
                }

            } catch (InputMismatchException e) {
                System.out.println("Los datos introducidos no son de tipo double");
            }
        }

        while (numeroPasajeros < 0 || numeroPasajeros > plazas) {
            try {
                System.out.println("Introduce el número de pasajeros: ");
                numeroPasajeros = sc.nextInt();

                if (numeroPasajeros < 0 || numeroPasajeros > plazas) {
                    System.out.println("El numero de pasajeros tiene que estar entre 0 y " + plazas);
                }

            } catch (InputMismatchException e) {
                System.out.println("Los datos introducidos no son de tipo int");
            }
        }

        ganaciaPasajeros = Math.round(numeroPasajeros * precioPlaza * 100) / 100.0;
        costeDelViaje = Math.round(costeDelViaje * 100) / 100.0;

        System.out.println("El viaje va a costar: " + costeDelViaje);
        System.out.println("La ganancia por los pasajeros será: " + ganaciaPasajeros);

    }

    public double costeViaje(double km, byte tipoCombustible, double consumoMedio) {
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

}
