/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.zerolcamb.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import uam.zerolcamb.clases.Alumno;
import uam.zerolcamb.operaciones.OperacionesLista;

/**
 *
 * @author Zerol
 */
public class Principal {
    public static void main(String[] args) {
        LinkedList<Alumno> lista = new LinkedList<>();
        insertarAlumno(lista);
        imprimirLista(lista);
        mostrarAlumno(lista, "Boleta 2");
        mostrarAlumno(lista, "2135467");
        borrarAlumno(lista, "Boleta 3");
        imprimirLista(lista);
        System.out.println("\n");
        Collections.sort(lista, Collections.reverseOrder());
        imprimirLista(lista);
    }
    
    public static LinkedList<Alumno> insertarAlumno(LinkedList<Alumno> lista){
        OperacionesLista operacionesLista = new OperacionesLista();
        
        for (int i = 0; i < 5; i++) {
            Alumno alumno = new Alumno();
            alumno.setBoleta("Boleta " + (i+1));
            alumno.setNombre("Nombre " + (i+1));
            alumno.setPrimerApellido("Primer Apellido " + (i+1));
            alumno.setSegundoApellido("Segundo Apellido " + (i+1));
            alumno.setLicenciatura("Licenciatura " + (i+1));
            
            lista = operacionesLista.insertarAlumno(lista, alumno);
        }
        return lista;
    }
    
    public static void imprimirLista(LinkedList<Alumno> lista){
        OperacionesLista operacionesLista = new OperacionesLista();
        operacionesLista.imprimirLista(lista);
    }
    
    public static int buscarAlumno(LinkedList<Alumno> lista, String boleta){
        OperacionesLista operacionesLista = new OperacionesLista();
        return operacionesLista.buscarAlumno(lista, boleta);
    }
    
    public static void mostrarAlumno(LinkedList<Alumno> lista, String boleta){
        OperacionesLista operacionesLista = new OperacionesLista();
        
        int posicion;
        
        posicion = buscarAlumno(lista, boleta);
        
        if(posicion < 0) System.out.println("El alumno no existe");
        else{
            System.out.println("\n Los datos del alumno buscado son: ");
            Alumno alumno = operacionesLista.regresarAlumno(lista, posicion);
            System.out.println(alumno);
        }
    }
    public static LinkedList<Alumno> borrarAlumno(LinkedList<Alumno> lista, String matricula){
        OperacionesLista operacionesLista = new OperacionesLista();
    
        int posicion;
        
        posicion = buscarAlumno(lista, matricula);
        
        if(posicion < 0) System.out.println("El alumno no existe");
        else{
            lista = operacionesLista.borrarAlumno(lista, posicion);
        }
        return lista;
    }
}
