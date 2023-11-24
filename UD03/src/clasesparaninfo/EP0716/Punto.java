package clasesparaninfo.EP0716;

public class Punto {
    double x;
    double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    void desplazaX(double dx) {
        x += dx;
    }

    void desplazaY(double dy) {
        y += dy;
    }

    void desplaza(double dx, double dy) {
        x += dx;
        y += dy;
    }

    double distanciaEuclidea(Punto otro) {
        double diatancia = Math.sqrt(Math.pow((otro.x - x), 2) + Math.pow((otro.y - y), 2));
        return diatancia;
    }

    void mostrar() {
        System.out.println("(" + x + "," + y + ")");
    }
}
