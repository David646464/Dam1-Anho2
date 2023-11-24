package ejerciciosApuntes.claseMath;

import java.util.Arrays;

public class ClaseAuxiliar {
    /*
     * NumAleat(double i, double j) -> devuelve un numero decimal entre i y j
     * incluidos
     * NumAleat(int i, int j) -> devuelve un numero entero entre i y j incluidos
     * NumRendonAbajo(double numero) -> devuelve un numero redondeado a el numero
     * entero hacia abajo
     * NumRendonArriba(double numero) -> devuelve un numero redondeado a el numero
     * entero hacia arriba
     * NumRendonCercano(double numero) -> devuelve un numero redondeado a el numero
     * entero mas cercano
     * NumRaiz(double numero) -> devuelve la raiz de un numero double
     * NumValorAbsoluto(double numero) -> devuelve el valor absoluto de un numero
     * double
     * NumPotencia(double numero, double potencia) -> devuelve una potencia de un
     * número "numero" elevado a "potencia"
     * NumLogaritmo(double numero) -> devuelve el logaritmo natural de un numero
     * double
     * BuscarElMasGrande(int[] ListaNumeros) -> devuelve el numero int de un array
     * mas grande
     * BuscarElMasGrande(double[] ListaNumeros)-> devuelve el numero double de un
     * array mas grande
     * BuscarElMasPequeño(int[] ListaNumeros) -> devuelve el numero int de un array
     * mas pequeño
     * BuscarElMasPequeño(double[] ListaNumeros) -> devuelve el numero double de un
     * array mas pequeño
     *
     *
     *
     *
     */
    public static void main(String[] args) {
        System.out.println("A");
    }

    // Numero aleatorio double
    public static double NumAleat(double i, double j) {

        double numero = 0;

        numero = (i) + (Math.random() * ((j - i)));
        if (numero > j) {
            numero -= 1;
        } else if (numero < i) {
            numero += 1;
        }
        return numero;
    }
    // Numero aleatorio int

    public static int NumAleat(int i, int j) {
        int numero = 0;

        numero = (i) + (int) (Math.random() * ((j - i) + 1));

        return numero;
    }

    // Numero redondeado hacia abajo double

    public static double NumRendonAbajo(double numero) {

        double numeroCarculado = Math.ceil(numero);

        return numeroCarculado;
    }

    // Numero redondeado hacia arriba double
    public static double NumRendonArriba(double numero) {

        double numeroCarculado = Math.floor(numero);

        return numeroCarculado;
    }

    // Numero redondeado hacia el mas cercano double
    public static double NumRendonCercano(double numero) {

        double numeroCarculado = Math.round(numero);

        return numeroCarculado;
    }

    // raiz devuelve double
    public static double NumRaiz(double numero) {

        double numeroCarculado = Math.sqrt(numero);

        return numeroCarculado;
    }

    // valor absoluto devuelve double
    public static double NumValorAbsoluto(double numero) {

        double numeroCarculado = Math.abs(numero);

        return numeroCarculado;
    }

    // Potencia devuelve double
    public static double NumPotencia(double numero, double potencia) {

        double numeroCarculado = Math.pow(numero, potencia);

        return numeroCarculado;
    }

    // Logaritmo devuelve double
    public static double NumLogaritmo(double numero) {

        double numeroCarculado = Math.log(numero);

        return numeroCarculado;
    }

    // Buscar mas grande en una lista int
    public static int BuscarElMasGrande(int[] ListaNumeros) {
        int aux = -999999999;
        for (int i = 0; i < ListaNumeros.length; i++) {
            if (ListaNumeros[i] > aux) {
                aux = ListaNumeros[i];
            }
        }

        return aux;
    }

    // Buscar mas grande en una lista double
    public static double BuscarElMasGrande(double[] ListaNumeros) {
        double aux = -999999999;
        for (int i = 0; i < ListaNumeros.length; i++) {
            if (ListaNumeros[i] > aux) {
                aux = ListaNumeros[i];
            }
        }

        return aux;
    }

