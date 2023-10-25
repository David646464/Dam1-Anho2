package condicionalesParaninfo;

public class a {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
        PullAhorcado pull = new PullAhorcado();
        String[] palabraSecret = pull.palabraPull();
        System.out.println(palabraSecret[0] + " " + palabraSecret[1]);
        }
    }
    
}
