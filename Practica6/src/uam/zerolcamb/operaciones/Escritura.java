/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.zerolcamb.operaciones;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import uam.zerolcamb.clases.Alumno;

/**
 *
 * @author Zerol
 */
public class Escritura {
    
    /* Metodo para escribir en un archivo de texto plano */
    public void escribir(String nombreArchivo, Alumno alumno){
        try {
            /* Se crea un FileWriter */
            FileWriter fw = new FileWriter(nombreArchivo, true);
            /* Se crea un BufferedWriter */
            BufferedWriter bw = new BufferedWriter(fw);
            /* Se escribe en el archivo el alumno */
            bw.write(alumno.getIdAlumno()+","+alumno.getNombre()+","+alumno.getLicenciatura()+"\n");
            /* Se guardan los datos en el archivo */
            bw.flush();
            bw.close();
        } catch (IOException ex) { 
            Logger.getLogger(Escritura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
