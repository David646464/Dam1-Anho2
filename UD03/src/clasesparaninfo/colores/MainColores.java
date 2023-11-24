package clasesparaninfo.colores;

public class MainColores {
    public static void main(String[] args) {
        String[] paleta = Colores.getColores(5);

    for (int i = 0; i < paleta.length; i++) {
        System.out.println(paleta[i]);
    }
    }
    
}