    // Buscar mas pequeño en una lista int
    public static int BuscarElMasPequeño(int[] ListaNumeros) {
        int aux = 999999999;
        for (int i = 0; i < ListaNumeros.length; i++) {
            if (ListaNumeros[i] < aux) {
                aux = ListaNumeros[i];
            }
        }

        return aux;
    }

    // Buscar mas pequeño en una lista double
    public static double BuscarElMasPequeño(double[] ListaNumeros) {
        double aux = 999999999;
        for (int i = 0; i < ListaNumeros.length; i++) {
            if (ListaNumeros[i] < aux) {
                aux = ListaNumeros[i];
            }
        }

        return aux;
    }

    // Elimina de un array un elemento con el indice.
    // int
    public static int[] EliminarEnUnaLista(int[] lista, int indice) {
        int[] listaAux = new int[lista.length - 1];
        if (indice + 1 <= lista.length && indice >= 0) {

            System.arraycopy(lista, 0, listaAux, 0, indice);
            System.arraycopy(lista, indice + 1, listaAux, indice, lista.length - indice - 1);
        } else {
            listaAux = lista;
        }
        return listaAux;
    }

    // Elimina de un array un elemento con el indice.
    // double
    public static double[] EliminarEnUnaLista(double[] lista, int indice) {
        double[] listaAux = new double[lista.length - 1];
        if (indice + 1 <= lista.length && indice >= 0) {

            System.arraycopy(lista, 0, listaAux, 0, indice);
            System.arraycopy(lista, indice + 1, listaAux, indice, lista.length - indice - 1);
        } else {
            listaAux = lista;
        }
        return listaAux;
    }

    // Elimina de un array un elemento con el indice.
    // String
    public static String[] EliminarEnUnaLista(String[] lista, int indice) {
        String[] listaAux = new String[lista.length - 1];
        if (indice + 1 <= lista.length && indice >= 0) {

            System.arraycopy(lista, 0, listaAux, 0, indice);
            System.arraycopy(lista, indice + 1, listaAux, indice, lista.length - indice - 1);
        } else {
            listaAux = lista;
        }
        return listaAux;
    }

    // Elimina de un array un elemento con el indice.
    // byte
    public static byte[] EliminarEnUnaLista(byte[] lista, int indice) {
        byte[] listaAux = new byte[lista.length - 1];
        if (indice + 1 <= lista.length && indice >= 0) {

            System.arraycopy(lista, 0, listaAux, 0, indice);
            System.arraycopy(lista, indice + 1, listaAux, indice, lista.length - indice - 1);
        } else {
            listaAux = lista;
        }
        return listaAux;
    }

    // Elimina de un array un elemento con el indice.
    // float
    public static float[] EliminarEnUnaLista(float[] lista, int indice) {
        float[] listaAux = new float[lista.length - 1];
        if (indice + 1 <= lista.length && indice >= 0) {

            System.arraycopy(lista, 0, listaAux, 0, indice);
            System.arraycopy(lista, indice + 1, listaAux, indice, lista.length - indice - 1);
        } else {
            listaAux = lista;
        }
        return listaAux;
    }

    // Elimina de un array un elemento con el indice.
    // char
    public static char[] EliminarEnUnaLista(char[] lista, int indice) {
        char[] listaAux = new char[lista.length - 1];
        if (indice + 1 <= lista.length && indice >= 0) {

            System.arraycopy(lista, 0, listaAux, 0, indice);
            System.arraycopy(lista, indice + 1, listaAux, indice, lista.length - indice - 1);
        } else {
            listaAux = lista;
        }
        return listaAux;
    }

    // Elimina de un array un elemento con el indice.
    // boolean
    public static boolean[] EliminarEnUnaLista(boolean[] lista, int indice) {
        boolean[] listaAux = new boolean[lista.length - 1];
        if (indice + 1 <= lista.length && indice >= 0) {

            System.arraycopy(lista, 0, listaAux, 0, indice);
            System.arraycopy(lista, indice + 1, listaAux, indice, lista.length - indice - 1);
        } else {
            listaAux = lista;
        }
        return listaAux;
    }

