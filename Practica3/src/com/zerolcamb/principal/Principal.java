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
        OperacionesTarjeta operaciones = new OperacionesTarjeta();
        Tarjeta nuevaTarjeta;
        nuevaTarjeta = operaciones.llenarTarjeta();
        operaciones.imprimirTarjeta(nuevaTarjeta);
    }
    
    
    
}
