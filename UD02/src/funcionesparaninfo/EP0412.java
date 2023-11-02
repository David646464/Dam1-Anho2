package funcionesparaninfo;

public class EP0412 {
    public static void main(String[] args) {
        //Ejemplos de pruebas generadas con chat GPT
        // Ejemplo 1: Calcular la distancia entre los puntos (0, 0) y (3, 4)
        double distancia1 = distancia(0, 0, 3, 4);
        // La distancia es 5.0 unidades
        System.out.println("Distancia entre (0, 0) y (3, 4): " + distancia1);

        // Ejemplo 2: Calcular la distancia entre los puntos (-2, -1) y (5, 6)
        double distancia2 = distancia(-2, -1, 5, 6);
        // La distancia es 9.848857801796104 unidades (aproximadamente)
        System.out.println("Distancia entre (-2, -1) y (5, 6): " + distancia2);

        // Ejemplo 3: Calcular la distancia entre dos puntos con coordenadas decimales
        double distancia3 = distancia(1.5, 2.5, 3.8, 5.2);
        // La distancia es 3.4960292406572973 unidades (aproximadamente)
        System.out.println("Distancia entre (1.5, 2.5) y (3.8, 5.2): " + distancia3);
    }
    static double distancia (double x1, double y1, double x2, double y2){
        double distancia = Math.sqrt(Math.pow(x1 - x2, 2) +Math.pow(y1 - y2, 2));
        return distancia;
        
    }

}