    // Elimina de un array un elemento con el indice.
    // long
    public static long[] EliminarEnUnaLista(long[] lista, int indice) {
        long[] listaAux = new long[lista.length - 1];
        if (indice + 1 <= lista.length && indice >= 0) {

            System.arraycopy(lista, 0, listaAux, 0, indice);
            System.arraycopy(lista, indice + 1, listaAux, indice, lista.length - indice - 1);
        } else {
            listaAux = lista;
        }
        return listaAux;
    }

    // Elimina de un array un elemento con el indice.
    // short
    public static short[] EliminarEnUnaLista(short[] lista, int indice) {
        short[] listaAux = new short[lista.length - 1];
        if (indice + 1 <= lista.length && indice >= 0) {

            System.arraycopy(lista, 0, listaAux, 0, indice);
            System.arraycopy(lista, indice + 1, listaAux, indice, lista.length - indice - 1);
        } else {
            listaAux = lista;
        }
        return listaAux;
    }

    // Añadir un elememtoa una lista
    // short
    public static short[] AgregarAUnaLista(short[] lista, short elemento, int indice) {
        short[] listaAux = new short[lista.length + 1];
        if (indice + 1 <= lista.length && indice >= 0) {

            System.arraycopy(lista, 0, listaAux, 0, indice);
            listaAux[indice] = elemento;
            System.arraycopy(lista, indice, listaAux, indice + 1, lista.length - indice);
        } else {
            listaAux = lista;
        }
        return listaAux;
    }

    // Añadir un elememtoa una lista
    // long
    public static long[] AgregarAUnaLista(long[] lista, long elemento, int indice) {
        long[] listaAux = new long[lista.length + 1];
        if (indice + 1 <= lista.length && indice >= 0) {

            System.arraycopy(lista, 0, listaAux, 0, indice);
            listaAux[indice] = elemento;
            System.arraycopy(lista, indice, listaAux, indice + 1, lista.length - indice);
        } else {
            listaAux = lista;
        }
        return listaAux;
    }

    // Añadir un elememtoa una lista
    // int
    public static int[] AgregarAUnaLista(int[] lista, int elemento, int indice) {
        int[] listaAux = new int[lista.length + 1];
        if (indice + 1 <= lista.length && indice >= 0) {

            System.arraycopy(lista, 0, listaAux, 0, indice);
            listaAux[indice] = elemento;
            System.arraycopy(lista, indice, listaAux, indice + 1, lista.length - indice);
        } else {
            listaAux = lista;
        }
        return listaAux;
    }

    // Añadir un elememtoa una lista
    // double
    public static double[] AgregarAUnaLista(double[] lista, double elemento, int indice) {
        double[] listaAux = new double[lista.length + 1];
        if (indice + 1 <= lista.length && indice >= 0) {

            System.arraycopy(lista, 0, listaAux, 0, indice);
            listaAux[indice] = elemento;
            System.arraycopy(lista, indice, listaAux, indice + 1, lista.length - indice);
        } else {
            listaAux = lista;
        }
        return listaAux;
    }

    // Añadir un elememtoa una lista
    // String
    public static String[] AgregarAUnaLista(String[] lista, String elemento, int indice) {
        String[] listaAux = new String[lista.length + 1];
        if (indice + 1 <= lista.length && indice >= 0) {

            System.arraycopy(lista, 0, listaAux, 0, indice);
            listaAux[indice] = elemento;
            System.arraycopy(lista, indice, listaAux, indice + 1, lista.length - indice);
        } else {
            listaAux = lista;
        }
        return listaAux;
    }

    // Añadir un elememtoa una lista
    // boolean
    public static boolean[] AgregarAUnaLista(boolean[] lista, boolean elemento, int indice) {
        boolean[] listaAux = new boolean[lista.length + 1];
        if (indice + 1 <= lista.length && indice >= 0) {

            System.arraycopy(lista, 0, listaAux, 0, indice);
            listaAux[indice] = elemento;
            System.arraycopy(lista, indice, listaAux, indice + 1, lista.length - indice);
        } else {
            listaAux = lista;
        }
        return listaAux;
    }

