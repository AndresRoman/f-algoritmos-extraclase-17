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
        // Caso 1
        System.out.println("Caso 1");
        c.establecer_nombres("Luis V.");
        c.establecer_apellidos("Perez J.");
        c.establecer_asignatura_1("Matematicas");
        b.establecer_creditos(8);
        c.establecer_asignatura_2("Fisica");
        b.establecer_creditos(6);
        c.establecer_titulo_tercer_nivel("Licenciado");
        a.establecer_nombre("Fisico Matematicas");
        a.establecer_nombre_universidad("Universidad Politecnica");
        c.establecer_titulo_cuarto_nivel("Magister");
        a.establecer_nombre("Docencia Matematica");
        a.establecer_nombre_universidad("Universidad Valenciana");
        System.out.printf("Datos del docente:"
                + "\nNombres: %s"
                + "\nApellidos: %s"
                + "\nTiene a su cargo las asignaturas: "
                + "\nAsignatura 1: %s con numero de creditos %d"
                + "\nAsignatura 2: %s con numero de creditos %d"
                + "\nEl docente tiene los siguientes titulos academicos:"
                + "\nTitulo 3er nivel: %s en %s - %s"
                + "\nTitulo 4to nivel: %s en %s - %s", c.obtener_nombres(), c.obtener_apellidos(),c.obtener_asignatura_1(), b.obtener_creditos(),c.obtener_asignatura_2(), b.obtener_creditos(), c.obtener_titulo_tercer_nivel(), a.obtener_nombre(), a.obtener_nombre_universidad(), c.obtener_titulo_cuarto_nivel(), a.obtener_nombre(), a.obtener_nombre_universidad());
        System.out.println("\n");
        // Caso 2
        System.out.println("Caso 2");
        c.establecer_nombres("Ana M.");
        c.establecer_apellidos("Velez P.");
        c.establecer_asignatura_1("Sociales");
        b.establecer_creditos(9);
        c.establecer_asignatura_2("Literatura");
        b.establecer_creditos(10);
        c.establecer_titulo_tercer_nivel("Licenciado");
        a.establecer_nombre("Ciencias Sociales");
        a.establecer_nombre_universidad("Universidad Salesiana");
        c.establecer_titulo_cuarto_nivel("Magister");
        a.establecer_nombre("Docencia Social");
        a.establecer_nombre_universidad("Universidad Cataluña");
        System.out.printf("Datos del docente:"
                + "\nNombres: %s"
                + "\nApellidos: %s"
                + "\nTiene a su cargo las asignaturas: "
                + "\nAsignatura 1: %s con numero de creditos %d"
                + "\nAsignatura 2: %s con numero de creditos %d"
                + "\nEl docente tiene los siguientes titulos academicos:"
                + "\nTitulo 3er nivel: %s en %s - %s"
                + "\nTitulo 4to nivel: %s en %s - %s", c.obtener_nombres(), c.obtener_apellidos(),c.obtener_asignatura_1(), b.obtener_creditos(),c.obtener_asignatura_2(), b.obtener_creditos(), c.obtener_titulo_tercer_nivel(), a.obtener_nombre(), a.obtener_nombre_universidad(), c.obtener_titulo_cuarto_nivel(), a.obtener_nombre(), a.obtener_nombre_universidad());
        System.out.println("");
    }    
}
