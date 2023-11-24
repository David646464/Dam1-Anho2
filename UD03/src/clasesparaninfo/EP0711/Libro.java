package clasesparaninfo.EP0711;

import java.util.HashMap;
import java.util.Map;

public class Libro {
    int paginas;
    String titulo;
    Map<Integer, String[]> contenidoLibro = new HashMap<Integer, String[]>();
    public Libro(int paginas, String titulo, Map<Integer, String[]> contenidoLibro) {
        this.paginas = paginas;
        this.titulo = titulo;
        this.contenidoLibro = contenidoLibro;
    }
    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Map<Integer, String[]> getContenidoLibro() {
        return contenidoLibro;
    }
    public void setContenidoLibro(Map<Integer, String[]> contenidoLibro) {
        this.contenidoLibro = contenidoLibro;
    }

    

    
}
