package cosasVipo;

public class Persona {
    String nombre;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public void a (String nombre){
        System.out.println(nombre);
        System.out.println(this.nombre);
    }
}
