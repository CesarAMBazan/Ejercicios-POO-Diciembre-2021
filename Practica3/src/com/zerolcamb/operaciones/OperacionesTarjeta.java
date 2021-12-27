/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zerolcamb.operaciones;

import com.zerolcamb.clases.Fecha;
import com.zerolcamb.clases.Tarjeta;

/**
 *
 * @author Zerol
 */
public class OperacionesTarjeta {
    
    public void imprimirTarjeta(Tarjeta t){
        System.out.println("Los datos de la tarjeta son: ");
        System.out.println(t);
    }
    
    public Tarjeta llenarTarjeta() {
        Tarjeta tarjeta;
        tarjeta = new Tarjeta();
        Fecha fecha;
        fecha = new Fecha();

        tarjeta.setNombre("NOMBRE CLIENTE");
        tarjeta.setCvc("234");
        fecha.setAnno(29);
        fecha.setMes(4);
        tarjeta.setVencimiento(fecha);
        tarjeta.setNumero("4464 4687 4687 4687");

        return tarjeta;
    }
}
