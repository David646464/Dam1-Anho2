package ejerciciosApuntes.E0709;

public class Bombilla {
    static boolean encendida;
    static boolean interruptParticularEncendido;
    static boolean luzGeneralEncendida;

    public Bombilla() {
        this.encendida = false;
        this.interruptParticularEncendido = false;
        this.luzGeneralEncendida = false;
    }

    public void pulsarInterruptorParticular() {
        if (interruptParticularEncendido == false) {
            interruptParticularEncendido = true;
        } else {
            interruptParticularEncendido = false;
        }

        comprobarLuz();

    }

    public static void comprobarLuz() {
        if (luzGeneralEncendida == true && interruptParticularEncendido == true) {
            encendida = true;
        } else {
            encendida = false;
        }
    }

    public static void pulsarInterruptorGeneral() {
        if (luzGeneralEncendida == false) {
            luzGeneralEncendida = true;
        } else {
            luzGeneralEncendida = false;
        }

        comprobarLuz();
    }

    public void estadoBombilla() {
        if (encendida == true) {
            System.out.println("La bombilla esta encendida");
        } else {
            System.out.println("La bombilla esta apagada");
        }
    }

}
