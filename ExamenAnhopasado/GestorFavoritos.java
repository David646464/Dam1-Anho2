import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// AUTOR: DANIEL TOURIÑO PIÑEIRO
public class GestorFavoritos {
    Map<Persona, ArrayList<Inmueble>> favoritos = new HashMap<>();

    public GestorFavoritos(){
    }

    public boolean marcarFavorito(Persona persona, Inmueble inmueble) {
        boolean added = false;

        ArrayList<Inmueble> favs = favoritos.get(persona);

        if(favs != null) {
            if(!favs.contains(inmueble))
                added = favs.add(inmueble);
        } else {
            ArrayList<Inmueble> inm = new ArrayList<>();
            inm.add(inmueble);

            favoritos.put(persona, inm);
            added = true;
        }

        return added;
    }

    public boolean desmarcarFavorito(Persona persona, Inmueble inmueble) {
        ArrayList<Inmueble> favs = favoritos.get(persona);
        if(favs != null) {
            return favs.remove(inmueble);
        }

        return false;
    }

    public ArrayList<Inmueble> getFavoritos(Persona persona) {
        return favoritos.get(persona);
    }

    public List<Inmueble> getFavoritosEnComun(Persona persona1, Persona persona2) {
        List<Inmueble> comun = new ArrayList<>();

        List<Inmueble> favoritosP1 = favoritos.get(persona1);
        List<Inmueble> favoritosP2 = favoritos.get(persona2);

        for (Inmueble inmueble : favoritosP1) {
            for (Inmueble inmueble2 : favoritosP2) {
                if(inmueble2.equals(inmueble))
                    comun.add(inmueble);
            }
        }

        return comun;
    }
}