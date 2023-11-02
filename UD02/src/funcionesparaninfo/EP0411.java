package funcionesparaninfo;

public class EP0411 {
    public static void main(String[] args) {
        //Ejemplos de pruebas generadas con chat GPT
        // Radio de la esfera: 24.3
        // Volumen de la esfera: 72343.07075111085 unidades cúbicas (aproximadamente)
        // Área superficial de la esfera: 7403.033571103825 unidades cuadradas (aproximadamente)
        calculosEsfera(24.3);

        // Radio de la esfera: 10.0
        // Volumen de la esfera: 4188.79 unidades cúbicas (aproximadamente)
        // Área superficial de la esfera: 1256.637 unidades cuadradas (aproximadamente)
        calculosEsfera(10.0);

        // Radio de la esfera: 5.5
        // Volumen de la esfera: 696.148 unidades cúbicas (aproximadamente)
        // Área superficial de la esfera: 379.912 unidades cuadradas (aproximadamente)
        calculosEsfera(5.5);

        // Radio de la esfera: 15.7
        // Volumen de la esfera: 16210.16989 unidades cúbicas (aproximadamente)
        // Área superficial de la esfera: 3077.4 unidades cuadradas (aproximadamente)
        calculosEsfera(15.7);

        // Radio de la esfera: 30.0
        // Volumen de la esfera: 113097.335 unidades cúbicas (aproximadamente)
        // Área superficial de la esfera: 113097.335 unidades cuadradas (aproximadamente)
        calculosEsfera(30.0);
    }

    private static void calculosEsfera(double d) {
        double superficie = 4 * Math.PI * Math.pow(d, 2);
        double volumen = (4.0  / 3.0)* Math.PI * Math.pow(d, 3);
        System.out.println(superficie);
        System.out.println(volumen);
        System.out.println("========");
    }

}
