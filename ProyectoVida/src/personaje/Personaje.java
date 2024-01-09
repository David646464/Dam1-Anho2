package personaje;

import java.util.Map;

public class Personaje {
    enum TIPOROLPERSONAJE  {GUERRERO,MAGO,LADRON,ARQUERO,SACERDOTE,PALADIN,HECHICERO,BARBARO,FUSILERO,LANCERO};
    String nombre;
    double fuerza;
    double mana;
    double resistencia;
    double vida;
    double vidaTotal;
    Map<Integer, Objeto> Equipo;

}
