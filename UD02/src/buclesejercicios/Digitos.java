package buclesejercicios;

public class Digitos {
    public static void main(String[] args) {
        desconponerNumero(1234);
    }

    private static void desconponerNumero(int i) {
        String auxString = "" + i;
        for (int j = 0; j < auxString.length(); j++) {
            System.out.print(auxString.charAt(j) + " ");
        }
    }
    
}
