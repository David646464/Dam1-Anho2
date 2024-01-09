package clasesparaninfo.puntoGeografico;

public class MainPuntoGeografico {
    public static void main(String[] args) {
        clasesparaninfo.puntoGeografico.PuntoGeografico punto = new clasesparaninfo.puntoGeografico.PuntoGeografico();
        punto = punto.generarAleatorio();


        System.out.println(punto.latitud);
        System.out.println(punto.longitud);
        System.out.println(punto.urlGoogleMaps());
        System.out.println(punto.urlNominatimJson());
        System.out.println(punto.urlNominatimXml());

    }
}
