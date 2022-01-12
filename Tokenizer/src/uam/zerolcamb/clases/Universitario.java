/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.zerolcamb.clases;

/**
 *
 * @author Zerol
 */
public class Universitario {
    /* Atributos */
    private String name;
    private int edad;
    private String escuela;
    private String localidad;

    /* Constructores */
    public Universitario(String name, int edad, String escuela, String localidad) {
        this.name = name;
        this.edad = edad;
        this.escuela = escuela;
        this.localidad = localidad;
    }

    public Universitario() {
    }

    /* Getters y Setters */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    /* Polimorfismo con toString */
    @Override
    public String toString() {
        return "Universitario{" + "name=" + name + ", edad=" + edad + ", escuela=" + escuela + ", localidad=" + localidad + '}';
    }
    
    
}
