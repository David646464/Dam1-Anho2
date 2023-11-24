package ejerciciosApuntes.E0708;

public class MainSintonizador {
    public static void main(String[] args) {
        Sintonizador sintonizador1 = new Sintonizador(180);
        Sintonizador sintonizador2 = new Sintonizador(70);
        Sintonizador sintonizador3 = new Sintonizador(100);
        Sintonizador sintonizador4 = new Sintonizador();

        sintonizador1.display();
        sintonizador2.display();
        sintonizador3.display();
        sintonizador4.display();

        System.out.println("===================");

        sintonizador2.up05();
        sintonizador2.display();

        System.out.println("===================");

        sintonizador1.up05();
        sintonizador1.display();

        System.out.println("===================");

        sintonizador4.down05();
        sintonizador4.display();
        
    }

}
