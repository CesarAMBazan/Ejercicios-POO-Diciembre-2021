/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.zerolcamb.clases;

/**
 *
 * @author Zerol
 */
public class Alumno implements Comparable<Alumno>{
    private String boleta;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String licenciatura;

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

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getLicenciatura() {
        return licenciatura;
    }

    public void setLicenciatura(String licenciatura) {
        this.licenciatura = licenciatura;
    }

    @Override
    public String toString() {
        return "Alumno{" + "boleta=" + boleta + ", nombre=" + nombre +
                ", primerApellido=" + primerApellido + 
                ", segundoApellido=" + segundoApellido + 
                ", licenciatura=" + licenciatura + '}';
    }

    @Override
    public int compareTo(Alumno o) {
        return this.getBoleta().compareTo(o.getBoleta());
    }
    
    
    
}
