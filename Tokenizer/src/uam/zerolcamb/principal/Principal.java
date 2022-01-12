/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.zerolcamb.principal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import uam.zerolcamb.clases.Universitario;

/**
 *
 * @author Zerol
 */
public class Principal {
    public static void main(String[] args) {
        String delim = "\n";
        String cadenaTokenizar = "Hector\n17\nIPN\nCDMX";
        /* String[] arregloTokens = cadenaTokenizar.split("\n");
        System.out.println(arregloTokens[0]);
        System.out.println(arregloTokens[1]);
        System.out.println(arregloTokens[2]);
        System.out.println(arregloTokens[3]);
        System.out.println(arregloTokens[4]); */
        StringTokenizer token = new StringTokenizer(cadenaTokenizar, delim);
        
        while(token.hasMoreTokens()){
            System.out.println(token.nextToken());
        }
        
        ArrayList<Universitario> lista = tokenizarArchivo();
        imprimirLista(lista);
    }
    
    public static ArrayList<Universitario> tokenizarArchivo(){
        String cadenaLeida= "";
        ArrayList<Universitario> listaUniversitarios = new ArrayList<>();
        FileReader fr;
        try {
            fr = new FileReader("archivo.dat");
            BufferedReader archivoLectura = new BufferedReader(fr);
            cadenaLeida = archivoLectura.readLine();
            while(cadenaLeida != null){
                Universitario universitario = new Universitario();
                StringTokenizer st = new StringTokenizer(cadenaLeida, ",");
                /*while(st.hasMoreTokens()){
                    System.out.print(st.nextToken() + " ");
                }*/
                universitario.setName(st.nextToken());
                universitario.setEdad(Integer.parseInt(st.nextToken()));
                universitario.setEscuela(st.nextToken());
                universitario.setLocalidad(st.nextToken());
                cadenaLeida = archivoLectura.readLine();
                
                listaUniversitarios.add(universitario);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaUniversitarios;
    }
    public static void imprimirLista(ArrayList<Universitario> lista){
        for (Universitario universitario : lista) {
            System.out.println(universitario);
        }
    }
}
