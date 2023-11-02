package funcionesparaninfo;

public class EP0414 {
    public static void main(String[] args) {
        System.out.println(totalSegundo(23, 43, 55));
    }

    private static int totalSegundo(int horas, int minutos, int segundos) {
        final int totalSegundosHora = 3600;
        final int totalSegundosMinuto = 60;
        return horas * totalSegundosHora + minutos * totalSegundosMinuto + segundos;
    }

}
