package expresiones;

public class Ejercicio5 {
    public static void main(String[] args) {
        /*Ejercicio 9 */

        /*El doble de un número N
        N * 2

        El triple de un número N
        N * 3

        Seis veces la diferencia de dos números enteros A y B
        (A - B) * 6

        La diferencia entre el producto de A por B y la suma de C más D
        A * B - (C + D)

        La mitad de la última cifra de un número entero A
        (A % 10) / 2

        La suma de los dígitos de un número entero N de 3 cifras
        (N / 100) + (N / 10 % 10) + (N % 10)

        La suma de la última cifra de los números enteros N y M
        (N % 10) + (M % 10)

        Comprobar si un número entero N es múltiplo de 2 y de 3
        (N % 2 == 0 && N % 3 == 0)

        Comprobar si la última cifra de un número entero N es par
        (N % 10) % 2 == 0

        Comprobar si la primera cifra de un número entero N de 3 cifras es impar
        (N / 100) % 2 == 1

        Comprobar si la primera cifra de un número entero N de 4 cifras es par
        (N / 1000) % 2 == 0

        Comprobar si una variable A de tipo carácter contiene una letra mayúscula
        String A = "J";
        String cadena = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        boolean result = cadena.contains(A);

        Comprobar si una variable A de tipo carácter contiene una letra mayúscula o minúscula
        String A = "J";
        String cadena = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz";
        boolean result = cadena.contains(A);

        Comprobar si una variable A de tipo carácter no contiene una letra mayúscula
        String A = "J";
        String cadena = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        boolean result = true != cadena.contains(A);

        Comprobar si una variable A de tipo carácter no contiene una letra mayúscula o minúscula
        String A = "J";
        String cadena = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz";
        boolean result = true != cadena.contains(A);

        Comprobar si el contenido de la variable N termina en 0 ó en 7
        N.charAt(N.length() - 1) == '0' || N.charAt(N.length() - 1) == '7'

        Comprobar si el contenido de la variable precio es igual o mayor que 10€ y menor que 50€
        precio >= 10 && precio < 50

        Modificar el valor de la variable entera N incrementándolo en 77. Por ejemplo, si N contiene el valor 10, después de la operación contendrá el valor 87.
        N = N + 77

        Modificar el valor de la variable entera N disminuyéndolo en 3. Por ejemplo, si N contiene el valor 10, después de la operación contendrá el valor 7.
        N = N - 3

        Modificar el valor de la variable entera N duplicando su valor. Por ejemplo, si N contiene el valor 10, después de la operación contendrá el valor 20.
        N = N * 2

        Sumar el dígito más a la derecha de N al propio valor de N. Por ejemplo, si N contiene el valor 463 después de la operación contendrá el valor 466 ( 463 + 3 )
        N = N + (N % 10)

        Comprobar si un número entero N de cuatro cifras es capicúa. Un número es capicúa si se puede leer igual de derecha a izquierda que de izquierda a derecha.
        N % 10 == N / 1000 && (N % 100 / 10) == (N / 100 % 10)

        Una variable entera M contiene un número de mes codificado de 1 (enero) a 12 (diciembre). Comprobar si corresponde a un mes de 30 días.
        M == 4 || M == 6 || M == 9 || M == 11 

        Quitarle a un número entero N su última cifra. Supondremos que N tiene más de una cifra. Por ejemplo si N contiene el valor 123 después de la operación contendrá el valor 12.
        N = N / 10

        Quitarle a un número entero N de 5 cifras su primera cifra. Por ejemplo si N contiene el valor 12345, después de la operación contendrá el valor 2345.
        N = N % 10000

        Comprobar si una variable C de tipo char contiene un dígito. (Carácter entre 0 y 9)
        C == '0'|| C == '1' || C == '2' || C == '3' || C == '4' || C == '5' || C == '6' || C == '7' || C == '8' || C == '9'

        Dada dos variables enteras N y M de cuatro cifras, sumar las cifras de N y guardar la 
        suma en la variable X, sumar las cifras de M y guardar la suma en la variable Y. 
        Finalmente guarda en la variable Z la suma de X e Y.
        X = (N / 1000) + (N / 100 % 10) + (N / 10 % 10) + (N % 10)
        Y = (M / 1000) + (M / 100 % 10) + (M / 10 % 10) + (M % 10)
        Z = X + Y

        Con DN, MN, AN  día, mes y año de nacimiento de una persona y DA, MA, AA día, mes y año actual, escribe la expresión algorítmica que compruebe si tiene 18 años cumplidos.
        18 <= ((MA >= MN) ? ((DA >= DN) ? AA - AN : AA - AN - 1)  : AA - AN - 1 )

        Dado un número N de cuatro cifras, comprobar si la primera cifra(la más a la izquierda) es impar.
        N / 1000 % 2 == 1

        Dado un número N de cinco cifras, comprobar si la primera cifra (la más a la izquierda) es igual a la segunda.
        (N  10000) == ((N % 100)  10)

        Determinar si un número entero N de 5 cifras es capicúa.
        N % 10 == N / 10000 && (N % 1000 / 10) == (N / 1000 % 10)

        Comprobar si una variable C de tipo char contiene una vocal mayúscula.
        String C = "J";
        String cadena = "AEIOU";
        boolean result =  cadena.contains(C);

        Comprobar si una variable C de tipo char no contiene una vocal mayúscula.
        String C = "J";
        String cadena = "AEIOU";
        boolean result =  true != cadena.contains(C);

        Dadas dos variables A y B de tipo char, comprobar si las dos contienen una vocal minúscula.
        String A = "J";
        String B = "J";
        String cadena = "aeiou";
        boolean result =   cadena.contains(A);
        boolean result =   cadena.contains(B);

        Dada una variable A que contiene un año, determinar si ese año es bisiesto. Un año es bisiesto si es divisible por 4 y no por 100 ó si es divisible por 400.
        (A % 100 == 0 ) ? false : (A % 4 == 0)

        Dado un número N de dos cifras, comprobar si las dos cifras son iguales.
        N % 10 == N / 10

        Dado un número N de dos cifras, comprobar si la suma de sus cifras es un número par.
        (N % 10 + N / 10) % 2 == 0

        Dado un número N de tres cifras, comprobar si la cifra del centro es la mayor.
        N / 10 % 10 > N / 100 && N / 10 % 10 > N % 10

        Dado un número N de cuatro cifras, comprobar si alguna de las cifras es un 4.
        N / 1000 == 4 || N / 100 % 10 || N / 10 % 10 || N % 10

        Dado un número N de 4 cifras, asigna a una variable X las dos primeras cifras del número.
        X = N / 100 

        Dado un número entero N, modifícalo restando a N el valor de su última cifra. Por ejemplo, si N = 123, el valor final de N debe ser 120.
        N = N - (N % 10)

        Dados dos números enteros N y M, modifica M restándole la última cifra de N.  Por ejemplo si M = 123 y N = 47, el valor final de M debe ser 116.
        M = M - (N % 10)

        Si el valor de una variable entera N es positivo, sumarle 5 sino sumarle 10.
        N += (N >= 0) ? 5 : 10;

        Si el valor de una variable entera N es negativo, asignarle el valor 5 sino asignarle el valor 100.
        N = (N >= 0) ? 5 : 100;
        */
    }
    
}
