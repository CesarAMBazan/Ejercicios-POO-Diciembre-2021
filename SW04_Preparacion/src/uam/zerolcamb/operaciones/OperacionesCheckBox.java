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
    /* Este metodo obtiene los checkboxes seleccionados los cuales estan agrupados
       dentro de una lista
    */
    public LinkedList<String>obtenerCursosLenguajes(LinkedList<JCheckBox> lista){
        LinkedList<String> listaLenguajes = new LinkedList<>();
        /* Se recorre la lista con un for-each */
        for (JCheckBox listaCBLenguaje : lista) {
            /* Si el checkbox actual esta seleccionado */
            if(listaCBLenguaje.isSelected()){
                /* Se añade a una lista de Strings*/
                listaLenguajes.add(listaCBLenguaje.getText());
            }
        }
        /* Se imprime la lista obtenida si es necesario */
        System.out.println("Quieres " + listaLenguajes.size() + " cursos");
        for (String listaLenguaje : listaLenguajes) {
            System.out.println(listaLenguaje);
        } 
        /* Se regresa la lista de strings a partir de los checkboxes seleccionados */
        return listaLenguajes;
    }
}
