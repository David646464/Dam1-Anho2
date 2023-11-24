package clasesparaninfo.EP0715;

public class MainCalendario {
    public static void main(String[] args) {
        Calendario calendario = new Calendario(30, 4, -1);
        /*calendario.mostrar();
        calendario.incrementarDia();
        calendario.mostrar();
        calendario.incrementarMes();
        calendario.mostrar();*/
        calendario.incrementarAño(2);
        calendario.mostrar();
        System.out.println(calendario.iguales(new Calendario(30, 4, 1)));
    }
}
