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
import uam.pvoe.sw.selecciones.clases.Licenciatura;

/**
 *
 * @author ZerolCamb
 */
public class AdministrarLicenciaturas {
    
      public LinkedList<Licenciatura> listaLicenciaturas() {
        String cadenaLeida = "";
        FileReader fr;
        /* Se creara una lista donde se almacenaran todas las licenciaturas
           almacenadas en un archivo
        */
        LinkedList <Licenciatura> listaLicenciaturas = new LinkedList();
        try {
            /* Se lee el archivo licenciaturas.dat */
            fr = new FileReader("licenciaturas.dat");
            BufferedReader archivoLectura = new BufferedReader(fr);
            /* Se lee la primera linea */
            cadenaLeida = archivoLectura.readLine();
            /* Mientras la cadena leina no este vacia */
            while (cadenaLeida != null) {
                /* Se crea una licenciatura auxiliar */
                Licenciatura licenciatura = new Licenciatura();
                /* Se tokeniza la cadena leina con un delimitador coma */
                StringTokenizer st = new StringTokenizer(cadenaLeida, ",");
                /* Se construye la licenciatura auxiliar a partir de estos tokens */
                licenciatura.setClave(st.nextToken());
                licenciatura.setNombre(st.nextToken());
                /* Se añade la licenciatura a la lista */
                listaLicenciaturas.add(licenciatura);
                /* Se lee la siguiente linea del archivo */
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
        /* Se regresa la lista de licenciaturas */
        return listaLicenciaturas;
    }
    
    
    
}
