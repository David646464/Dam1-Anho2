package pruebasDeHilos;

public class MainHilos {
    public static void main(String[] args) {
        
        Hilo2 hilo2 = new Hilo2();
        Hilo1 hilo1 = new Hilo1();

        hilo1.start();
        hilo2.start();
        

        
    }

    
}
