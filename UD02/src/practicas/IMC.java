package practicas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        masaCorporal();
    }

    public static void masaCorporal() {
        boolean indicador = true;
        while (indicador) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("introduce tu peso en kg.\n20 kg > Peso < 300 kg");
                double peso = sc.nextDouble();
                System.out.println("introduce tu altura en cm.\n250 cm > Altura < 50 cm");
                double altura = sc.nextDouble();
                double imc = imc(peso, altura);
                if (peso > 20 && peso < 300 && altura > 50 && altura < 250) {
                    indicador = false;
                    System.out.println("El IMC del usuario es: " + imc);
                    if (imc < 18.50) {
                        System.out.println("Bajo peso");
                    } else if (imc >= 18.5 && imc < 25) {
                        System.out.println("Peso normal");
                    } else if (imc >= 25 && imc < 30) {
                        System.out.println("Sobrepeso");
                    } else if (imc >= 30) {
                        System.out.println("Obesidad");
                    }
                }else{
                    System.out.println("Los datos introducidos son incorrectos.Vuelve a introducirlos dentro de los rangos");
                }
            }catch(InputMismatchException e){
                System.out.println("Los datos introducidos no son de tipo double");
            } 
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    private static double imc(double i, double j) {
        double numAux = 0;
        numAux = i / ((j / 100) * (j / 100));
        return numAux;
    }

}
