package ejerciciosApuntes.E0708;

public class Sintonizador {

    private double frecuencia;
    private final double FRECUENCIA_MAXIMA = 108;
    private final double FRECUENCIA_MINIMA = 80;
    private double frecuenciaGuardada1 = FRECUENCIA_MINIMA;
    private double frecuenciaGuardada2 = FRECUENCIA_MINIMA;
    private double frecuenciaGuardada3 = FRECUENCIA_MINIMA;

    public Sintonizador(double frecuencia) {
        if (frecuencia > FRECUENCIA_MAXIMA) {
            this.frecuencia = FRECUENCIA_MAXIMA;
        } else if (frecuencia < FRECUENCIA_MINIMA) {
            this.frecuencia = FRECUENCIA_MINIMA;
        } else {
            this.frecuencia = frecuencia;
        }

    }

    public Sintonizador() {
        this.frecuencia = FRECUENCIA_MINIMA;
    }

    
    public double getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
    }

    public double getFrecuenciaGuardada1() {
        return frecuenciaGuardada1;
    }

    public void setFrecuenciaGuardada1(double frecuenciaGuardada1) {
        this.frecuenciaGuardada1 = frecuenciaGuardada1;
    }

    public double getFrecuenciaGuardada2() {
        return frecuenciaGuardada2;
    }

    public void setFrecuenciaGuardada2(double frecuenciaGuardada2) {
        this.frecuenciaGuardada2 = frecuenciaGuardada2;
    }

    public double getFrecuenciaGuardada3() {
        return frecuenciaGuardada3;
    }

    public void setFrecuenciaGuardada3(double frecuenciaGuardada3) {
        this.frecuenciaGuardada3 = frecuenciaGuardada3;
    }

    /**
     * Aumneta 05 la frecuencia
     */


    public void up05() {
        if (frecuencia >= FRECUENCIA_MAXIMA) {
            frecuencia = FRECUENCIA_MINIMA;
        } else {
            frecuencia += 0.5;
        }
    }

    public void up01() {
        if (frecuencia >= FRECUENCIA_MAXIMA) {
            frecuencia = FRECUENCIA_MINIMA;
        } else {
            frecuencia += 0.1;
        }
    }

    public void down05() {
        if (frecuencia <= FRECUENCIA_MINIMA) {
            frecuencia = FRECUENCIA_MAXIMA;
        } else {
            frecuencia -= 0.5;
        }
    }

    public void down01() {
        if (frecuencia <= FRECUENCIA_MINIMA) {
            frecuencia = FRECUENCIA_MAXIMA;
        } else {
            frecuencia -= 0.1;
        }
    }

    public void display() {
        System.out.println("La frecuencia actual es: " + frecuencia);
    }

    public void guardarSintonia(double frecuencia, int slotDeGuardado) {
        switch (slotDeGuardado) {
            case 1:
                frecuenciaGuardada1 = frecuencia;
                break;
            case 2:
                frecuenciaGuardada2 = frecuencia;
                break;
            case 3:
                frecuenciaGuardada3 = frecuencia;
                break;
            default:
                System.out.println("No hay ese número de slot de guardado se guardara en la 1 por defecto");
                frecuenciaGuardada1 = frecuencia;
                break;
        }
    }

    public void guardarSintonia(int slotDeGuardado) {

        switch (slotDeGuardado) {
            case 1:
                frecuenciaGuardada1 = frecuencia;
                break;
            case 2:
                frecuenciaGuardada2 = frecuencia;
                break;
            case 3:
                frecuenciaGuardada3 = frecuencia;
                break;
            default:
                System.out.println("No hay ese número de slot de guardado se guardara en la 1 por defecto");
                frecuenciaGuardada1 = frecuencia;
                break;
        }

    }

    public void guardarSintonia() {
        if (frecuenciaGuardada1 != FRECUENCIA_MINIMA) {
            frecuenciaGuardada1 = frecuencia;
        } else if (frecuenciaGuardada2 != FRECUENCIA_MINIMA) {
            frecuenciaGuardada2 = frecuencia;
        } else if (frecuenciaGuardada3 != FRECUENCIA_MINIMA) {
            frecuenciaGuardada3 = frecuencia;
        } else {
            frecuenciaGuardada1 = frecuencia;
            System.out.println("Al no haber slots vacios se guardara automaticamente en el slot 1");
        }
    }

    public void cargarSintonia(int slotDeGuardado) {

        switch (slotDeGuardado) {
            case 1:
                frecuencia = frecuenciaGuardada1;
                break;
            case 2:
                frecuencia = frecuenciaGuardada2;
                break;
            case 3:
                frecuencia = frecuenciaGuardada3;
                break;
            default:
                System.out.println("No hay ese número de slot de guardado se cragara la 1 por defecto");
                frecuencia = frecuenciaGuardada1;
                break;
        }

    }

    public void cargarSintonia() {
        frecuencia = frecuenciaGuardada1;
    }
}
