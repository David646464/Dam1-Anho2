package pruebasDeHilos;

public class Hilo2 extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hilo2 " + i );
        }
    }
    
}
