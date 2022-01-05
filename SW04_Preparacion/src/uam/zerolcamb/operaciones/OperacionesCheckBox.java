/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.zerolcamb.operaciones;

import java.util.LinkedList;
import javax.swing.JCheckBox;

/**
 *
 * @author Zerol
 */
public class OperacionesCheckBox {
    public LinkedList<String>obtenerCursosLenguajes(LinkedList<JCheckBox> lista){
        LinkedList<String> listaLenguajes = new LinkedList<>();
        for (JCheckBox listaCBLenguaje : lista) {
            if(listaCBLenguaje.isSelected()){
                listaLenguajes.add(listaCBLenguaje.getText());
            }
        }
        
        System.out.println("Quieres " + listaLenguajes.size() + " cursos");
        for (String listaLenguaje : listaLenguajes) {
            System.out.println(listaLenguaje);
        }
        return listaLenguajes;
    }
}
