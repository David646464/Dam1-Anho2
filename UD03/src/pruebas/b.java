package pruebas;

public class b {
    public String name;
    public int numero;

    public b(String name, int numero) {
        this.name = name;
        this.numero = numero;
    }

    public static void main(String[] args) {
        b a = new b("David", 12);
        b c = new b("David", 12);

        System.out.println(a.equals(c));
    }
}
