package clasesparaninfo.cuentaCorriente;

public class CuentaCorriente {
    String dni;
    String nombreTitular;
    double saldo;

    public CuentaCorriente(String dni, String nombreTitular) {
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = 0;
    }

    public boolean sacarDinero(double dineroASacar) {
        boolean aux = true;
        if (saldo > dineroASacar) {
            saldo -= dineroASacar;
        } else {
            System.out.println("El saldo total es menor a la cantidad a sacar por lo tanto no se ejecutara la acción");
            aux = false;
        }
        return aux;
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
