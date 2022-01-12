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
    public ArrayList<String> llenarLista(){
        ArrayList<String> lista = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            String opcion = "Opcion a Elegir " + (i+1);
            lista.add(opcion);
        }
        return lista;
    }
}
