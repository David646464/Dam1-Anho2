package buclesparaninfo;

public class EP0314 {
    public static void main(String[] args) {
        numerosPrimos(27);
    }

    private static void numerosPrimos(int num) {
        boolean indicador = true;
        for (int i = 0; i < num; i++) {
            indicador = true;
            for (int j = 2; j < (i + 2) / 2; j++) {
                if (i % j == 0 ){
                    indicador = false;
                }
            }
            if (indicador == false){
                System.out.println(i + "- no primo");
            }else{
                System.out.println(i + "- primo");
            }
        }
    }
    
}
