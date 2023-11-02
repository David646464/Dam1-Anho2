package funcionesparaninfo;

public class EP0417 {
    public static void main(String[] args) {
        System.out.println(numerosAmigos(220, 284));
    }

    private static String numerosAmigos(int i, int j) {
        int auxNum1 = 0;
        int auxNum2 = 0;
        String texto = "No son amigos";
        for (int j2 = 1; j2 < i; j2++) {
            if (i % j2 == 0) {
                auxNum1 += j2;
            }
        }
        for (int j2 = 1; j2 < j; j2++) {
            if (j % j2 == 0) {
                auxNum2 += j2;
            }
        }
        if (auxNum2 == i && auxNum1 == j) {
            texto = "Son amigos";
        }
        System.out.println(auxNum2);
        System.out.println(auxNum1);
        return texto;
    }

}
