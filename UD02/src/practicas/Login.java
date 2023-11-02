package practicas;

import java.util.Scanner;

public class Login {
    static final String USUARIO = "admin";
    static final String CONTRASENHA = "abc123.,";

    public static void main(String[] args) {
        login();
    }

    public static void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del usuario:");
        String usuario = sc.nextLine();
        System.out.println("Introduce la contraseña del usuario:");
        String contrasenha = sc.nextLine();
        sc.close();
        if (usuario.equals(USUARIO)) {
            if (contrasenha.equals(CONTRASENHA)) {
                System.out.println("Bienvenido admin");
            } else {
                System.out.println("Contraseña o usuario incorrecto");
            }
        } else {
            System.out.println("Contraseña o usuario incorrecto");
        }
    }
}
