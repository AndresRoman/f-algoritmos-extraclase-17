package paquete_deportes;
/**
 * Autor: Andres Roman
 * Fecha: 27/10/2017
 */
public class Tecnico {
    private String nombre;
    private String funcion;
    private int edad;
        // Costructor
    public Tecnico (String n, String f, int e){
        nombre=n;
        funcion=f;
        edad=e;
    }
    // Metodos set
    public void establecer_nombre(String nom){
        nombre=nom;
    }
    public void establecer_funcion(String fun){
        funcion=fun;
    }
    public void establecer_edad(int ed){
        edad=ed;
    }
    // Metodos get
    public String obtener_nombre(){
        return nombre;
    }
    public String obtener_funcion(){
        return funcion;
    }
    public int obtener_edad(){
        return edad;
    }
    // Metodo toString
    @Override
    public String toString(){
        String cadena = String.format("%s - %s - %d años\n", obtener_nombre(),
                obtener_funcion(), obtener_edad());
        return cadena;
    }
}
