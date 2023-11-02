package EstructurasDeControlFunciones;

public class E0408 {
    static int calculadora(int indicador, int num1, int num2) {
        int aux = 0;

        switch (indicador) {
            case 1 -> {
                aux = num1 + num2;
            }
            case 2 -> {
                aux = num1 - num2;
            }
            case 3 -> {
                aux = num1 * num2;
            }
             case 4 -> {
                if (num2 != 0){
                    aux = num1 / num2;
                }else{
                    System.out.println("No se puede dividir por 0");
                }
                
            }
        }
        return aux;
    }

}
