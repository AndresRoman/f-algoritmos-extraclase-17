package principal;
/**
 * Autor: Andres Roman
 * Fecha: 16/10/2017
 */
public class Asignatura {
    // Atributos
    private String nombre;
    private int creditos;
    // Metodos set
    public void establecer_nombre(String nom){
        nombre=nom;
    }
    public void establecer_creditos(int creds){
        creditos=creds;
    }
    // Metodos get
    public String obtener_nombre(){
        return nombre;
    }
    public int obtener_creditos(){
        return creditos;
    }
}
