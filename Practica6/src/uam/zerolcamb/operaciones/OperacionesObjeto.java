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
import java.util.LinkedList;
import uam.zerolcamb.clases.Alumno;

/**
 *
 * @author Zerol
 */
public class OperacionesObjeto {
    private FileOutputStream salArch;
    private ObjectOutputStream salStream;
    private FileInputStream entArch;
    private ObjectInputStream entStream;

    public void actualizaArchivo(LinkedList<Alumno> listaAlumnos) throws IOException {
        /* Se inicializa un FileOutpuStream para escribir en el archivo */
        salArch = new FileOutputStream("Alumnos.dat");
        /* Se inicializa un ObjectOutputStream para escribir un objeto en el archivo */
        salStream = new ObjectOutputStream(salArch);
        /* Se escribe el objeto LinkedList en el archivo */
        salStream.writeObject(listaAlumnos);
        System.out.println("Se guardaron correctamente los datos");
        salStream.flush();
        salStream.close();
    }
    public LinkedList<Alumno> leeArchivo() throws IOException, ClassNotFoundException {
        entArch = new FileInputStream("Alumnos.dat");
        entStream = new ObjectInputStream(entArch);
        Object lista = entStream.readObject();
        entStream.close();
        return (LinkedList<Alumno>) lista;

    }
}