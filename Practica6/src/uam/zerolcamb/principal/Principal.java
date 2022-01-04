/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.zerolcamb.principal;

import java.io.IOException;
import java.util.LinkedList;
import uam.zerolcamb.clases.Alumno;
import uam.zerolcamb.operaciones.Escritura;
import uam.zerolcamb.operaciones.Lectura;
import uam.zerolcamb.operaciones.OperacionesObjeto;

/**
 *
 * @author Zerol
 */
public class Principal {
    public static void main(String[] args) {
        LinkedList<Alumno> listaAlumnos;
        /* Se lee un objeto desde un archivo */
        OperacionesObjeto operacionesObjeto = new OperacionesObjeto();
        try {
            listaAlumnos = operacionesObjeto.leeArchivo();
            System.out.println("Se ha leido los datos de tu lista correctamente");
        } catch (IOException | ClassNotFoundException e) {
            /* Si no existe el objeto se crea la lista que corresponde a este mismo */
            System.out.println("Se ha creado el archivo alumnos.dat correctamente");
            listaAlumnos = new LinkedList<>();
        }

        /* Descomentar operaciones para probar la escritura y lectura de archivos de texto plano */
        // alumno = leerAlumno();
        // guardarAlumno(alumno);
        // procesarArchivo();
        /* Descomentar los siguientes para observar la persistencia al escribir objetos */
       listaAlumnos = inicializarAlumnos(listaAlumnos);
       imprimirLista(listaAlumnos);
       try{
           escribirLista(listaAlumnos);
       } catch (IOException e) {
           System.out.println("Hubo un error al escribir en el archivo");
       }


    }
/* Metodo para crear un alumno generico */
    public static Alumno leerAlumno(){
        Alumno alumno = new Alumno();
        alumno.setIdAlumno(1);
        alumno.setNombre("Nombre Alumno 1");
        alumno.setLicenciatura("Licenciatura Alumno 1");
        return alumno;
    }

/* Metodo para guardar un alumno en un archivo */
    public static void guardarAlumno(Alumno alumno){
        Escritura escritura = new Escritura();
        escritura.escribir("DatosAlumnos.txt", alumno);
    }
/* Metodo para procesar un archivo */
    public static void procesarArchivo(){
        Lectura lectura = new Lectura();
        lectura.leer("DatosAlumnos.txt");
    }
/* Metodo para inicializar una lista de alumnos */
    public static LinkedList<Alumno> inicializarAlumnos(LinkedList<Alumno> lista){
        for (int i = 0; i < 6; i++) {
            Alumno alumno = new Alumno();
            alumno.setIdAlumno((i+1));
            alumno.setLicenciatura("Licenciatura "+(i+1));
            alumno.setNombre("Alumno " + (i+1));
            lista.add(alumno);
        }
        return lista;
    }
/* Metodo para imprimir una lista de alumnos */
    public static void imprimirLista(LinkedList<Alumno> lista){
        for (Alumno alumno :
                lista) {
            System.out.println(alumno);
        }
    }
/* Metodo para escribir una lista de alumnos */
    public static void escribirLista(LinkedList<Alumno> lista) throws IOException {
        OperacionesObjeto operacionesObjeto = new OperacionesObjeto();
        operacionesObjeto.actualizaArchivo(lista);
    }
}
