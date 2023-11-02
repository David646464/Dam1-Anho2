package funcionesparaninfo;

public class EP0415 {
    public static void main(String[] args) {
        
        System.out.println(diferenciaMin(15, 30, 18, 45));
        System.out.println(diferenciaMin(12, 30, 11, 15));
        System.out.println(diferenciaMin(12, 30, 11, 30));
        System.out.println(diferenciaMin(12, 30, 12, 15));
    }

    public static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2) {
        int auxInt = 0;

        if (hora1 == hora2){
            if (minuto2 >= minuto1){
                    auxInt += minuto2 - minuto1;
                }else {
                    auxInt += 23 * 60;
                    auxInt += minuto2 + 60 - minuto1;
                }
        }else{
            if (hora2 > hora1){
                if (minuto2 >= minuto1){
                    auxInt += minuto2 - minuto1;
                }else {
                    auxInt += minuto2 + 60 - minuto1;
                }
                hora2--;
                auxInt += (hora2 - hora1) * 60;
            }
            if (hora1 > hora2){
                if (minuto2 >= minuto1){
                    auxInt += minuto2 - minuto1;
                }else {
                    auxInt += minuto2 + 60 - minuto1;
                }
                hora2--;
                auxInt += (hora2 + 24 - hora1) * 60;
            }
        }
        return auxInt;
    }

}
