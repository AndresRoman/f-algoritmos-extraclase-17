package paquete_deportes;
/**
 * Autor: Andres Roman
 * Fecha: 27/10/2017
 */
public class Jugador {
    private String nombre;
    private String posicion;
    private int edad;
    // Costructor
    public Jugador (String n, String p, int e){
        nombre=n;
        posicion=p;
        edad=e;
    }
    // Metodos set
    public void establecer_nombre(String nom){
        nombre=nom;
    }
    public void establecer_posicion(String pos){
        posicion=pos;
    }
    public void establecer_edad(int ed){
        edad=ed;
    }
    // Metodos get
    public String obtener_nombre(){
        return nombre;
    }
    public String obtener_posicion(){
        return posicion;
    }
    public int obtener_edad(){
        return edad;
    }
    // Metodo toString
    @Override
    public String toString(){
        String cadena = String.format("%s - %s - %d años\n", obtener_nombre(),
                obtener_posicion(), obtener_edad());
        return cadena;
    }
}
