package principal;
/**
 * Autor: Andres Roman
 * Fecha: 16/10/2017
 */
public class Docente {
    // Atributos
    private String nombres;
    private String apellidos;
    private String titulo_tercer_nivel;
    private String titulo_cuarto_nivel;
    private String asignatura_1;
    private String asignatura_2;
    // Metodos set
    public void establecer_nombres(String nom){
        nombres=nom;
    }
    public void establecer_apellidos(String apes){
        apellidos=apes;
    }
    public void establecer_titulo_tercer_nivel(String titulo3){
        titulo_tercer_nivel=titulo3;
    }
    public void establecer_titulo_cuarto_nivel(String titulo4){
        titulo_cuarto_nivel=titulo4;
    }
    public void establecer_asignatura_1(String asig1){
        asignatura_1=asig1;
    }
    public void establecer_asignatura_2(String asig2){
        asignatura_2=asig2;
    }
    // Metodos get
    public String obtener_nombres(){
        return nombres;
    }
    public String obtener_apellidos(){
        return apellidos;
    }
    public String obtener_titulo_tercer_nivel(){
        return titulo_tercer_nivel;
    }
    public String obtener_titulo_cuarto_nivel(){
        return titulo_cuarto_nivel;
    }
    public String obtener_asignatura_1(){
        return asignatura_1;
    }
    public String obtener_asignatura_2(){
        return asignatura_2;
    }
}
