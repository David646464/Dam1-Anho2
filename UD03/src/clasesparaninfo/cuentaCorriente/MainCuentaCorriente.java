package clasesparaninfo.cuentaCorriente;

public class MainCuentaCorriente {
    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente("52136134A", "David");
        cuenta1.mostrarCuenta();
        cuenta1.ingresarDinero(50);
        cuenta1.mostrarCuenta();
        cuenta1.sacarDinero(25);
        cuenta1.mostrarCuenta();
        cuenta1.sacarDinero(26);
        cuenta1.mostrarCuenta();
    }

}
