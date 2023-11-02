import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// AUTOR: DANIEL TOURIÑO PIÑEIRO
public class GestorInmuebles {
    List<Inmueble> inmuebles = new ArrayList<>();

    public GestorInmuebles(){
    }

    public boolean agregar(Inmueble inmueble) {
        return inmuebles.add(inmueble);
    }

    public boolean eliminar(Inmueble inmueble) {
        return inmuebles.remove(inmueble);
    }

    public String mostrar() {
        return inmuebles.toString();
    }

    public void ordenar() {
        inmuebles.sort(Comparator.naturalOrder());
    }

    public void ordenarInverso() {
        Comparator<Inmueble> c = Comparator.naturalOrder();
        inmuebles.sort(c.reversed());
    }

    public void ordenarMetros() {
        Comparator<Inmueble> cMetros = new Comparator<Inmueble>(){
            @Override
            public int compare(Inmueble o1, Inmueble o2) {
                return o1.m2 - o2.m2;
            }
        };

        inmuebles.sort(cMetros);
    }

    public void ordenarHabMetrosDesc() {
        Comparator<Inmueble> cMetrosDesc = new Comparator<Inmueble>(){
            @Override
            public int compare(Inmueble o1, Inmueble o2) {
                return o2.m2 - o1.m2;
            }
        };

        inmuebles.sort(cMetrosDesc);
    }

    public void ordenar(Comparator<Inmueble> c) {
        inmuebles.sort(c);
    }

    public GestorInmuebles getEnAlquiler() {
        GestorInmuebles gestor = new GestorInmuebles();

        for (Inmueble e : inmuebles) {
            if(e.precioAlquiler > 0)
                gestor.agregar(e);
        }

        return gestor;
    }

    public GestorInmuebles getCasas() {
        GestorInmuebles gestor = new GestorInmuebles();

        for (Inmueble e : inmuebles) {
            if(e.getClass().getSimpleName() == "Casa")
                gestor.agregar(e);
        }

        return gestor;
    }
}