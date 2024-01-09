package pruebas;

public class Estacion {
    String nombreEstacion;
    Tren llega;
    Tren sale;
    int numPersonasSubir;

    public Estacion(String nombreEstacion) {
        this.nombreEstacion = nombreEstacion;
        this.llega = null;
        this.sale = null;
    }

    public Estacion(String nombreEstacion, Tren llega, Tren sale, int numPersonasSubir) {
        if (llega.equals(sale)){
            throw new IllegalArgumentException("el tren que llega y el que sale no puede ser el mismo");
        }
        this.nombreEstacion = nombreEstacion;
        this.llega = llega;
        this.sale = sale;
        this.numPersonasSubir = numPersonasSubir;
        
    }

    /*public  boolean trenesIguales(){
        boolean iguales = false;
        if (sale == llega){
            iguales = true;
        }else{
            iguales = false;
        }
        return iguales;
    }*/


    public  void salirEntrarNuevoTren(Tren nuevo){


        if (nuevo.operativo == true && llega.operativo == true && sale.operativo == true){
            sale = llega;
            llega = nuevo;
        }else{
            throw new IllegalArgumentException("el tren tiene que estra operativo");
        }

        
    }

    public void trenLlegaEstacion (Tren trenLlega){
        if (trenLlega.equals(null)){
            llega = trenLlega;
        }else {
            sale = llega;
            llega = trenLlega;
        }
    }

    public void subirBajarPersonas(){
        llega.bajarPasajeros(llega.numPersonas);

        sale.subirPasajeros(numPersonasSubir);
    }

    public void subirBajarPersonas(int gente){
        llega.bajarPasajeros(llega.numPersonas);

        sale.subirPasajeros(gente);
    }

    @Override
    public String toString() {
        return "Estacion{" +
                "nombreEstacion='" + nombreEstacion + '\'' +
                ", llega= \n" + llega.toString() +
                ", sale= \n" + sale.toString() +
                ", numPersonasSubir=" + numPersonasSubir +
                '}';
    }
}
