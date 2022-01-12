/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.zerolcamb.operaciones;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import uam.zerolcamb.clases.Alumno;

/**
 *
 * @author Zerol
 */
public class OperacionesAlumnos {
    private FileOutputStream salArch;
    private ObjectOutputStream salStream;
    private FileInputStream entArch;
    private ObjectInputStream entStream;

    public void actualizaArchivo(ArrayList<Alumno> listaAlumnos) throws IOException {
        /* Se inicializa un FileOutpuStream para escribir en el archivo */
        salArch = new FileOutputStream("Alumnos.dat");
        /* Se inicializa un ObjectOutputStream para escribir un objeto en el archivo */
        salStream = new ObjectOutputStream(salArch);
        /* Se escribe el objeto LinkedList en el archivo */
        salStream.writeObject(listaAlumnos);
        salStream.flush();
        salStream.close();
    }
    /* Leer archivo */
    public ArrayList<Alumno> leeArchivo() throws IOException, ClassNotFoundException {
        entArch = new FileInputStream("Alumnos.dat");
        entStream = new ObjectInputStream(entArch);
        Object lista = entStream.readObject();
        entStream.close();
        return (ArrayList<Alumno>) lista;
    }
    
    public Alumno buscarAlumno(ArrayList<Alumno> lista, String boleta){
        for (Alumno alumno : lista) {
            if(alumno.getBoleta().equals(boleta)){
                return alumno;
            }
        }
        return null;
    }
    
    public boolean existeBoleta(ArrayList<Alumno> lista, String boleta){
        for (Alumno alumno : lista) {
            if(alumno.getBoleta().equals(boleta)){
                return true;
            }
        }
        return false;
    }
}
