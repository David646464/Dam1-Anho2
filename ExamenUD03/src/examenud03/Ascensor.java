//David Sánchez Peso
package examenud03;

public class Ascensor {
    public int pisoActual;
    public final int  PLANTA_MAS_BAJA;
    public final int  PLANTA_MAS_ALTA;

    //Constructor 1
    public Ascensor(int pisoActual, int PLANTA_MAS_BAJA, int PLANTA_MAS_ALTA) {
        if (PLANTA_MAS_BAJA >= PLANTA_MAS_ALTA || pisoActual > PLANTA_MAS_ALTA || pisoActual < PLANTA_MAS_BAJA){
            throw new IllegalArgumentException("El valor de planta mas baja o el valor de piso actual no es correcto");
        }
        this.pisoActual = pisoActual;
        this.PLANTA_MAS_BAJA = PLANTA_MAS_BAJA;
        this.PLANTA_MAS_ALTA = PLANTA_MAS_ALTA;
    }

    //Constructor 2
    public Ascensor(int PLANTA_MAS_BAJA, int PLANTA_MAS_ALTA) {
        if (PLANTA_MAS_BAJA >= PLANTA_MAS_ALTA ){
            throw new IllegalArgumentException("El valor de planta mas baja no es correcto");
        }
        this.PLANTA_MAS_BAJA = PLANTA_MAS_BAJA;
        this.PLANTA_MAS_ALTA = PLANTA_MAS_ALTA;
        this.pisoActual = PLANTA_MAS_BAJA;
    }

    //Constructor 3
    public Ascensor() {
        this.PLANTA_MAS_BAJA = -2;
        this.PLANTA_MAS_ALTA = 9;
        this.pisoActual = 0;
    }

    public boolean subir(){
    boolean indicador = false;
        if (pisoActual < PLANTA_MAS_ALTA){
            pisoActual++;
            indicador = true;
        }
    return  indicador;
    }

    public boolean bajar(){
        boolean indicador = false;
        if (pisoActual > PLANTA_MAS_BAJA){
            pisoActual--;
            indicador = true;
        }
        return  indicador;
    }

    public boolean subirN(int n){
        boolean indicador = false;
        if (pisoActual + n <= PLANTA_MAS_ALTA){
            pisoActual+= n;
            indicador = true;
        }
        return  indicador;
    }
    public boolean bajarN(int n){
        boolean indicador = false;
        if (pisoActual + n >= PLANTA_MAS_BAJA){
            pisoActual-= n;
            indicador = true;
        }
        return  indicador;
    }

    public  boolean irAlPiso(int destino){
        boolean indicador = false;
        if (destino >= PLANTA_MAS_BAJA && destino <= PLANTA_MAS_ALTA){
            indicador = true;
            pisoActual = destino;
        }
        return  indicador;
    }

    //Metodo mostrar sobre el piso actual del ascensor
    public void mostrar(){
        System.out.println("Información del ascensor");
        System.out.println("Piso actual: " + pisoActual);
    }

}