    // Añadir un elememtoa una lista
    // byte
    public static byte[] AgregarAUnaLista(byte[] lista, byte elemento, int indice) {
        byte[] listaAux = new byte[lista.length + 1];
        if (indice + 1 <= lista.length && indice >= 0) {

            System.arraycopy(lista, 0, listaAux, 0, indice);
            listaAux[indice] = elemento;
            System.arraycopy(lista, indice, listaAux, indice + 1, lista.length - indice);
        } else {
            listaAux = lista;
        }
        return listaAux;
    }

    // Añadir un elememtoa una lista
    // char
    public static char[] AgregarAUnaLista(char[] lista, char elemento, int indice) {
        char[] listaAux = new char[lista.length + 1];
        if (indice + 1 <= lista.length && indice >= 0) {

            System.arraycopy(lista, 0, listaAux, 0, indice);
            listaAux[indice] = elemento;
            System.arraycopy(lista, indice, listaAux, indice + 1, lista.length - indice);
        } else {
            listaAux = lista;
        }
        return listaAux;
    }

    // Añadir un elememtoa una lista
    // float
    public static float[] AgregarAUnaLista(float[] lista, float elemento, int indice) {
        float[] listaAux = new float[lista.length + 1];
        if (indice + 1 <= lista.length && indice >= 0) {

            System.arraycopy(lista, 0, listaAux, 0, indice);
            listaAux[indice] = elemento;
            System.arraycopy(lista, indice, listaAux, indice + 1, lista.length - indice);
        } else {
            listaAux = lista;
        }
        return listaAux;
    }

    // Ordenar
    // String
    public static String[] OrdenarAscen(String[] lista) {
        String[] listaAux = lista;
        Arrays.sort(listaAux);
        return listaAux;
    }

    public static String[] OrdenarDescen(String[] lista) {

        String[] listaAux = lista;
        String[] listaAux2 = new String[lista.length];
        Arrays.sort(listaAux);
        int j = lista.length - 1;
        for (int i = 0; i < listaAux.length; i++, j--) {
            listaAux2[i] = listaAux[j];
        }

        return listaAux2;
    }

    // Ordenar
    // int
    //TODO modificar los auxiliares de los metodos
    public static int[] OrdenarAscen(int[] lista) {
        int[] listaAux = lista.clone();
        Arrays.sort(listaAux);
        return listaAux;
    }

    public static int[] OrdenarDescen(int[] lista) {

        int[] listaAux = lista;
        int[] listaAux2 = new int[lista.length];
        Arrays.sort(listaAux);
        int j = lista.length - 1;
        for (int i = 0; i < listaAux.length; i++, j--) {
            listaAux2[i] = listaAux[j];
        }

        return listaAux2;
    }

    // Ordenar
    // double
    public static double[] OrdenarAscen(double[] lista) {
        double[] listaAux = lista;
        Arrays.sort(listaAux);
        return listaAux;
    }

    public static double[] OrdenarDescen(double[] lista) {

        double[] listaAux = lista;
        double[] listaAux2 = new double[lista.length];
        Arrays.sort(listaAux);
        int j = lista.length - 1;
        for (int i = 0; i < listaAux.length; i++, j--) {
            listaAux2[i] = listaAux[j];
        }

        return listaAux2;
    }

    // Ordenar
    // float
    public static float[] OrdenarAscen(float[] lista) {
        float[] listaAux = lista;
        Arrays.sort(listaAux);
        return listaAux;
    }

    public static float[] OrdenarDescen(float[] lista) {

        float[] listaAux = lista;
        float[] listaAux2 = new float[lista.length];
        Arrays.sort(listaAux);
        int j = lista.length - 1;
        for (int i = 0; i < listaAux.length; i++, j--) {
            listaAux2[i] = listaAux[j];
        }

        return listaAux2;
    }

    // Ordenar
    // byte
    public static byte[] OrdenarAscen(byte[] lista) {
        byte[] listaAux = lista;
        Arrays.sort(listaAux);
        return listaAux;
    }

