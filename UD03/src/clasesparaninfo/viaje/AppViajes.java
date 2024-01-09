package clasesparaninfo.viaje;

import clasesparaninfo.puntoGeografico.PuntoGeografico;
import clasesparaninfo.user.User;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

/**
 * The type App viajes.
 */
public class AppViajes {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Viaje viaje;

        User conductor;
        String username;
        String password;

        LocalDate fechaSalida;
        LocalTime horaSalida;
        int year;
        int month;
        int day;
        int hour;
        int minute;

        int plazasOfertadas;
        int plazasOcupadas;


        PuntoGeografico puntoSalida;
        double longitud1;
        double latitud1;
        String nombrePunto1;

        PuntoGeografico puntoDestino;
        double longitud2;
        double latitud2;
        String nombrePunto2;


        System.out.println("Bienvenido nuevo usuario vamos a registrarle en la app");
        System.out.println("Introduce su nombre");
        username = sc.nextLine();
        System.out.println("Introduce su contraseña");
        password = sc.nextLine();
        conductor = new User(username, password);
        System.out.println("=======================================================");
        System.out.println("Empecemos a registrar su viaje");
        System.out.println("Como se llama tu punto de salida");
        nombrePunto1 = sc.nextLine();
        System.out.println("Cual es su longitud");
        longitud1 = sc.nextDouble();
        System.out.println("Cual es su latitud");
        latitud1 = sc.nextDouble();
        puntoSalida = new PuntoGeografico(nombrePunto1, longitud1, latitud1);

        sc = new Scanner(System.in);

        System.out.println("Como se llama tu punto de destino");
        nombrePunto2 = sc.nextLine();
        System.out.println("Cual es su longitud");
        longitud2 = sc.nextDouble();
        System.out.println("Cual es su latitud");
        latitud2 = sc.nextDouble();
        puntoDestino = new PuntoGeografico(nombrePunto2, longitud2, latitud2);

        System.out.println("Vamos a marcar la fecha y hora de salida");
        System.out.println("Introduce el año");
        year = sc.nextInt();
        System.out.println("Introduce el mes");
        month = sc.nextInt();
        System.out.println("Introduce el dia");
        day = sc.nextInt();
        System.out.println("Introduce la hora ");
        hour = sc.nextInt();
        System.out.println("Introduce los minutos de la hora ");
        minute = sc.nextInt();

        fechaSalida = LocalDate.of(year, month, day);
        horaSalida = LocalTime.of(hour, minute);


        boolean indicador = true;
        do{
            System.out.println("Cuantas plazas se van a ofertar (minimo 0 máximo 4)");
            plazasOfertadas = sc.nextInt();
            if (plazasOfertadas <= 4 && plazasOfertadas >= 0) indicador = false;
        }while (indicador);
        indicador = true;
        do{
            System.out.println("Cuantas plazas van a estar ocupadas");
            plazasOcupadas = sc.nextInt();
            if (plazasOcupadas <= plazasOfertadas && plazasOcupadas >= 0) indicador = false;
        }while (indicador);

        viaje = new Viaje(conductor,puntoSalida,fechaSalida, horaSalida, puntoDestino, plazasOfertadas, plazasOcupadas);

        viaje.mostrar();

    }
}
