/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.zerolcamb.operaciones;

import java.util.ArrayList;

/**
 *
 * @author Zerol
 */
public class LlenadoListas {
    /* Este metodo llena la lista sencilla */
    public ArrayList<String>llenarListaSencilla(){
        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            /* La longitud de la lista sencilla/base sera de 10 */
            String opcion = "BASE " + (i+1);
            lista.add(opcion);
        }
        /* Añadiremos una opción al principio con indice 0
           En caso de usar LinkedList, el método será
           lista.addFirst("SELECCIONA")
        */
        lista.add(0, "----SELECCIONA----");
        return lista;
    }
    
    public ArrayList<String>llenarListaDependiente(int indice){
        /* A partir del indice seleccionado de la lista base se crearan
           opciones para la lista dependiente
        */
        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String opcion = indice + " DEP " + (i+1);
            lista.add(opcion);
        }
        return lista;
    }
}
