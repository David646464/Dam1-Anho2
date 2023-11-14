package cuentaCorriente;

public class CuentaCorriente {
    String dni;
    String nombreTitular;
    double saldo;

    public CuentaCorriente(String dni, String nombreTitular) {
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = 0;
    }

    public void sacarDinero(double dineroASacar) {
        if (saldo > dineroASacar) {
            saldo -= dineroASacar;
        } else {
            System.out.println("El saldo total es menor a la cantidad a sacar por lo tanto no se ejecutara la acción");
        }
    }

    public void ingresarDinero(double dineroAIngresar) {
        saldo += dineroAIngresar;
    }

    public void mostrarCuenta() {
        System.out.println("=====================");
        System.out.println("Titular: " + nombreTitular);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + saldo);
        System.out.println("=====================");
    }

}
