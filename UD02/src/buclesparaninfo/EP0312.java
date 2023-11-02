package buclesparaninfo;

public class EP0312 {
    public static void main(String[] args) {
        System.out.println(pasarDecimal("1010"));

    }

    public static int pasarDecimal(String numBinario) {
        int auxNum = 0;
        for (int i = 0; i < numBinario.length(); i++) {
            // System.out.println(Character.getNumericValue(numBinario.charAt((numBinario.length())-i)));
            auxNum = auxNum * 2;
            if ((Character.getNumericValue(numBinario.charAt(i)) == 1)) {

                auxNum += 1;

            }

        }

        return auxNum;
    }
}
