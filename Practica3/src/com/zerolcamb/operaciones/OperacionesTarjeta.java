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
/* Clase para realizar operaciones relacionadas con la clase Tarjeta */
public class OperacionesTarjeta {

    /* Este método imprime un objeto Tarjeta */
    public void imprimirTarjeta(Tarjeta t){
        System.out.println("Los datos de la tarjeta son: ");
        System.out.println(t);
    }

    /* Este método llena una tarjeta */
    public Tarjeta llenarTarjeta() {
        /* Instanciación de los objetos tarjeta y fecha */
        Tarjeta tarjeta;
        tarjeta = new Tarjeta();
        Fecha fecha;
        fecha = new Fecha();

        /* Llenado del objeto tarjeta utilizando setters */
        tarjeta.setNombre("NOMBRE CLIENTE");
        tarjeta.setCvc("234");
        /* Llenado del objeto fecha utilizando setters */
        fecha.setAnno(29);
        fecha.setMes(4);
        tarjeta.setVencimiento(fecha);
        tarjeta.setNumero("4464 4687 4687 4687");

        /* Este metodo retorna la tarjeta llenada */
        return tarjeta;
    }
}
