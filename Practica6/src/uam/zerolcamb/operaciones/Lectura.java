/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.zerolcamb.operaciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import uam.zerolcamb.clases.Alumno;



/**
 *
 * @author Zerol
 */
public class Lectura {
    /* Metodo para leer un archivo plano */
    public void leer(String nombreArchivo){
        String cadenaLeida;
        FileReader fr;
        try {
            /* Se construye un FileReader */
            fr = new FileReader(nombreArchivo);
            /* Se construye un BufferedReader */
            BufferedReader br = new BufferedReader(fr);
            System.out.println("Los alumnos leidos son : ");
            /* Se lee la primera linea del archivo */
            cadenaLeida = br.readLine();
            /* Mientras la linea del archivo no sea null */
            while(cadenaLeida != null){
                /* Se utiliza un StringTokenizer para "Tokenizar" la cadena leida a partir de un delimitador */
                StringTokenizer st = new StringTokenizer(cadenaLeida, ",");
                /* Se crea un alumno auxiliar que se construira a partir de la lectura del archivo */
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(Integer.parseInt(st.nextToken()));
                alumno.setNombre(st.nextToken());
                alumno.setLicenciatura(st.nextToken());
                System.out.println("Alumno: " + alumno);
                // System.out.println("Alumno: " +cadenaLeida);
                /* Se lee la siguiente linea */
                cadenaLeida = br.readLine();
            }
            /* Se cierra el archivo */
            br.close();
        }   catch (IOException ex) {
            Logger.getLogger(Lectura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
