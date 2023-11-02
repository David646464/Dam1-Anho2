package EstructurasDeControlFunciones;

public class E0405 {
    public static void main(String[] args) {
        System.out.println(esVocal('b'));
    }

    private static boolean esVocal(char c) {
        boolean aux = false;
        final String VOCALES = "aeiouAEIOU";
        if (VOCALES.contains(Character.toString(c))){
            aux = true;
        }
        return aux;
    }
    
}
