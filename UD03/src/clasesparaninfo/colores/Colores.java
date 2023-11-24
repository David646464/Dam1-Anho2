package clasesparaninfo.colores;

public class Colores {
    static String[] colores = {
            "azul",
            "rojo",
            "verde",
            "amarillo",
            "naranja",
            "rosa",
            "morado",
            "gris",
            "marrón",
            "negro",
            "blanco",
            "turquesa",
            "celeste",
            "violeta",
            "rojo oscuro" };

    public static  String[] getColores(int n){
        String[] coloresDevolver=new String[n];
        int [] auxNum = new int[n];
        auxNum[0] = 12365284;
        int auxInt =0;
        boolean indicador = true;

        for (int i = 0; i < n; i++) {
            while (indicador) {
                auxInt = NumAleat(0, colores.length-1);
                for (int j = 0; j < auxNum.length-1; j++) {
                    if (auxInt == auxNum[j]){
                        indicador = true;
                        break;
                    }else{
                        indicador = false;
                    }
                }
            }
            indicador = true;
            auxNum[i] = auxInt;
            coloresDevolver[i] = colores[auxInt];
        }

        return coloresDevolver;
    }

    public static int NumAleat(int i, int j) {
        int numero = 0;

        numero = (i) + (int) (Math.random() * ((j - i) + 1));

        return numero;
    }
}
