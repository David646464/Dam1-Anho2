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
        double[] a = {1.2,1.3,1.4};

    }
    public static  boolean esPrimo(int numero){
        boolean esPrimo = true;
        for (int i = 2; i < (numero + 1) / 2; i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }
        return  esPrimo;
    }

    // Numero aleatorio double
    public static double numAleat(double i, double j) {
        double numero = (i) + (Math.random() * ((j - i)));
        if (numero > j) {
            numero -= 1;
        } else if (numero < i) {
            numero += 1;
        }
        return numero;


    }

    // Numero aleatorio int
    public static int numAleat(int i, int j) {
        int numero;
        numero = (i) + (int) (Math.random() * ((j - i) + 1));

        return numero;
    }

    // Numero redondeado hacia abajo double

    public static double numRendonAbajo(double numero) {

        double numeroCarculado;
        numeroCarculado = Math.ceil(numero);

        return numeroCarculado;
    }

    // Numero redondeado hacia arriba double
    public static double numRendonArriba(double numero) {

        double numeroCarculado;
        numeroCarculado = Math.floor(numero);

        return numeroCarculado;
    }

    // Numero redondeado hacia el mas cercano double
    public static double numRendonCercano(double numero) {

        double numeroCarculado;
        numeroCarculado = Math.round(numero);

        return numeroCarculado;
    }

    // raiz devuelve double
    public static double numRaiz(double numero) {

        double numeroCarculado;
        numeroCarculado = Math.sqrt(numero);

        return numeroCarculado;
    }

    // valor absoluto devuelve double
    public static double numValorAbsoluto(double numero) {

        double numeroCarculado;
        numeroCarculado = Math.abs(numero);

        return numeroCarculado;
    }

    // Potencia devuelve double
    public static double numPotencia(double numero, double potencia) {
        return Math.pow(numero, potencia);
    }

    // Logaritmo devuelve double
    public static double numLogaritmo(double numero) {
        return Math.log(numero);
    }

    // Buscar mas grande en una lista int
    public static int buscarElMasGrande(int[] ListaNumeros) {
        int aux = -999999999;
        for (int listaNumero : ListaNumeros) {
            if (listaNumero > aux) {
                aux = listaNumero;
            }
        }

        return aux;
    }

    // Buscar mas grande en una lista double
    public static double buscarElMasGrande(double[] ListaNumeros) {
        double aux = -999999999;
        for (double listaNumero : ListaNumeros) {
            if (listaNumero > aux) {
                aux = listaNumero;
            }
        }

        return aux;
    }

    // Buscar mas pequeño en una lista int
    public static int buscarElMasBajo(int[] ListaNumeros) {
        int aux = 999999999;
        for (int listaNumero : ListaNumeros) {
            if (listaNumero < aux) {
                aux = listaNumero;
            }
        }

        return aux;
    }

    // Buscar mas pequeño en una lista double
    public static double buscarElMasBajo(double[] ListaNumeros) {
        double aux = 999999999;
        for (double listaNumero : ListaNumeros) {
            if (listaNumero < aux) {
                aux = listaNumero;
            }
        }

        return aux;
    }

    // Elimina de un array un elemento con el indice.
    // int
    public static int[] eliminarEnUnaLista(int[] lista, int indice) {
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
    public static double[] eliminarEnUnaLista(double[] lista, int indice) {
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
    public static String[] eliminarEnUnaLista(String[] lista, int indice) {
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
    public static byte[] eliminarEnUnaLista(byte[] lista, int indice) {
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
    public static float[] eliminarEnUnaLista(float[] lista, int indice) {
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
    public static char[] eliminarEnUnaLista(char[] lista, int indice) {
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
    public static boolean[] eliminarEnUnaLista(boolean[] lista, int indice) {
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
    public static long[] eliminarEnUnaLista(long[] lista, int indice) {
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
    public static short[] eliminarEnUnaLista(short[] lista, int indice) {
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
    public static short[] agregarAUnaLista(short[] lista, short elemento, int indice) {
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
    public static long[] agregarAUnaLista(long[] lista, long elemento, int indice) {
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
    public static int[] agregarAUnaLista(int[] lista, int elemento, int indice) {
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
    public static double[] agregarAUnaLista(double[] lista, double elemento, int indice) {
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
    public static String[] agregarAUnaLista(String[] lista, String elemento, int indice) {
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
    public static boolean[] agregarAUnaLista(boolean[] lista, boolean elemento, int indice) {
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
    public static byte[] agregarAUnaLista(byte[] lista, byte elemento, int indice) {
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
    public static char[] agregarAUnaLista(char[] lista, char elemento, int indice) {
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
    public static float[] agregarAUnaLista(float[] lista, float elemento, int indice) {
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
    public static String[] ordenarAscen(String[] lista) {
        String[] listaAux = lista.clone();
        Arrays.sort(listaAux);
        return listaAux;
    }

    public static String[] ordenarDescen(String[] lista) {

        String[] listaAux = lista.clone();
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

    public static int[] ordenarAscen(int[] lista) {
        int[] listaAux = lista.clone();
        Arrays.sort(listaAux);
        return listaAux;
    }

    public static int[] ordenarDescen(int[] lista) {

        int[] listaAux = lista.clone();
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
    public static double[] ordenarAscen(double[] lista) {
        double[] listaAux = lista.clone();
        Arrays.sort(listaAux);
        return listaAux;
    }

    public static double[] ordenarDescen(double[] lista) {

        double[] listaAux = lista.clone();
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
    public static float[] ordenarAscen(float[] lista) {
        float[] listaAux = lista.clone();
        Arrays.sort(listaAux);
        return listaAux;
    }

    public static float[] ordenarDescen(float[] lista) {

        float[] listaAux = lista.clone();
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
    public static byte[] ordenarAscen(byte[] lista) {
        byte[] listaAux = lista.clone();
        Arrays.sort(listaAux);
        return listaAux;
    }

    public static byte[] ordenarDescen(byte[] lista) {

        byte[] listaAux = lista.clone();
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
    public static short[] ordenarAscen(short[] lista) {
        short[] listaAux = lista.clone();
        Arrays.sort(listaAux);
        return listaAux;
    }

    public static short[] ordenarDescen(short[] lista) {

        short[] listaAux = lista.clone();
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
    public static long[] ordenarAscen(long[] lista) {
        long[] listaAux = lista.clone();
        Arrays.sort(listaAux);
        return listaAux;

    }

    public static long[] ordenarDescen(long[] lista) {

        long[] listaAux = lista.clone();
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
    public static char[] ordenarAscen(char[] lista) {
        char[] listaAux = lista.clone();
        Arrays.sort(listaAux);
        return listaAux;
    }

    public static char[] ordenarDescen(char[] lista) {

        char[] listaAux = lista.clone();
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
    public static boolean contiene(String cadena, char letra) {
        return cadena.contains(Character.toString(letra));
    }

    // Cadena esta en una cadena
    // Devueleve un boolean
    public static boolean contiene(String cadena, String cadenaABuscar) {
        return cadena.contains(cadenaABuscar);
    }

    // Cadena tiene Uppercases
    // Devueleve un boolean
    public static boolean contieneUpperCase(String cadena) {
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
    public static boolean contieneLowerCase(String cadena) {
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
    public static boolean contieneUpperCase(char letra) {
        String Uppercases = "ABCDEFGHIJKLMNÑOPQRSTUVXYZ";
        return Uppercases.contains(Character.toString(letra));
    }

    // char tiene LowerCases
    // Devueleve un boolean


    public static boolean contieneLowerCase(char letra) {
        String LowerCases = "abcdefghijklmnñopqrstuvxyz";

        return LowerCases.contains(Character.toString(letra));
    }

}

