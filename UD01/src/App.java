public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String cadenaMax = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String cadenaMin = "abcdefghijklmnñopqrstuvwxyz";
        char A = '1';
        
        String cadenaNum = "0123456789";
        char a = cadenaMax.charAt(cadenaMax.length() - 1);
        int  N = 8;
        int MN = 6 ;
        int MA = 6;
        int DN = 12;
        int DA = 12;

        int AN = 2000;
        int AA = 2018;
        boolean result = 18 <= ((MA >= MN) ? ((DA >= DN) ? AA - AN : AA - AN - 1)  : AA - AN - 1 );
        System.out.println(result);
    }
}
