/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.sw.selecciones.clases;

/**
 *
 * @author josue
 */
public class Opcion {
    
    /* Atributos */
    private String llave;
    private String valor;
    
    /* Constructor */
    public Opcion(String k, String v){
        this.llave = k;
        this.valor = v;
    }

    /* Getters y Setters */
    public String getLlave() {
        return llave;
    }

    public void setLlave(String llave) {
        this.llave = llave;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    /* Polimorfismo con toString */
    @Override
    public String toString() {
        return "Opcion{" + "llave=" + llave + ", valor=" + valor + '}';
    }

   


    
}
