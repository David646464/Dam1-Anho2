/**
 * The type Persona.
 */
public class Persona {
    /**
     * The enum Sexo.
     */
    public enum SEXO {
        /**
         * Hombre sexo.
         */
        HOMBRE,
        /**
         * Mujer sexo.
         */
        MUJER}
    private String nombre;
    /**
     * The Sexo.
     */
    public SEXO sexo;

    /**
     * Gets nombre.
     *
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets nombre.
     *
     * @param nombre the nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Gets sexo.
     *
     * @return the sexo
     */
    public SEXO getSexo() {
        return sexo;
    }

    /**
     * Sets sexo.
     *
     * @param sexo the sexo
     */
    public void setSexo(SEXO sexo) {
        this.sexo = sexo;
    }

    /**
     * Instantiates a new Persona.
     *
     * @param nombre the nombre
     * @param sexo   the sexo
     */
    public Persona(String nombre, SEXO sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }


}
