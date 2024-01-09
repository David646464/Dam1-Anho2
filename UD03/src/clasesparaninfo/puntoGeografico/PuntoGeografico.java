package clasesparaninfo.puntoGeografico;

/**
 * The type Punto geografico.
 */
public class PuntoGeografico {
    /**
     * The Longitud.
     */
    public double longitud;
    /**
     * The Latitud.
     */
    public double latitud;
    /**
     * The Nombre.
     */
    public String nombre;


    /**
     * Instantiates a new Punto geografico.
     */
    public PuntoGeografico() {
        this.longitud = 0;
        this.latitud = 0;
    }

    /**
     * Instantiates a new Punto geografico.
     *
     * @param nombre   the nombre
     * @param longitud the longitud
     * @param latitud  the latitud
     */
    public PuntoGeografico(String nombre, double longitud, double latitud) {
        System.out.println(longitud +"=="+  latitud);
        if (longitud < -180 || longitud > 180) throw new IllegalArgumentException("Valor fuera de rango");
        if (latitud < -90 || latitud > 90) throw new IllegalArgumentException("Valor fuera de rango");
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    /**
     * Instantiates a new Punto geografico.
     *
     * @param longitud the longitud
     * @param latitud  the latitud
     */
    public PuntoGeografico(double longitud, double latitud) {
        System.out.println(longitud +"=="+  latitud);
        if (longitud < -180 || longitud > 180) throw new IllegalArgumentException("Valor fuera de rango");
        if (latitud < -90 || latitud > 90) throw new IllegalArgumentException("Valor fuera de rango");
        this.latitud = latitud;
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre +
                ", latitud=" + latitud +
                ", longitud='" + longitud + '\'';
    }

    /**
     * Mostrar grados decimales.
     */
    public void mostrarGradosDecimales(){
        System.out.println("La latituz es: " + latitud);
        System.out.println("La longitud es: " + longitud);
    }

    /**
     * Generar aleatorio punto geografico.
     *
     * @return the punto geografico
     */
    public PuntoGeografico generarAleatorio(){
        double longitud = numAleat(-180, 180) ;
        double latitud = numAleat(-180, 180) ;
        return new PuntoGeografico(longitud,latitud);

    }

    private static double numAleat(double i, double j) {
        double numero = (i) + (Math.random() * ((j - i)));
        if (numero > j) {
            numero -= 1.0;
        } else if (numero < i) {
            numero += 1.0;
        }
        return numero;
    }

    /**
     * Url google maps string.
     *
     * @return the string
     */
    public String urlGoogleMaps(){
        return "https://www.google.es/maps/@" + String.format("%.7f", latitud).replace(',','.') + "," + String.format("%.7f", longitud).replace(',','.') + ",12z";
    }

    /**
     * Url nominatim xml string.
     *
     * @return the string
     */
    public String urlNominatimXml(){
        return "https://nominatim.openstreetmap.org/reverse?format=xml&lat=" + String.format("%.7f", latitud).replace(',','.') + "&lon=" + String.format("%.7f", longitud).replace(',','.') + "&zoom=14";
    }

    /**
     * Url nominatim json string.
     *
     * @return the string
     */
    public String urlNominatimJson(){
        return "https://nominatim.openstreetmap.org/reverse?format=jsonv2&lat=" + String.format("%.7f", latitud).replace(',','.') + "&lon=" + String.format("%.7f", longitud).replace(',','.');
    }
}
