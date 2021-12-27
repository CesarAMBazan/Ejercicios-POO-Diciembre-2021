/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zerolcamb.clases;

/**
 *
 * @author Zerol
 */
/* Clase fecha para guardar fechas de una tarjeta */
public class Fecha {
    /* Atributos de la clase */
    private int mes;
    private int anno;

    /* Constructores */
    public Fecha(int mes, int anno) {
        this.mes = mes;
        this.anno = anno;
    }

    public Fecha() {
      
    }
    /* Encapsulamiento */
    /* Getters y setter */

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    /* Polimorfismo */
    @Override
    public String toString() {
        return mes + "/" + anno;
    }
    
    
}
