package buclesparaninfo;

public class a {
    public static void main(String[] args) {
        String numBinario = "101101111011111";
        for (int i = 1; i <= numBinario.length(); i++) {
            System.out.println(Character.getNumericValue(numBinario.charAt((numBinario.length()) - i)));
        }
    }
}
