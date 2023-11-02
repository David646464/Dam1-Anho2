package EstructurasDeControlFunciones;

public class E0402 {
    public static void main(String[] args) {
        numEntre(3, 5);
    }

    public static void numEntre(int num1, int num2) {
        for (int i = num1 + 1; i < num2; i++) {
            System.out.println(i);
        }
    }

}
