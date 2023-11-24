package ejerciciosApuntes.E0709;

public class MainBombilla {
    public static void main(String[] args) {
        Bombilla bombilla1 = new Bombilla();
        bombilla1.estadoBombilla();
        bombilla1.pulsarInterruptorParticular();
        bombilla1.estadoBombilla();
        Bombilla.pulsarInterruptorGeneral();
        bombilla1.estadoBombilla();
        bombilla1.pulsarInterruptorParticular();
        Bombilla.pulsarInterruptorGeneral();
        bombilla1.estadoBombilla();
        Bombilla.pulsarInterruptorGeneral();
        bombilla1.estadoBombilla();
        bombilla1.pulsarInterruptorParticular();
        bombilla1.estadoBombilla();
    }

}
