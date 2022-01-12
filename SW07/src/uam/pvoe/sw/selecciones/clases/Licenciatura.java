/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.sw.selecciones.clases;

/**
 *
 * @author ZerolCamb
 */
public class Licenciatura {
    
    /* Atributos */
    private String clave;
    private String nombre;

    /* Getters y Setters */
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    /* Polimorfismo con toString */
    @Override
   public String toString(){
       String mensaje = "";
       mensaje = nombre;
       return mensaje;
   } 
    
}
