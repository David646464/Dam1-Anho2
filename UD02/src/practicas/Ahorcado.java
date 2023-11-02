package practicas;

import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean victoria = false;
        boolean aux = false;
        PullAhorcado pull = new PullAhorcado();
        String[] palabraSecret = pull.palabraPull();
        String palabraSecreta = palabraSecret[1];
        String categoria = palabraSecret[0];
        String palabramostrada = "";
        String palabramostradaAux = "";
        char letraAux = 'a';

        String letrasUsadas = "";
        int contador = 0;

        for (int i = 0; i < palabraSecreta.length(); i++) {

            if (palabraSecreta.charAt(i) == ' ') {
                palabramostradaAux += " ";
            } else {
                palabramostradaAux += "_";
            }

        }

        System.out.println("=================================");
        System.out.println("PALABRA:");
        System.out.println(palabramostradaAux);
        while (victoria != true && contador < 7) {
            aux = false;
            palabramostrada = "";
            System.out.println("=================================");
            System.out.println("CATEGORIA: " + categoria);
            System.out.println("=================================");
            System.out.println("Introduce tu letra: ");
            char letra = sc.next().charAt(0);
            if (letrasUsadas.contains(Character.toString(letra))) {
                System.out.println("Esa letra ya ha sido introducida");
            } else {
                for (int i = 0; i < palabraSecreta.length(); i++) {
                    letraAux = palabraSecreta.charAt(i);
                    if (letra == letraAux && !letrasUsadas.contains(Character.toString(letra))) {
                        aux = true;
                        palabramostrada += Character.toString(letraAux);
                    } else {

                        palabramostrada += Character.toString(palabramostradaAux.charAt(i));
                    }
                }
                if (!aux) {
                    contador++;
                }
                palabramostradaAux = palabramostrada;
                letrasUsadas += Character.toString(letra);
            }

            System.out.println("=================================");
            System.out.println("PALABRA:");
            System.out.println(palabramostradaAux);
            System.out.println("=================================");
            System.out.println("LETRAS USADAS:");
            System.out.println(letrasUsadas);
            System.out.println("=================================");
            switch (contador) {
                case 0 -> {
                    System.out.println("  ___ ");
                    System.out.println(" |   |    FALLOS: 0");
                    System.out.println("     |");
                    System.out.println("     |");
                    System.out.println("     |");
                    System.out.println("     |");
                    System.out.println("     |");
                    System.out.println(" ____|");
                }
                case 1 -> {
                    System.out.println("  ___ ");
                    System.out.println(" |   |    FALLOS: 1");
                    System.out.println(" o   |");
                    System.out.println("     |");
                    System.out.println("     |");
                    System.out.println("     |");
                    System.out.println("     |");
                    System.out.println(" ____|");
                }
                case 2 -> {
                    System.out.println("  ___ ");
                    System.out.println(" |   |    FALLOS: 2");
                    System.out.println(" o   |");
                    System.out.println(" |   |");
                    System.out.println("     |");
                    System.out.println("     |");
                    System.out.println("     |");
                    System.out.println(" ____|");
                }
                case 3 -> {
                    System.out.println("  ___ ");
                    System.out.println(" |   |    FALLOS: 3");
                    System.out.println(" o   |");
                    System.out.println("/|   |");
                    System.out.println("     |");
                    System.out.println("     |");
                    System.out.println("     |");
                    System.out.println(" ____|");
                }
                case 4 -> {
                    System.out.println("  ___ ");
                    System.out.println(" |   |    FALLOS: 4");
                    System.out.println(" o   |");
                    System.out.println("/|\\  |");
                    System.out.println("     |");
                    System.out.println("     |");
                    System.out.println("     |");
                    System.out.println(" ____|");
                }
                case 5 -> {
                    System.out.println("  ___ ");
                    System.out.println(" |   |    FALLOS: 5");
                    System.out.println(" o   |");
                    System.out.println("/|\\  |");
                    System.out.println(" |   |");
                    System.out.println("     |");
                    System.out.println("     |");
                    System.out.println("     |");
                    System.out.println(" ____|");
                }
                case 6 -> {
                    System.out.println("  ___ ");
                    System.out.println(" |   |    FALLOS: 6");
                    System.out.println(" o   |");
                    System.out.println("/|\\  |");
                    System.out.println(" |   |");
                    System.out.println("/    |");
                    System.out.println("     |");
                    System.out.println(" ____|");
                }
                case 7 -> {
                    System.out.println("  ___ ");
                    System.out.println(" |   |    FALLOS: 7");
                    System.out.println(" o   |");
                    System.out.println("/|\\  |");
                    System.out.println(" |   |");
                    System.out.println("/ \\  |");
                    System.out.println("     |");
                    System.out.println("     |");
                    System.out.println(" ____|");
                }

            }
            System.out.println("=================================");
            if (palabramostradaAux.equals(palabraSecreta)) {
                victoria = true;
            }

            if (victoria == true) {
                System.out.println("Ganastes");
            } else if (contador >= 7) {
                System.out.println("Perdistes");
                System.out.println("La palabra era: " + palabraSecreta);
            }

        }
    }
}
