package pruebas;

import java.time.LocalDate;

public class Tren {
    int codigoTren;
    LocalDate inicio;
    boolean operativo;
    int capacidad;
    int numPersonas;

//CONSTRUCTORES

    public Tren(int codigoTren, LocalDate inicio, boolean operativo, int capacidad, int numPersonas) {
        this.codigoTren = codigoTren;
        this.inicio = inicio;
        this.operativo = operativo;
        this.capacidad = capacidad;
        this.numPersonas = numPersonas;
    }

    public Tren(int codigoTren, boolean operativo) {
        this.codigoTren = codigoTren;
        this.operativo = operativo;
        if (operativo == true){
            this.inicio = LocalDate.now();
        }
    }

    public  void operativo_On(){
        if (operativo == false){
            operativo = true;
        }
    }

    public  void operativo_Off(){
        if (operativo == true){
            operativo = false;
        }
    }

    public  void subirPasajeros (int pasajerosSuben){
        if (numPersonas + pasajerosSuben > capacidad){
            throw new IllegalArgumentException("este tren lo tiene tanta capacidad");
        }
    }

    public  void bajarPasajeros (int pasajerosBajan){
        if (numPersonas - pasajerosBajan < 0){
            throw new IllegalArgumentException("un tren no pude llerar pasajeros negativos");
        }
    }

    @Override
    public String toString() {
        return "Tren{" +
                "codigoTren=" + codigoTren +
                ", inicio=" + inicio +
                ", operativo=" + operativo +
                ", capacidad=" + capacidad +
                ", numPersonas=" + numPersonas +
                '}';
    }
}
