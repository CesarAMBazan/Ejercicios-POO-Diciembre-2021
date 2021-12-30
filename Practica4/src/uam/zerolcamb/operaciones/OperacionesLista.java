/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.zerolcamb.operaciones;

import java.util.LinkedList;
import uam.zerolcamb.clases.Alumno;

/**
 *
 * @author Zerol
 */
public class OperacionesLista {
    public LinkedList<Alumno> insertarAlumno(LinkedList<Alumno> listaAlumnos, Alumno alumno){
        listaAlumnos.add(alumno);
        return listaAlumnos;
    } 
    
    public void imprimirLista(LinkedList<Alumno> listaAlumno){
        for (Alumno alumno : listaAlumno) {
            System.out.println(alumno);
        }
    }
    
    public Alumno regresarAlumno(LinkedList<Alumno> listaAlumno, int posicion){
        return listaAlumno.get(posicion);
    }
    
    public LinkedList<Alumno> borrarAlumno(LinkedList<Alumno> listaAlumno, int posicion){
        listaAlumno.remove(posicion);
        return listaAlumno;
    }
    
    public int buscarAlumno(LinkedList<Alumno> listaAlumnos, String boleta){
        int posicion = -1;
        for (Alumno alumno : listaAlumnos) {
            if(alumno.getBoleta().equals(boleta)){
                posicion = listaAlumnos.indexOf(alumno);
            }
        }
        return posicion;
    }
}
