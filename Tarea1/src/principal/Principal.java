package principal;
/**
 * Autor: Andres Roman
 * Fecha: 16/10/2017
 */
public class Principal {
    public static void main(String[] args) {
        // Creacion del objeto
        Titulo a = new Titulo();
        Asignatura b = new Asignatura();
        Docente c = new Docente();
        // Creacion de la cadena
        String cadena = String.format("Datos del docente:"
                + "\nNombres: %s"
                + "\nApellidos: %s"
                + "\nTiene a su cargo las asignaturas: "
                + "\nAsignatura 1: %s con numero de creditos %d"
                + "\nAsignatura 2: %s con numero de creditos %d"
                + "\nEl docente tiene los siguientes titulos academicos:"
                + "\nTitulo 3er nivel: %s en %s - %s"
                + "\nTitulo 4to nivel: %s en %s - %s", c.obtener_nombres(), c.obtener_apellidos());
        // Caso 1
        c.establecer_nombres("Luis V.");
        c.establecer_apellidos("Perez J.");
        System.out.printf(cadena);
    }    
}
