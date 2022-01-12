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
    /* Este metodo regresa una lista de String sencilla */
    public ArrayList<String> llenarLista(){
        ArrayList<String> lista = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            /* La lista tendra una longitud de 10 */
            String opcion = "Opcion a Elegir " + (i+1);
            lista.add(opcion);
        }
        /* Se regresa la lista */
        return lista;
    }
}