    public static byte[] OrdenarDescen(byte[] lista) {

        byte[] listaAux = lista;
        byte[] listaAux2 = new byte[lista.length];
        Arrays.sort(listaAux);
        int j = lista.length - 1;
        for (int i = 0; i < listaAux.length; i++, j--) {
            listaAux2[i] = listaAux[j];
        }

        return listaAux2;
    }

    // Ordenar
    // short
    public static short[] OrdenarAscen(short[] lista) {
        short[] listaAux = lista;
        Arrays.sort(listaAux);
        return listaAux;
    }

    public static short[] OrdenarDescen(short[] lista) {

        short[] listaAux = lista;
        short[] listaAux2 = new short[lista.length];
        Arrays.sort(listaAux);
        int j = lista.length - 1;
        for (int i = 0; i < listaAux.length; i++, j--) {
            listaAux2[i] = listaAux[j];
        }

        return listaAux2;
    }

    // Ordenar
    // long
    public static long[] OrdenarAscen(long[] lista) {
        long[] listaAux = lista;
        Arrays.sort(listaAux);
        return listaAux;
    }

    public static long[] OrdenarDescen(long[] lista) {

        long[] listaAux = lista;
        long[] listaAux2 = new long[lista.length];
        Arrays.sort(listaAux);
        int j = lista.length - 1;
        for (int i = 0; i < listaAux.length; i++, j--) {
            listaAux2[i] = listaAux[j];
        }

        return listaAux2;
    }

    // Ordenar
    // char
    public static char[] OrdenarAscen(char[] lista) {
        char[] listaAux = lista;
        Arrays.sort(listaAux);
        return listaAux;
    }

    public static char[] OrdenarDescen(char[] lista) {

        char[] listaAux = lista;
        char[] listaAux2 = new char[lista.length];
        Arrays.sort(listaAux);
        int j = lista.length - 1;
        for (int i = 0; i < listaAux.length; i++, j--) {
            listaAux2[i] = listaAux[j];
        }

        return listaAux2;
    }

    // Letra esta en una cadena
    // Devueleve un boolean
    public static boolean Contiene(String cadena, char letra) {
        boolean contiene = false;
        if (cadena.contains(Character.toString(letra))) {
            contiene = true;
        }
        return contiene;
    }

    // Cadena esta en una cadena
    // Devueleve un boolean
    public static boolean Contiene(String cadena, String cadenaABuscar) {
        boolean contiene = false;
        if (cadena.contains(cadenaABuscar)) {
            contiene = true;
        }
        return contiene;
    }

    // Cadena tiene Uppercases
    // Devueleve un boolean
    public static boolean ContieneUpperCase(String cadena) {
        String Uppercases = "ABCDEFGHIJKLMNÑOPQRSTUVXYZ";
        boolean contiene = false;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.contains(Character.toString(Uppercases.charAt(i)))) {
                contiene = true;
                break;
            }
        }

        return contiene;
    }

    // Cadena tiene Uppercases
    // Devueleve un boolean
    public static boolean ContieneLowerCase(String cadena) {
        String LowerCases = "abcdefghijklmnñopqrstuvxyz";
        boolean contiene = false;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.contains(Character.toString(LowerCases.charAt(i)))) {
                contiene = true;
                break;
            }
        }

        return contiene;
    }

    // char tiene Uppercases
    // Devueleve un boolean
    public static boolean ContieneUpperCase(char letra) {
        String Uppercases = "ABCDEFGHIJKLMNÑOPQRSTUVXYZ";
        boolean contiene = false;


        if (Uppercases.contains(Character.toString(letra))) {
            contiene = true;

        }


        return contiene;
    }

    // char tiene LowerCases
    // Devueleve un boolean

    /*TODO optimizar el codigo*/
    public static boolean ContieneLowerCase(char letra) {
        String LowerCases = "abcdefghijklmnñopqrstuvxyz";

        return LowerCases.contains(Character.toString(letra));
    }

}

