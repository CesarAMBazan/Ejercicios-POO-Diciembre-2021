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
public class Alumno implements Serializable{
    private String boleta;
    private String nombre;
    private String contraseña;

    public Alumno(String boleta, String nombre, String contraseña) {
        this.boleta = boleta;
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public Alumno() {
    }

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

    @Override
    public String toString() {
        return "Alumno{" + "boleta=" + boleta + ", nombre=" + nombre + ", contrase\u00f1a=" + contraseña + '}';
    }
    
    
}
