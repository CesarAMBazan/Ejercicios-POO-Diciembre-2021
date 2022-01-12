/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.sw.selecciones.negocio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.StringTokenizer;
import uam.pvoe.sw.selecciones.clases.Alumno;

/**
 *
 * @author ZerolCamb
 */
public class AdministrarAlumnos {
    
    
    public LinkedList<Alumno> listaPorCarrera(String claveLicenciatura){
        
        /* Se crea una lista donde se guardaran los alumnos que
           pertenezcan a una carrera en especifico
        */
        LinkedList<Alumno> listaAlumnos = new LinkedList(); 
        
        String cadenaLeida = "";
        FileReader fr;
        try {
            /* Se lee el archivo alumnos.dat */
            fr = new FileReader("alumnos.dat");
            BufferedReader archivoLectura = new BufferedReader(fr);
            cadenaLeida = archivoLectura.readLine();
            /* Si la cadena leina no esta vacia */
            while (cadenaLeida != null) {
                /* Se crea un alumno auxiliar */
                Alumno alumno = new Alumno();
                /* Se tokeniza la cadena leida, en este caso nuestro 
                   delimitador sera una coma
                */
                StringTokenizer st = new StringTokenizer(cadenaLeida, ",");
                
                /* Se construye el alumno auxiliar a partir de los tokens */
                alumno.setMatricula(st.nextToken());
                alumno.setNombre(st.nextToken());
                alumno.setPrimerApellido(st.nextToken());
                alumno.setSegundoApellido(st.nextToken());
                alumno.setLicenciatura(st.nextToken());
                
                /* Si la licenciatura del alumno construido es igual a la
                   licenciatura buscada
                */
                if(alumno.getLicenciatura().compareTo(claveLicenciatura) == 0){
                    /* Se añade al alumno a la lista */
                    listaAlumnos.add(alumno);
                    
                }
                /* Se lee la siguiente linea */
                cadenaLeida = archivoLectura.readLine();
            }
            /* Se cierra el archivo */
            archivoLectura.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo encontrar el archivo");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("No se pudo leer del archivo");
            e.printStackTrace();
        }
        
        /* Se regresa la lista obtenida */
        return listaAlumnos;
        
    }
    
}
