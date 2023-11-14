package buclesparaninfo;

import java.util.Scanner;

public class EP0320 {
    public static void main(String[] args) {
        sumaDeDinero();
    }

    private static void sumaDeDinero() {
        Scanner sc = new Scanner(System.in);
        String texto = "==============================\nLista de dinero ahorrado\nLugar----------Cantidad\n";
        boolean indicador = true;
        String auxString = "";
        double auxDouble = 1;
        double suma = 0;
        while (indicador) {
            System.out.println("Introduce el lugar donde almacenas el dinero");
            auxString = sc.next();
            if (auxString.length() < "Lugar----------".length()) {
                while (auxString.length() < "Lugar----------".length()) {
                    auxString += " ";
                }
            }
            System.out.println("Introduce el dinero gueraddo allí");
            auxDouble = sc.nextDouble();
            if (auxDouble <= 0) {
                indicador = false;
            } else {
                texto += auxString + auxDouble + "\n";
                suma += auxDouble;
            }
        }
        texto += "Total: " + suma + "\n==============================";

        System.out.println(texto);
    }

}
