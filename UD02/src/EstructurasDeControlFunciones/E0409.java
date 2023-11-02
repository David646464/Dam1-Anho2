package EstructurasDeControlFunciones;

public class E0409 {
    static int mayorDeTres(int num1, int num2, int num3) {
        int numeroFinal = 0;
        if (num1 >= num2) {
            if (num1 >= num3) {
                numeroFinal = num1;
            } else {
                numeroFinal = num3;
            }
        } else if (num2 >= num1) {
            if (num2 >= num3) {
                numeroFinal = num2;
            } else {
                numeroFinal = num3;
            }
        } else if (num3 >= num1) {
            if (num3 >= num2) {
                numeroFinal = num3;
            } else {
                numeroFinal = num2;
            }
            
        }
        return numeroFinal;
    }
}
