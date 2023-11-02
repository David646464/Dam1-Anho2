package pruebasDeHilos;

public class Hilo1 extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hilo1 " + i);
        }
    }
    
}
