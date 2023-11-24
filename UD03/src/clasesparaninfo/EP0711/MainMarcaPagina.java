package clasesparaninfo.EP0711;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainMarcaPagina {
    public static void main(String[] args) {
        String[] pagina1 = { "Hola", "1", "2", "3", "4" };
        String[] pagina2 = { "Mundo", "1", "2", "3", "4" };
        String[] pagina3 = { "Fin", "1", "2", "3", "4" };

        Map<Integer, String[]> LibroMundo = new HashMap<Integer, String[]>();
        LibroMundo.put(0, pagina1);
        LibroMundo.put(1, pagina2);
        LibroMundo.put(2, pagina3);

        Libro libro = new Libro(LibroMundo.size() - 1, "LibroMundo", LibroMundo);
        MarcaPagina marcaPagina1 = new MarcaPagina( libro);

        boolean indicador = true;
        System.out.println("Para empezar de 0 el libro escribe '0'");
        System.out.println("Para ir a la siguiente pagina escribe '1'");
        System.out.println("Para ir a la anterior pagina escribe '2'");
        System.out.println("Para salir escribe '-1'");
        while (indicador) {
            Scanner sc = new Scanner(System.in);
            int accion = sc.nextInt();

            switch (accion) {
                case 0: {
                    marcaPagina1.volverAPaginaInicio();
                }

                    break;
                case 1: {
                    marcaPagina1.siguientePagina();
                }

                    break;
                case 2: {
                    marcaPagina1.anteriorPagina();
                }

                    break;

                case -1: {
                    indicador = false;
                }
            }
        }
    }

}
