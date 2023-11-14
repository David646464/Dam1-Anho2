package practicas;

public class a {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            System.out.println(NumAleat());
        }
    }

    public static int NumAleat() {
        int numero = 0;

        numero = (1) + (int) (Math.random() * ((6 - 1) + 1));

        return numero;
    }
    
}
