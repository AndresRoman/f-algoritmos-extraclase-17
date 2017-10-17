package principal;
/**
 * Autor: Andres Roman
 * Fecha: 16/10/2017
 */
public class Titulo {
    // Atributos
    private String nombre;
    private String nombre_universidad;
    // Metodos set
    public void establecer_nombre (String nom){
        nombre=nom;
    }
    public void establecer_nombre_universidad (String nom_universidad){
        nombre_universidad=nom_universidad;
    }
    // Metodos get
    public String obtener_nombre(){
        return nombre;
    }
    public String obtener_nombre_universidad(){
        return nombre_universidad;
    }
    
}
