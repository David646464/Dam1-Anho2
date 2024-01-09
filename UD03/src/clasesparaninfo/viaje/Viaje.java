package clasesparaninfo.viaje;

import clasesparaninfo.puntoGeografico.PuntoGeografico;
import clasesparaninfo.user.User;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * The type Viaje.
 */
public class Viaje {
    /**
     * The Conductor.
     */
    public User conductor;
    /**
     * The Punto salida.
     */
    public PuntoGeografico puntoSalida;
    /**
     * The Fecha salida.
     */
    public LocalDate fechaSalida;
    /**
     * The Hora salida.
     */
    public LocalTime horaSalida;
    /**
     * The Punto destino.
     */
    public PuntoGeografico puntoDestino;
    /**
     * The Maxplazasofertadas.
     */
    final int MAXPLAZASOFERTADAS = 4;
    /**
     * The Plazas ofertadas.
     */
    public int plazasOfertadas;
    /**
     * The Plazas ocupadas.
     */
    public int plazasOcupadas;

    /**
     * Instantiates a new Viaje.
     *
     * @param conductor       the conductor
     * @param puntoSalida     the punto salida
     * @param fechaSalida     the fecha salida
     * @param horaSalida      the hora salida
     * @param puntoDestino    the punto destino
     * @param plazasOfertadas the plazas ofertadas
     * @param plazasOcupadas  the plazas ocupadas
     */
    public Viaje(User conductor, PuntoGeografico puntoSalida, LocalDate fechaSalida, LocalTime horaSalida, PuntoGeografico puntoDestino, int plazasOfertadas, int plazasOcupadas) {
        this.conductor = conductor;
        this.puntoSalida = puntoSalida;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.puntoDestino = puntoDestino;
        if (plazasOfertadas > 4 || plazasOfertadas < 0) throw new IllegalArgumentException("Valores fuera de rango");
        this.plazasOfertadas = plazasOfertadas;
        this.plazasOcupadas = plazasOcupadas;
    }

    @Override
    public String toString() {
        return  fechaSalida.getDayOfMonth() + "/" + fechaSalida.getMonthValue() + "/" +
                fechaSalida.getYear() + " " + horaSalida.getHour() + ":" + horaSalida.getMinute() +
                " - " + conductor.username + " - " + puntoSalida.nombre + " >> " + puntoDestino.nombre;
    }

    /**
     * Mostrar.
     */
    public void mostrar(){
        System.out.println("Viaje:");
        System.out.println(toString());
        System.out.println("==========");
        System.out.println("Conductor:");
        System.out.println(conductor.toString());
        System.out.println("==========");
        System.out.println("Punto de salida:");
        System.out.println(puntoSalida.toString());
        System.out.println("Enlace a google maps");
        System.out.println(puntoSalida.urlGoogleMaps());
        System.out.println("==========");
        System.out.println("Punto de llegada:");
        System.out.println(puntoDestino.toString());
        System.out.println("Enlace a google maps");
        System.out.println(puntoDestino.urlGoogleMaps());
        System.out.println("==========");
        System.out.println("Plazas ofertadas: " + plazasOfertadas);
        System.out.println("Plazas ocupadas: " + plazasOcupadas);
    }
}
