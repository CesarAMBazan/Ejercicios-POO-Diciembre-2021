/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zerolcamb.clases;

/**
 *
 * @author Zerol
 */
public class Tarjeta {
    private String nombre;
    private String cvc;
    private Fecha vencimiento;
    private String numero;

    public Tarjeta(String nombre, String cvc, Fecha vencimiento, String numero) {
        this.nombre = nombre;
        this.cvc = cvc;
        this.vencimiento = vencimiento;
        this.numero = numero;
    }

    public Tarjeta() {
    }
    
    /* Getters y Setters */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public Fecha getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Fecha vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "nombre=" + nombre + ", cvc=" + cvc + ", vencimiento=" + vencimiento + ", numero=" + numero + '}';
    }
    
    
}
