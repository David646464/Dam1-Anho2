package pruebasDeHilos;

public class MainHilos extends Thread {
    public static void main(String[] args) {
        
        Thread hilo1 = new Thread(() -> hilo1());
        Thread hilo2 = new Thread(() -> hilo2());

        hilo1.setPriority(10);

        hilo1.start();
        hilo2.start();        
    }

    public static void hilo1(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hilo1 " + i);
        }
    }

    public static void hilo2(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hilo2 " + i);
        }
    }

    
}
