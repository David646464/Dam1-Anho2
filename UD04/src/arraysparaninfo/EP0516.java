package arraysparaninfo;

import java.util.Arrays;

public class EP0516 {
    public static void main(String[] args) {
        int[][] mapa ={
                { 1, 2, 3, 4, 5, 6},
                { 7, 8, 9,10,11,12},
                {13,14,15,16,17,18},
                {19,20,21,22,23,24},
                {25,26,27,28,29,30}
        };

        buscarRuta(mapa, 9, 18);
    }

    private static void buscarRuta(int[][] mapa, int origen, int destino) {
        int xOrigen = 0;
        int yOrigen = 0;
        int xDestino = 0;
        int yDestino = 0;

        int restaY =0;
        int restaX =0;

        boolean indicador1 = false;
        boolean indicador2 = false;
        boolean existeDestino = false;
        boolean existeOrigen = false;

        String ubicacinesRecorridas1 = "Se tiene que pasar por: ";
        String ubicacinesRecorridas2 = "O por otro camino se tiene que pasar por:  ";

        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[0].length; j++) {
                if (mapa[i][j] == origen){
                    xOrigen = i;
                    yOrigen = j;
                    existeOrigen = true;
                }
                if (mapa[i][j] == destino) {
                    xDestino = i;
                    yDestino =j;
                    existeDestino = true;
                }
            }
        }
        if (existeDestino && existeOrigen) {
            if (xDestino == xOrigen && yDestino == yOrigen) {
                System.out.println("El destino y origen son el mismo punto");
            } else if (xDestino == xOrigen) {
                    if (yOrigen < yDestino){
                        restaY = yDestino - yOrigen -1;

                        for (int i = 1; i <= restaY; i++) {
                            if (mapa[xOrigen][yOrigen + i] != 0){
                                ubicacinesRecorridas1 +=  mapa[xOrigen][yOrigen + i] + " " ;
                            }
                        }
                    }else{
                        restaY = yOrigen - yDestino -1;

                        for (int i = 1; i <= restaY; i++) {
                            if (mapa[xOrigen][yOrigen - i] != 0){
                                ubicacinesRecorridas1 +=  mapa[xOrigen][yOrigen - i] + " ";
                            }
                        }
                    }
                System.out.println(ubicacinesRecorridas1);
            } else if (yOrigen == yDestino) {
                if (xOrigen < xDestino){
                    restaX = xDestino - xOrigen -1;

                    for (int i = 1; i <= restaX; i++) {
                        if (mapa[xOrigen + i][yOrigen ] != 0){
                            ubicacinesRecorridas1 +=  mapa[xOrigen + i][yOrigen ] + " ";
                        }
                    }
                }else{
                    restaX = xOrigen - xDestino -1;

                    for (int i = 1; i <= restaX; i++) {
                        if (mapa[xOrigen - i][yOrigen ] != 0){
                            ubicacinesRecorridas1 +=  mapa[xOrigen - i][yOrigen] + " ";
                        }
                    }
                }

                System.out.println(ubicacinesRecorridas1);
            } else {
                //Recorrido1
                //Busco en y
                if (yOrigen < yDestino){
                    restaY = yDestino - yOrigen ;

                    for (int i = 1; i <= restaY; i++) {
                        if (mapa[xOrigen][yOrigen + i] != 0){
                            ubicacinesRecorridas1 +=  mapa[xOrigen][yOrigen + i] + " " ;
                        }
                    }
                    restaY = yDestino - yOrigen ;
                }else{
                    restaY = yOrigen - yDestino ;

                    for (int i = 1; i <= restaY; i++) {
                        if (mapa[xOrigen][yOrigen - i] != 0){
                            ubicacinesRecorridas1 +=  mapa[xOrigen][yOrigen - i] + " ";
                        }
                    }
                    restaY = yDestino - yOrigen ;
                }
                //Busco en x
                if (xOrigen < xDestino){
                    restaX = xDestino - xOrigen -1;

                    for (int i = 1; i <= restaX; i++) {
                        if (mapa[xOrigen + i][yOrigen + restaY] != 0){
                            ubicacinesRecorridas1 +=  mapa[xOrigen + i][yOrigen + restaY] + " ";
                        }
                    }
                }else{
                    restaX = xOrigen - xDestino -1;

                    for (int i = 1; i <= restaX; i++) {
                        if (mapa[xOrigen - i][yOrigen + restaY] != 0){
                            ubicacinesRecorridas1 +=  mapa[xOrigen - i][yOrigen + restaY] + " ";
                        }
                    }
                }
                //Recorrido2
                //Busco en x
                if (xOrigen < xDestino){
                    restaX = xDestino - xOrigen ;

                    for (int i = 1; i <= restaX; i++) {
                        if (mapa[xOrigen + i][yOrigen ] != 0){
                            ubicacinesRecorridas2 +=  mapa[xOrigen + i][yOrigen ] + " ";
                        }
                    }
                    restaX = xDestino - xOrigen ;
                }else{
                    restaX = xOrigen - xDestino ;

                    for (int i = 1; i <= restaX; i++) {
                        if (mapa[xOrigen - i][yOrigen ] != 0){
                            ubicacinesRecorridas2 +=  mapa[xOrigen - i][yOrigen] + " ";
                        }
                    }
                    restaX = xDestino - xOrigen ;
                }
                //Busco en y
                if (yOrigen < yDestino){
                    restaY = yDestino - yOrigen -1;

                    for (int i = 1; i <= restaY; i++) {
                        if (mapa[xOrigen + restaX][yOrigen + i] != 0){
                            ubicacinesRecorridas2 +=  mapa[xOrigen + restaX][yOrigen + i] + " " ;
                        }
                    }
                }else{
                    restaY = yOrigen - yDestino -1;

                    for (int i = 1; i <= restaY; i++) {
                        if (mapa[xOrigen + restaX][yOrigen - i] != 0){
                            ubicacinesRecorridas2 +=  mapa[xOrigen + restaX][yOrigen - i] + " ";
                        }
                    }
                }
                System.out.println(ubicacinesRecorridas1);
                System.out.println(ubicacinesRecorridas2);
            }
        }else{
            if (!existeDestino && existeOrigen){
                System.out.println("No existe destino");
            } else if (!existeOrigen && existeDestino) {
                System.out.println("No existe origen");
            }else {
                System.out.println("No existe ni destino ni origen");
            }
        }

    }

}
