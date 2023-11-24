package clasesparaninfo.EP0716;

public class MainPunto {
    public static void main(String[] args) {
        Punto punto = new Punto();
        Punto punto2 = new Punto(2, 2);
        punto.mostrar();
        System.out.println(punto.distanciaEuclidea(punto2));
    }
    
}
