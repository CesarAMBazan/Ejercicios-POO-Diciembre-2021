/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.zerolcamb.clases;

import java.io.Serializable;

/**
 *
 * @author Zerol
 */

/* La clase Alumno implementa serializable porque los objetos de esta clase
   se guardaran en un archivo 
*/
public class Alumno implements Serializable{
    /* Atributos */
    private String boleta;
    private String nombre;
    private String contraseña;

    /* Constructores */
    /* Sobrecarga de metodo */
    public Alumno(String boleta, String nombre, String contraseña) {
        this.boleta = boleta;
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public Alumno() {
    }

    /* Getters y setters */
    public String getBoleta() {
        return boleta;
    }

    public void setBoleta(String boleta) {
        this.boleta = boleta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /* Polimorfismo con toString */
    @Override
    public String toString() {
        return "Alumno{" + "boleta=" + boleta + ", nombre=" + nombre + ", contrase\u00f1a=" + contraseña + '}';
    }
    
    
}
