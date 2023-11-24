package clasesparaninfo.EP0711;

public class MarcaPagina {
    int paginas;
    int paginaActual;
    Libro libro;

    public MarcaPagina(Libro libro) {
        this.paginas = libro.paginas;
        this.paginaActual = 0;
        this.libro = libro;
    }

    public void siguientePagina() {
        if (paginaActual < paginas) {
            paginaActual++;
            String[] pagina = libro.contenidoLibro.get(paginaActual);
            imprimirPagina(pagina);
        } else {
            System.out.println("=================================");
            System.out.println("No hay mas paginas hacia adelante");
            System.out.println("=================================");
        }
    }

    public void anteriorPagina() {
        if (paginaActual > 0) {
            paginaActual--;
            String[] pagina = libro.contenidoLibro.get(paginaActual);
            imprimirPagina(pagina);
        } else {
            System.out.println("==============================");
            System.out.println("No hay mas paginas hacia atras");
            System.out.println("==============================");
        }
    }

    public void imprimirPagina(String[] pagina) {
        for (int i = 0; i < pagina.length; i++) {
            System.out.println(pagina[i]);
        }
    }

    public void volverAPaginaInicio() {

        paginaActual = 0;
        String[] pagina = libro.contenidoLibro.get(paginaActual);
        imprimirPagina(pagina);
    }

}
