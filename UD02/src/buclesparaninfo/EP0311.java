package buclesparaninfo;

public class EP0311 {
    public static void main(String[] args) {
        System.out.println(pasarBinario(10));
    }

    public static String pasarBinario(int numero) {
        boolean terminar = true;
        String numeroEnBinario = "";
        int numeroResidual = numero;
        int auxInt = numero;
        while (terminar) {
            if (numeroResidual == 1 || numeroResidual == 0) {
                terminar = false;
            }
            auxInt = (numeroResidual % 2);
            numeroEnBinario = auxInt + numeroEnBinario;
            numeroResidual = numeroResidual / 2;

        }
        return numeroEnBinario;
    }
}
