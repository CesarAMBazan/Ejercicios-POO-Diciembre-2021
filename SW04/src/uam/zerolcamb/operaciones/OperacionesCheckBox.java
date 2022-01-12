/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.zerolcamb.operaciones;

import java.util.ArrayList;
import javax.swing.JCheckBox;

/**
 *
 * @author Zerol
 */
public class OperacionesCheckBox {
    public ArrayList<String> obtenerCursosLenguajes(ArrayList<JCheckBox> lista){
        ArrayList<String> listaLenguajes = new ArrayList<>();
        for (JCheckBox checkBox : lista) {
            if(checkBox.isSelected()){
                listaLenguajes.add(checkBox.getText());
            }
        }
        System.out.println("Quieres " + listaLenguajes.size() + " cursos");
        for (String cursos : listaLenguajes) {
            System.out.println(cursos);
        }
        return listaLenguajes;
    }
}
