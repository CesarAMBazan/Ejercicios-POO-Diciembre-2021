/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.zerolcamb.modelo;

/**
 *
 * @author Zerol
 */
public class DatosPersona {
    /* Atributos */
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String rfc;
    private String direccion;

    /* Constructor */
    public DatosPersona(String nombre, String primerApellido, String segundoApellido, String rfc, String direccion) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.rfc = rfc.toUpperCase();
        this.direccion = direccion;
    }
    
    /* Getters y Setters */

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

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return nombre + " " + primerApellido + " " + segundoApellido + " "
                + rfc + " " + direccion;
    }
    
    
    
}
