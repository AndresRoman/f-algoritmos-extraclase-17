package paquete_principal;
import paquete_estudiante.Estudiante;
import paquete_academico.*;
import paquete_general.Pais;
/**
 * Autor: Andres Roman
 * Fecha: 19/10/2017
 */
public class Principal {
    public static void main(String[] args) {
        // Se crean las clases de Pais
        Pais pu = new Pais();
        pu.establecer_nombre("Ecuador");
        Pais pa1 = new Pais();
        pa1.establecer_nombre("Colombia");
        Pais pa2 = new Pais();
        pa2.establecer_nombre("Peru");
        // Se crean las clases de Docente
        Docente d1 = new Docente();
        d1.establecer_nombres("Mario");
        d1.establecer_apellidos("Alcivar");
        d1.establecer_pais(pa1);
        Docente d2 = new Docente();
        d2.establecer_nombres("Maria");
        d2.establecer_apellidos("Ruiz");
        d2.establecer_pais(pa2);
        // Se crean las clases de Carrera
        Carrera c1 = new Carrera();
        c1.establecer_nombre("Sistemas");
        c1.establecer_modalidad("presencial");
        Carrera c2 = new Carrera();
        c2.establecer_nombre("Sistemas");
        c2.establecer_modalidad("presencial");
        // Se crean las clases de Asignatura
        Asignatura a1 = new Asignatura();
        a1.establecer_nombre("Matematicas");
        a1.establecer_creditos(10);
        a1.establecer_carrera(c1);
        a1.establecer_docente(d1);
        Asignatura a2 = new Asignatura();
        a2.establecer_nombre("Fisica");
        a2.establecer_creditos(8);
        a2.establecer_carrera(c2);
        a2.establecer_docente(d2);
        // Se crean las clases Universidad
        Universidad uni = new Universidad();
        uni.establecer_nombre("Universidad Tecnica Particular de Loja");
        uni.establecer_siglas("UTPL");
        uni.establecer_pais(pu);
        // Se crea la clase Estudiante
        Estudiante est1 = new Estudiante();
        est1.establecer_nombres("Luis V.");
        est1.establecer_apellidos("Perez J.");
        est1.establecer_asignatura_1(a1);
        est1.establecer_asignatura_2(a2);
        est1.establecer_universidad(uni);
        // Se imprime Caso 1
        System.out.println("Caso 1:");
        System.out.println("");
        System.out.println(est1);
        
        
        // Se crean las clases de Pais
        Pais pu2 = new Pais();
        pu2.establecer_nombre("Ecuador");
        Pais pa3 = new Pais();
        pa3.establecer_nombre("Venezuela");
        Pais pa4 = new Pais();
        pa4.establecer_nombre("Peru");
        // Se crean las clases de Docente
        Docente d3 = new Docente();
        d3.establecer_nombres("Luis");
        d3.establecer_apellidos("Armijos");
        d3.establecer_pais(pa3);
        Docente d4 = new Docente();
        d4.establecer_nombres("Maria");
        d4.establecer_apellidos("Ruiz");
        d4.establecer_pais(pa4);
        // Se crean las clases de Carrera
        Carrera c3 = new Carrera();
        c3.establecer_nombre("Ingenieria Quimica");
        c3.establecer_modalidad("presencial");
        Carrera c4 = new Carrera();
        c4.establecer_nombre("Ingenieria Quimica");
        c4.establecer_modalidad("distancia");
        // Se crean las clases de Asignatura
        Asignatura a3 = new Asignatura();
        a3.establecer_nombre("Biologia");
        a3.establecer_creditos(9);
        a3.establecer_carrera(c3);
        a3.establecer_docente(d3);
        Asignatura a4 = new Asignatura();
        a4.establecer_nombre("Fisica");
        a4.establecer_creditos(7);
        a4.establecer_carrera(c4);
        a4.establecer_docente(d4);
        // Se crean las clases Universidad
        Universidad uni2 = new Universidad();
        uni2.establecer_nombre("Universidad Tecnica Equinoccial");
        uni2.establecer_siglas("UTE");
        uni2.establecer_pais(pu2);
        // Se crea la clase Estudiante
        Estudiante est2 = new Estudiante();
        est2.establecer_nombres("Ana");
        est2.establecer_apellidos("Lima J.");
        est2.establecer_asignatura_1(a3);
        est2.establecer_asignatura_2(a4);
        est2.establecer_universidad(uni2);
        // Se imprime Caso 2
        System.out.println("Caso 2:");
        System.out.println("");
        System.out.println(est2);
        
    }
}
