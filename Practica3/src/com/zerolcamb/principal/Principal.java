/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zerolcamb.principal;

import com.zerolcamb.clases.Tarjeta;
import com.zerolcamb.operaciones.OperacionesTarjeta;

/**
 *
 * @author Zerol
 */
public class Principal {
    public static void main(String[] args) {
        /* Construccion de objeto operaciones para realizar operaciones de la clase OperacionesTarjeta */
        OperacionesTarjeta operaciones = new OperacionesTarjeta();
        /* Objeto tarjeta */
        Tarjeta nuevaTarjeta;
        /* Este objeto tarjeta es obtenido a partir del método llenarTarjeta() */
        nuevaTarjeta = operaciones.llenarTarjeta();
        /* Se imprime la tarjeta */
        operaciones.imprimirTarjeta(nuevaTarjeta);
    }
    
    
    
}
