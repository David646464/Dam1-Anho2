package ejerciciosApuntes.claseMath;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;


/**
 * La clase ClaseAuxiliar proporciona métodos matemáticos y de manipulación de arreglos.
 * Contiene funciones para generar números aleatorios, redondear, calcular raíces, potencias,
 * ordenar arreglos, buscar valores extremos, eliminar elementos de un arreglo y agregar elementos a un arreglo.
 * Además, incluye funciones para verificar si un número es primo y verificar la presencia de mayúsculas y minúsculas
 * en cadenas y caracteres.
 */
public class ClaseAuxiliar {
    //Variables propias de ClaseAuxiliar

    public enum Unidades{NANOS,SECONDS,MINUTES,HOURS,DAYS,WEEKS,MONTHS,YEARS}



    /**
     * Verifica si un número entero es primo.
     *
     * @param numero Número entero a verificar.
     * @return true si el número es primo, false de lo contrario.
     */
    public static boolean esPrimo(int numero) {

        int limite = (int) Math.sqrt(numero);

        for (int i = 2; i <= limite; i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    /**
     * Genera un número decimal aleatorio entre i y j (ambos incluidos).
     *
     * @param i Extremo inferior del rango.
     * @param j Extremo superior del rango.
     * @return Número decimal aleatorio.
     */
    public static double numAleat(double i, double j) {
        double numero = (i) + (Math.random() * ((j - i)));
        if (numero > j) {
            numero -= 1;
        } else if (numero < i) {
            numero += 1;
        }
        return numero;


    }

    /**
     * Genera un número entero aleatorio entre i y j (ambos incluidos).
     *
     * @param i Extremo inferior del rango.
     * @param j Extremo superior del rango.
     * @return Número entero aleatorio.
     */
    public static int numAleat(int i, int j) {
        int numero;
        numero = (i) + (int) (Math.random() * ((j - i) + 1));

        return numero;
    }

    /**
     * Redondea un número decimal hacia abajo.
     *
     * @param numero Número decimal a redondear.
     * @return Número redondeado hacia abajo.
     */

    public static double numRendonAbajo(double numero) {

        double numeroCarculado;
        numeroCarculado = Math.ceil(numero);

        return numeroCarculado;
    }

    /**
     * Redondea un número decimal hacia arriba.
     *
     * @param numero Número decimal a redondear.
     * @return Número redondeado hacia arriba.
     */
    public static double numRendonArriba(double numero) {

        double numeroCarculado;
        numeroCarculado = Math.floor(numero);

        return numeroCarculado;
    }

    /**
     * Redondea un número decimal al entero más cercano.
     *
     * @param numero Número decimal a redondear.
     * @return Número redondeado al entero más cercano.
     */
    public static double numRendonCercano(double numero) {

        double numeroCarculado;
        numeroCarculado = Math.round(numero);

        return numeroCarculado;
    }

    /**
     * Calcula la raíz cuadrada de un número decimal.
     *
     * @param numero Número decimal.
     * @return Raíz cuadrada del número.
     */
    public static double numRaiz(double numero) {

        double numeroCarculado;
        numeroCarculado = Math.sqrt(numero);

        return numeroCarculado;
    }

    /**
     * Calcula el valor absoluto de un número decimal.
     *
     * @param numero Número decimal.
     * @return Valor absoluto del número.
     */
    public static double numValorAbsoluto(double numero) {

        double numeroCarculado;
        numeroCarculado = Math.abs(numero);

        return numeroCarculado;
    }

    /**
     * Calcula una potencia de un número.
     *
     * @param numero   Número base.
     * @param potencia Exponente.
     * @return Resultado de elevar el número a la potencia.
     */
    public static double numPotencia(double numero, double potencia) {
        return Math.pow(numero, potencia);
    }

    /**
     * Calcula el logaritmo natural de un número decimal.
     *
     * @param numero Número decimal.
     * @return Logaritmo natural del número.
     */
    public static double numLogaritmo(double numero) {
        return Math.log(numero);
    }

    /**
     * Busca el número entero más grande en un arreglo.
     *
     * @param ListaNumeros Arreglo de números enteros.
     * @return El número entero más grande.
     */
    public static int buscarElMasGrande(int[] ListaNumeros) {
        int aux = -999999999;
        for (var listaNumero : ListaNumeros) {
            if (listaNumero <= aux) continue;
            aux = listaNumero;
        }

        return aux;
    }

    /**
     * Busca el número decimal más grande en un Array.
     *
     * @param ListaNumeros Array de números decimales.
     * @return El número decimal más grande.
     */
    public static double buscarElMasGrande(double[] ListaNumeros) {
        double aux = -999999999;
        for (double listaNumero : ListaNumeros) {
            if (listaNumero > aux) {
                aux = listaNumero;
            }
        }

        return aux;
    }

    /**
     * Busca el número entero más pequeño en un Array.
     *
     * @param ListaNumeros Array de números enteros.
     * @return El número entero más pequeño.
     */
    public static int buscarElMasBajo(int[] ListaNumeros) {
        int aux = 999999999;
        for (int listaNumero : ListaNumeros) {
            if (listaNumero < aux) {
                aux = listaNumero;
            }
        }

        return aux;
    }

    /**
     * Busca el número decimal más pequeño en un Array.
     *
     * @param ListaNumeros Array de números decimales.
     * @return El número decimal más pequeño.
     */
    public static double buscarElMasBajo(double[] ListaNumeros) {
        double aux = 999999999;
        for (double listaNumero : ListaNumeros) {
            if (listaNumero < aux) {
                aux = listaNumero;
            }
        }

        return aux;
    }

    /**
     * Elimina un elemento de un Array de enteros en una posición específica.
     *
     * @param lista  Array de enteros del que se eliminará el elemento.
     * @param indice Índice del elemento que se eliminará.
     * @return Nuevo Array de enteros sin el elemento eliminado.
     */
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

    /**
     * Elimina un elemento de un Array de doubles en una posición específica.
     *
     * @param lista  Array de doubles del que se eliminará el elemento.
     * @param indice Índice del elemento que se eliminará.
     * @return Nuevo Array de enteros sin el elemento eliminado.
     */
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

    /**
     * Elimina un elemento de un Array de Strings en una posición específica.
     *
     * @param lista  Array de Strings del que se eliminará el elemento.
     * @param indice Índice del elemento que se eliminará.
     * @return Nuevo Array de enteros sin el elemento eliminado.
     */
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

    /**
     * Elimina un elemento de un Array de bytes en una posición específica.
     *
     * @param lista  Array de bytes del que se eliminará el elemento.
     * @param indice Índice del elemento que se eliminará.
     * @return Nuevo Array de enteros sin el elemento eliminado.
     */
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

    /**
     * Elimina un elemento de un Array de floats en una posición específica.
     *
     * @param lista  Array de floats del que se eliminará el elemento.
     * @param indice Índice del elemento que se eliminará.
     * @return Nuevo Array de enteros sin el elemento eliminado.
     */
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

    /**
     * Elimina un elemento de un Array de char en una posición específica.
     *
     * @param lista  Array de char del que se eliminará el elemento.
     * @param indice Índice del elemento que se eliminará.
     * @return Nuevo Array de enteros sin el elemento eliminado.
     */
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

    /**
     * Elimina un elemento de un Array de boolean en una posición específica.
     *
     * @param lista  Array de boolean del que se eliminará el elemento.
     * @param indice Índice del elemento que se eliminará.
     * @return Nuevo Array de enteros sin el elemento eliminado.
     */
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

    /**
     * Elimina un elemento de un Array de longs en una posición específica.
     *
     * @param lista  Array de longs del que se eliminará el elemento.
     * @param indice Índice del elemento que se eliminará.
     * @return Nuevo Array de enteros sin el elemento eliminado.
     */
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

    /**
     * Elimina un elemento de un Array de shorts en una posición específica.
     *
     * @param lista  Array de shorts del que se eliminará el elemento.
     * @param indice Índice del elemento que se eliminará.
     * @return Nuevo Array de enteros sin el elemento eliminado.
     */
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

    /**
     * Agrega un elemento a un Array de shorts en una posición específica o al final si el índice es mayor que la longitud actual del Array.
     *
     * @param lista    Array de shorts al que se agregará el elemento.
     * @param elemento Elemento que se agregará al Array.
     * @param indice   Índice en el que se insertará el nuevo elemento.
     * @return Nuevo Array de shorts con el elemento agregado.
     */
    public static short[] agregarAUnaLista(short[] lista, short elemento, int indice) {
        short[] listaAux = new short[lista.length + 1];
        if (indice + 1 <= lista.length && indice >= 0) {

            System.arraycopy(lista, 0, listaAux, 0, indice);
            listaAux[indice] = elemento;
            System.arraycopy(lista, indice, listaAux, indice + 1, lista.length - indice);
        } else if (indice > 0) {
            listaAux = new short[lista.length + (indice - lista.length) + 1];
            System.arraycopy(lista, 0, listaAux, 0, lista.length);
            listaAux[indice] = elemento;
        } else {
            listaAux = lista.clone();
        }
        return listaAux;
    }

    /**
     * Agrega un elemento a un Array de longs en una posición específica o al final si el índice es mayor que la longitud actual del Array.
     *
     * @param lista    Array de longs al que se agregará el elemento.
     * @param elemento Elemento que se agregará al Array.
     * @param indice   Índice en el que se insertará el nuevo elemento.
     * @return Nuevo Array de longs con el elemento agregado.
     */
    public static long[] agregarAUnaLista(long[] lista, long elemento, int indice) {
        long[] listaAux = new long[lista.length + 1];
        if (indice + 1 <= lista.length && indice >= 0) {

            System.arraycopy(lista, 0, listaAux, 0, indice);
            listaAux[indice] = elemento;
            System.arraycopy(lista, indice, listaAux, indice + 1, lista.length - indice);
        } else if (indice > 0) {
            listaAux = new long[lista.length + (indice - lista.length) + 1];
            System.arraycopy(lista, 0, listaAux, 0, lista.length);
            listaAux[indice] = elemento;
        } else {
            listaAux = lista.clone();
        }
        return listaAux;
    }

    /**
     * Agrega un elemento a un Array de enteros  en una posición específica o al final si el índice es mayor que la longitud actual del Array.
     *
     * @param lista    Array de enteros  al que se agregará el elemento.
     * @param elemento Elemento que se agregará al Array.
     * @param indice   Índice en el que se insertará el nuevo elemento.
     * @return Nuevo Array de enteros  con el elemento agregado.
     */
    public static int[] agregarAUnaLista(int[] lista, int elemento, int indice) {
        int[] listaAux = new int[lista.length + 1];
        if (indice + 1 <= lista.length && indice >= 0) {

            System.arraycopy(lista, 0, listaAux, 0, indice);
            listaAux[indice] = elemento;
            System.arraycopy(lista, indice, listaAux, indice + 1, lista.length - indice);
        } else if (indice > 0) {
            listaAux = new int[lista.length + (indice - lista.length) + 1];
            System.arraycopy(lista, 0, listaAux, 0, lista.length);
            listaAux[indice] = elemento;
        } else {
            listaAux = lista.clone();
        }
        return listaAux;
    }

    /**
     * Agrega un elemento a un Array de doubles en una posición específica o al final si el índice es mayor que la longitud actual del Array.
     *
     * @param lista    Array de doubles al que se agregará el elemento.
     * @param elemento Elemento que se agregará al Array.
     * @param indice   Índice en el que se insertará el nuevo elemento.
     * @return Nuevo Array de doubles con el elemento agregado.
     */
    public static double[] agregarAUnaLista(double[] lista, double elemento, int indice) {
        double[] listaAux = new double[lista.length + 1];
        if (indice + 1 <= lista.length && indice >= 0) {

            System.arraycopy(lista, 0, listaAux, 0, indice);
            listaAux[indice] = elemento;
            System.arraycopy(lista, indice, listaAux, indice + 1, lista.length - indice);
        } else if (indice > 0) {
            listaAux = new double[lista.length + (indice - lista.length) + 1];
            System.arraycopy(lista, 0, listaAux, 0, lista.length);
            listaAux[indice] = elemento;
        } else {
            listaAux = lista.clone();
        }
        return listaAux;
    }

    /**
     * Agrega un elemento a un Array de Strings en una posición específica o al final si el índice es mayor que la longitud actual del Array.
     *
     * @param lista    Array de Strings al que se agregará el elemento.
     * @param elemento Elemento que se agregará al Array.
     * @param indice   Índice en el que se insertará el nuevo elemento.
     * @return Nuevo Array de Strings con el elemento agregado.
     */
    public static String[] agregarAUnaLista(String[] lista, String elemento, int indice) {
        String[] listaAux = new String[lista.length + 1];
        if (indice + 1 <= lista.length && indice >= 0) {

            System.arraycopy(lista, 0, listaAux, 0, indice);
            listaAux[indice] = elemento;
            System.arraycopy(lista, indice, listaAux, indice + 1, lista.length - indice);
        } else if (indice > 0) {
            listaAux = new String[lista.length + (indice - lista.length) + 1];
            System.arraycopy(lista, 0, listaAux, 0, lista.length);
            listaAux[indice] = elemento;
        } else {
            listaAux = lista.clone();
        }
        return listaAux;
    }

    /**
     * Agrega un elemento a un Array de booleans en una posición específica o al final si el índice es mayor que la longitud actual del Array.
     *
     * @param lista    Array de booleans al que se agregará el elemento.
     * @param elemento Elemento que se agregará al Array.
     * @param indice   Índice en el que se insertará el nuevo elemento.
     * @return Nuevo Array de booleans con el elemento agregado.
     */
    public static boolean[] agregarAUnaLista(boolean[] lista, boolean elemento, int indice) {
        boolean[] listaAux = new boolean[lista.length + 1];
        if (indice + 1 <= lista.length && indice >= 0) {

            System.arraycopy(lista, 0, listaAux, 0, indice);
            listaAux[indice] = elemento;
            System.arraycopy(lista, indice, listaAux, indice + 1, lista.length - indice);
        } else if (indice > 0) {
            listaAux = new boolean[lista.length + (indice - lista.length) + 1];
            System.arraycopy(lista, 0, listaAux, 0, lista.length);
            listaAux[indice] = elemento;
        } else {
            listaAux = lista.clone();
        }
        return listaAux;
    }

    /**
     * Agrega un elemento a un Array de bytes en una posición específica o al final si el índice es mayor que la longitud actual del Array.
     *
     * @param lista    Array de bytes al que se agregará el elemento.
     * @param elemento Elemento que se agregará al Array.
     * @param indice   Índice en el que se insertará el nuevo elemento.
     * @return Nuevo Array de bytes con el elemento agregado.
     */
    public static byte[] agregarAUnaLista(byte[] lista, byte elemento, int indice) {
        byte[] listaAux = new byte[lista.length + 1];
        if (indice + 1 <= lista.length && indice >= 0) {

            System.arraycopy(lista, 0, listaAux, 0, indice);
            listaAux[indice] = elemento;
            System.arraycopy(lista, indice, listaAux, indice + 1, lista.length - indice);
        } else if (indice > 0) {
            listaAux = new byte[lista.length + (indice - lista.length) + 1];
            System.arraycopy(lista, 0, listaAux, 0, lista.length);
            listaAux[indice] = elemento;
        } else {
            listaAux = lista.clone();
        }
        return listaAux;
    }

    /**
     * Agrega un elemento a un Array de chars cortos en una posición específica o al final si el índice es mayor que la longitud actual del Array.
     *
     * @param lista    Array de chars al que se agregará el elemento.
     * @param elemento Elemento que se agregará al Array.
     * @param indice   Índice en el que se insertará el nuevo elemento.
     * @return Nuevo Array de chars con el elemento agregado.
     */
    public static char[] agregarAUnaLista(char[] lista, char elemento, int indice) {
        char[] listaAux = new char[lista.length + 1];
        if (indice + 1 <= lista.length && indice >= 0) {

            System.arraycopy(lista, 0, listaAux, 0, indice);
            listaAux[indice] = elemento;
            System.arraycopy(lista, indice, listaAux, indice + 1, lista.length - indice);
        } else if (indice > 0) {
            listaAux = new char[lista.length + (indice - lista.length) + 1];
            System.arraycopy(lista, 0, listaAux, 0, lista.length);
            listaAux[indice] = elemento;
        } else {
            listaAux = lista.clone();
        }
        return listaAux;
    }

    /**
     * Agrega un elemento a un Array de floats en una posición específica o al final si el índice es mayor que la longitud actual del Array.
     *
     * @param lista    Array de floats al que se agregará el elemento.
     * @param elemento Elemento que se agregará al Array.
     * @param indice   Índice en el que se insertará el nuevo elemento.
     * @return Nuevo Array de floats con el elemento agregado.
     */
    public static float[] agregarAUnaLista(float[] lista, float elemento, int indice) {
        float[] listaAux = new float[lista.length + 1];
        if (indice + 1 <= lista.length && indice >= 0) {

            System.arraycopy(lista, 0, listaAux, 0, indice);
            listaAux[indice] = elemento;
            System.arraycopy(lista, indice, listaAux, indice + 1, lista.length - indice);
        } else if (indice > 0) {
            listaAux = new float[lista.length + (indice - lista.length) + 1];
            System.arraycopy(lista, 0, listaAux, 0, lista.length);
            listaAux[indice] = elemento;
        } else {
            listaAux = lista.clone();
        }
        return listaAux;
    }

    /**
     * Ordena un Array de cadenas en orden ascendente.
     *
     * @param lista Array de cadenas a ordenar.
     * @return Array ordenado en orden ascendente.
     */
    public static String[] ordenarAscen(String[] lista) {
        String[] listaAux = lista.clone();
        Arrays.sort(listaAux);
        return listaAux;
    }

    /**
     * Ordena un Array de cadenas en orden descendente.
     *
     * @param lista Array de cadenas a ordenar.
     * @return Array ordenado en orden descendente.
     */
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

    /**
     * Ordena un Array de enteros en orden ascendente.
     *
     * @param lista Array de enteros a ordenar.
     * @return Array ordenado en orden ascendente.
     */
    public static int[] ordenarAscen(int[] lista) {
        int[] listaAux = lista.clone();
        Arrays.sort(listaAux);
        return listaAux;
    }

    /**
     * Ordena un Array de enteros en orden descendente.
     *
     * @param lista Array de enteros a ordenar.
     * @return Array ordenado en orden descendente.
     */
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

    /**
     * Ordena un Array de numeros decimales en orden ascendente.
     *
     * @param lista Array de numeros decimales a ordenar.
     * @return Array ordenado en orden ascendente.
     */
    public static double[] ordenarAscen(double[] lista) {
        double[] listaAux = lista.clone();
        Arrays.sort(listaAux);
        return listaAux;
    }

    /**
     * Ordena un Array de numeros decimales en orden descendente.
     *
     * @param lista Array de numeros decimales a ordenar.
     * @return Array ordenado en orden descendente.
     */
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

    /**
     * Ordena un Array de números de punto flotante de precisión simple en orden ascendente.
     *
     * @param lista Array de números de punto flotante de precisión simple a ordenar.
     * @return Array ordenado en orden ascendente.
     */
    public static float[] ordenarAscen(float[] lista) {
        float[] listaAux = lista.clone();
        Arrays.sort(listaAux);
        return listaAux;
    }

    /**
     * Ordena un Array de números de punto flotante de precisión simple en orden descendente.
     *
     * @param lista Array de números de punto flotante de precisión simple a ordenar.
     * @return Array ordenado en orden descendente.
     */
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

    /**
     * Ordena un Array de bytes en orden ascendente.
     *
     * @param lista Array de bytes a ordenar.
     * @return Array ordenado en orden ascendente.
     */
    public static byte[] ordenarAscen(byte[] lista) {
        byte[] listaAux = lista.clone();
        Arrays.sort(listaAux);
        return listaAux;
    }

    /**
     * Ordena un Array de bytes en orden descendente.
     *
     * @param lista Array de bytes a ordenar.
     * @return Array ordenado en orden descendente.
     */
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

    /**
     * Ordena un Array de enteros de 16 bits (short) en orden ascendente.
     *
     * @param lista Array de enteros de 16 bits (short) a ordenar.
     * @return Array ordenado en orden ascendente.
     */
    public static short[] ordenarAscen(short[] lista) {
        short[] listaAux = lista.clone();
        Arrays.sort(listaAux);
        return listaAux;
    }

    /**
     * Ordena un Array de enteros de 16 bits (short) en orden descendente.
     *
     * @param lista Array de enteros de 16 bits (short) a ordenar.
     * @return Array ordenado en orden descendente.
     */
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

    /**
     * Ordena un Array de enteros de 64 bits (long) en orden ascendente.
     *
     * @param lista Array de enteros de 64 bits (long) a ordenar.
     * @return Array ordenado en orden ascendente.
     */
    public static long[] ordenarAscen(long[] lista) {
        long[] listaAux = lista.clone();
        Arrays.sort(listaAux);
        return listaAux;

    }

    /**
     * Ordena un Array de enteros de 64 bits (long) en orden descendente.
     *
     * @param lista Array de enteros de 64 bits (long) a ordenar.
     * @return Array ordenado en orden descendente.
     */
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

    /**
     * Ordena un Array de caracteres en orden ascendente.
     *
     * @param lista Array de caracteres a ordenar.
     * @return Array ordenado en orden ascendente.
     */
    public static char[] ordenarAscen(char[] lista) {
        char[] listaAux = lista.clone();
        Arrays.sort(listaAux);
        return listaAux;
    }

    /**
     * Ordena un Array de caracteres en orden descendente.
     *
     * @param lista Array de caracteres a ordenar.
     * @return Array ordenado en orden descendente.
     */
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

    /**
     * Verifica si un carácter está presente en una cadena.
     *
     * @param cadena Cadena en la que se busca el carácter.
     * @param letra Carácter a buscar en la cadena.
     * @return True si el carácter está presente, False si no lo está.
     */
    public static boolean contiene(String cadena, char letra) {
        return cadena.contains(Character.toString(letra));
    }

    /**
     * Verifica si una cadena está presente en otra cadena.
     *
     * @param cadena Cadena en la que se busca la subcadena.
     * @param cadenaABuscar Subcadena que se busca en la cadena principal.
     * @return True si la subcadena está presente, False si no lo está.
     */
    public static boolean contiene(String cadena, String cadenaABuscar) {
        return cadena.contains(cadenaABuscar);
    }

    /**
     * Verifica si una cadena contiene caracteres en mayúscula.
     *
     * @param cadena Cadena en la que se busca caracteres en mayúscula.
     * @return True si la cadena contiene al menos un carácter en mayúscula, False si no contiene ninguno.
     */
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

    /**
     * Verifica si una cadena contiene caracteres en minúscula.
     *
     * @param cadena Cadena en la que se busca caracteres en minúscula.
     * @return True si la cadena contiene al menos un carácter en minúscula, False si no contiene ninguno.
     */
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

    /**
     * Verifica si un carácter está en mayúscula.
     *
     * @param letra Carácter a verificar.
     * @return True si el carácter está en mayúscula, False si está en minúscula o no es una letra.
     */
    public static boolean contieneUpperCase(char letra) {
        String Uppercases = "ABCDEFGHIJKLMNÑOPQRSTUVXYZ";
        return Uppercases.contains(Character.toString(letra));
    }

    /**
     * Verifica si un carácter está en minúscula.
     *
     * @param letra Carácter a verificar.
     * @return True si el carácter está en minúscula, False si está en mayúscula o no es una letra.
     */
    public static boolean contieneLowerCase(char letra) {
        String LowerCases = "abcdefghijklmnñopqrstuvxyz";

        return LowerCases.contains(Character.toString(letra));
    }

    //TODO terminar de documentar los siguientes metodos

    public static int secondBetween(LocalDateTime momento1, LocalDateTime momento2){
        long diferencia = 0;
        if (momento1.until(momento2, ChronoUnit.SECONDS) < 0){
            diferencia = momento2.until(momento1, ChronoUnit.SECONDS);
        } else if (momento1.until(momento2, ChronoUnit.SECONDS) > 0) {
            diferencia = momento1.until(momento2, ChronoUnit.SECONDS);
        }
        return (int)diferencia;
    }

    public static int minutesBetween(LocalDateTime momento1, LocalDateTime momento2){
        long diferencia = 0;
        if (momento1.until(momento2, ChronoUnit.MINUTES) < 0){
            diferencia = momento2.until(momento1, ChronoUnit.MINUTES);
        } else if (momento1.until(momento2, ChronoUnit.MINUTES) > 0) {
            diferencia = momento1.until(momento2, ChronoUnit.MINUTES);
        }
        return (int)diferencia;
    }

    public static int hoursBetween(LocalDateTime momento1, LocalDateTime momento2){
        long diferencia = 0;
        if (momento1.until(momento2, ChronoUnit.HOURS) < 0){
            diferencia = momento2.until(momento1, ChronoUnit.HOURS);
        } else if (momento1.until(momento2, ChronoUnit.HOURS) > 0) {
            diferencia = momento1.until(momento2, ChronoUnit.HOURS);
        }
        return (int)diferencia;
    }

    public static int daysBetween(LocalDateTime momento1, LocalDateTime momento2){
        long diferencia = 0;
        if (momento1.until(momento2, ChronoUnit.DAYS) < 0){
            diferencia = momento2.until(momento1, ChronoUnit.DAYS);
        } else if (momento1.until(momento2, ChronoUnit.DAYS) > 0) {
            diferencia = momento1.until(momento2, ChronoUnit.DAYS);
        }
        return (int)diferencia;
    }

    public static int daysBetween(LocalDate momento1, LocalDate momento2){
        long diferencia = 0;
        if (momento1.until(momento2, ChronoUnit.DAYS) < 0){
            diferencia = momento2.until(momento1, ChronoUnit.DAYS);
        } else if (momento1.until(momento2, ChronoUnit.DAYS) > 0) {
            diferencia = momento1.until(momento2, ChronoUnit.DAYS);
        }
        return (int)diferencia;
    }
    public static int weeksBetween(LocalDateTime momento1, LocalDateTime momento2){
        long diferencia = 0;
        if (momento1.until(momento2, ChronoUnit.WEEKS) < 0){
            diferencia = momento2.until(momento1, ChronoUnit.WEEKS);
        } else if (momento1.until(momento2, ChronoUnit.WEEKS) > 0) {
            diferencia = momento1.until(momento2, ChronoUnit.WEEKS);
        }
        return (int)diferencia;
    }

    public static int weeksBetween(LocalDate momento1, LocalDate momento2){
        long diferencia = 0;
        if (momento1.until(momento2, ChronoUnit.WEEKS) < 0){
            diferencia = momento2.until(momento1, ChronoUnit.WEEKS);
        } else if (momento1.until(momento2, ChronoUnit.WEEKS) > 0) {
            diferencia = momento1.until(momento2, ChronoUnit.WEEKS);
        }
        return (int)diferencia;
    }

    public static int monthsBetween(LocalDateTime momento1, LocalDateTime momento2){
        long diferencia = 0;
        if (momento1.until(momento2, ChronoUnit.MONTHS) < 0){
            diferencia = momento2.until(momento1, ChronoUnit.MONTHS);
        } else if (momento1.until(momento2, ChronoUnit.MONTHS) > 0) {
            diferencia = momento1.until(momento2, ChronoUnit.MONTHS);
        }
        return (int)diferencia;
    }

    public static int monthsBetween(LocalDate momento1, LocalDate momento2){
        long diferencia = 0;
        if (momento1.until(momento2, ChronoUnit.MONTHS) < 0){
            diferencia = momento2.until(momento1, ChronoUnit.MONTHS);
        } else if (momento1.until(momento2, ChronoUnit.MONTHS) > 0) {
            diferencia = momento1.until(momento2, ChronoUnit.MONTHS);
        }
        return (int)diferencia;
    }

    public static int yearsBetween(LocalDateTime momento1, LocalDateTime momento2){
        long diferencia = 0;
        if (momento1.until(momento2, ChronoUnit.YEARS) < 0){
            diferencia = momento2.until(momento1, ChronoUnit.YEARS);
        } else if (momento1.until(momento2, ChronoUnit.YEARS) > 0) {
            diferencia = momento1.until(momento2, ChronoUnit.YEARS);
        }
        return (int)diferencia;
    }

    public static int yearsBetween(LocalDate momento1, LocalDate momento2){
        long diferencia = 0;
        if (momento1.until(momento2, ChronoUnit.YEARS) < 0){
            diferencia = momento2.until(momento1, ChronoUnit.YEARS);
        } else if (momento1.until(momento2, ChronoUnit.YEARS) > 0) {
            diferencia = momento1.until(momento2, ChronoUnit.YEARS);
        }
        return (int)diferencia;
    }


    public static long horaActual(Unidades unidades){
        long horaEnUnidades = 0;
        switch (unidades){
            case NANOS -> horaEnUnidades = LocalDateTime.now().toLocalTime().toNanoOfDay();
            case SECONDS -> horaEnUnidades = LocalDateTime.now().toLocalTime().toSecondOfDay();
            case MINUTES -> horaEnUnidades = LocalDateTime.now().toLocalTime().toSecondOfDay() / 60;
            case HOURS -> horaEnUnidades = LocalDateTime.now().toLocalTime().toSecondOfDay() / 3600;
        }
        return  horaEnUnidades;
    }

    public static LocalTime horaActual(){
        return  LocalTime.now();
    }

    public static boolean esBisiesto(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    private static int anhoSegunFecha(int mes , int dia){
        int year =  LocalDateTime.now().getYear();
        if (mes > LocalDateTime.now().getMonthValue()){
            year++;
        } else if (mes < LocalDateTime.now().getMonthValue()) {
            if (dia > LocalDateTime.now().getDayOfMonth()){
                year++;
            }
        }
    return  year;
    }

    
    public static long tiempoRestanteDays(int mes, int dia){
        LocalDateTime fechaAux = LocalDateTime.now();
        if (mes > 12 || mes <= 0 || dia <= 0) throw new IllegalArgumentException("El valor no es valido");

        switch (mes){
            case 4,6,9,11->{
                if (dia <= 30){
                    fechaAux = LocalDateTime.of(anhoSegunFecha(mes, dia),mes,dia,0,0);
                }
            }
            case 1,3,5,7,8,10,12->{
                if (dia <= 31){
                    fechaAux = LocalDateTime.of(anhoSegunFecha(mes, dia),mes,dia,0,0);

                }
            }
            case  2->{
                if (dia <= 28 || esBisiesto(anhoSegunFecha(mes,dia)) && dia == 29){
                    fechaAux = LocalDateTime.of(anhoSegunFecha(mes, dia),mes,dia,0,0);
                }
            }
        }

        return daysBetween(LocalDateTime.now(),fechaAux);
    }

    public static long tiempoRestanteWeeks(int mes, int dia){
        LocalDateTime fechaAux = LocalDateTime.now();

        if (mes > 12 || mes <= 0 || dia <= 0) throw new IllegalArgumentException();

        switch (mes){
            case 4,6,9,11->{
                if (dia <= 30){
                    fechaAux = LocalDateTime.of(anhoSegunFecha(mes, dia),mes,dia,0,0);
                }
            }
            case 1,3,5,7,8,10,12->{
                if (dia <= 31){
                    fechaAux = LocalDateTime.of(anhoSegunFecha(mes, dia),mes,dia,0,0);

                }
            }
            case  2->{
                if (dia <= 28 || esBisiesto(anhoSegunFecha(mes,dia)) && dia == 29){
                    fechaAux = LocalDateTime.of(anhoSegunFecha(mes, dia),mes,dia,0,0);
                }
            }
        }

        return weeksBetween(LocalDateTime.now(),fechaAux);
    }

    public static long tiempoRestanteMonths(int mes, int dia){
        LocalDateTime fechaAux = LocalDateTime.now();

        if (mes > 12 || mes <= 0 || dia <= 0) throw new IllegalArgumentException();

        switch (mes){
            case 4,6,9,11->{
                if (dia <= 30){
                    fechaAux = LocalDateTime.of(anhoSegunFecha(mes, dia),mes,dia,0,0);
                }
            }
            case 1,3,5,7,8,10,12->{
                if (dia <= 31){
                    fechaAux = LocalDateTime.of(anhoSegunFecha(mes, dia),mes,dia,0,0);

                }
            }
            case  2->{
                if (dia <= 28 || esBisiesto(anhoSegunFecha(mes,dia)) && dia == 29){
                    fechaAux = LocalDateTime.of(anhoSegunFecha(mes, dia),mes,dia,0,0);
                }
            }
        }

        return monthsBetween(LocalDateTime.now(),fechaAux);
    }

    public static long tiempoRestanteYears(int mes, int dia){
        LocalDateTime fechaAux = LocalDateTime.now();

        if (mes > 12 || mes <= 0 || dia <= 0) throw new IllegalArgumentException();

        switch (mes){
            case 4,6,9,11->{
                if (dia <= 30){
                    fechaAux = LocalDateTime.of(anhoSegunFecha(mes, dia),mes,dia,0,0);
                }
            }
            case 1,3,5,7,8,10,12->{
                if (dia <= 31){
                    fechaAux = LocalDateTime.of(anhoSegunFecha(mes, dia),mes,dia,0,0);

                }
            }
            case  2->{
                if (dia <= 28 || esBisiesto(anhoSegunFecha(mes,dia)) && dia == 29){
                    fechaAux = LocalDateTime.of(anhoSegunFecha(mes, dia),mes,dia,0,0);
                }
            }
        }

        return yearsBetween(LocalDateTime.now(),fechaAux);
    }

    public static LocalDateTime aumentarFecha (long cantidad, Unidades unidades){
        LocalDateTime aux = LocalDateTime.now();
        switch (unidades){
            case NANOS -> aux.plusNanos(cantidad);
            case SECONDS -> aux.plusSeconds(cantidad);
            case MINUTES -> aux.plusMinutes(cantidad);
            case HOURS -> aux.plusHours(cantidad);
            case DAYS -> aux.plusDays(cantidad);
            case WEEKS -> aux.plusWeeks(cantidad);
            case MONTHS -> aux.plusMonths(cantidad);
            case YEARS -> aux.plusYears(cantidad);
        }
        
        return  aux;
    }

    public static LocalDateTime aumentarFecha (LocalDateTime fecha,long cantidad, Unidades unidades){
        switch (unidades){
            case NANOS -> fecha.plusNanos(cantidad);
            case SECONDS -> fecha.plusSeconds(cantidad);
            case MINUTES -> fecha.plusMinutes(cantidad);
            case HOURS -> fecha.plusHours(cantidad);
            case DAYS -> fecha.plusDays(cantidad);
            case WEEKS -> fecha.plusWeeks(cantidad);
            case MONTHS -> fecha.plusMonths(cantidad);
            case YEARS -> fecha.plusYears(cantidad);
        }

        return fecha;
    }

    public static LocalDateTime disminuirFecha (long cantidad, Unidades unidades){
        LocalDateTime aux = LocalDateTime.now();
        switch (unidades){
            case NANOS -> aux.minusNanos(cantidad);
            case SECONDS -> aux.minusSeconds(cantidad);
            case MINUTES -> aux.minusMinutes(cantidad);
            case HOURS -> aux.minusHours(cantidad);
            case DAYS -> aux.minusDays(cantidad);
            case WEEKS -> aux.minusWeeks(cantidad);
            case MONTHS -> aux.minusMonths(cantidad);
            case YEARS -> aux.minusYears(cantidad);
        }

        return  aux;
    }

    public static LocalDateTime disminuirFecha (LocalDateTime fecha,long cantidad, Unidades unidades){
        switch (unidades){
            case NANOS -> fecha.minusNanos(cantidad);
            case SECONDS -> fecha.minusSeconds(cantidad);
            case MINUTES -> fecha.minusMinutes(cantidad);
            case HOURS -> fecha.minusHours(cantidad);
            case DAYS -> fecha.minusDays(cantidad);
            case WEEKS -> fecha.minusWeeks(cantidad);
            case MONTHS -> fecha.minusMonths(cantidad);
            case YEARS -> fecha.minusYears(cantidad);
        }

        return fecha;
    }
}

