package buclesparaninfo;

public class EP0316 {
    public static void main(String[] args) {
        triangulo(6);
    }

    private static void triangulo(int num) {

        for (int j = 0; j < num; j++) {
            for (int i = 0; i < num-j ; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
