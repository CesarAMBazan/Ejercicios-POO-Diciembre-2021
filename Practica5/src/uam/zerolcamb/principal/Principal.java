/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.zerolcamb.principal;

/**
 *
 * @author Zerol
 */
public class Principal {
    public static void main(String[] args) {
        String cadena = "Hola";
        int datoConvertido = 0;
        /* Se intentara realizar la conversion */
        try{
            /*
            datoConvertido = Integer.parseInt(cadena);
            System.out.println("El numero es " + (datoConvertido * 5 ));*/
            convertir("10");
            convertir("200");
            convertir("Hola");
            
        }
        /* Si se captura una excepción del tipo NumberFormatException */
        catch(NumberFormatException e){
            /* Se notifica que lo ingresado no fue un numero */
            System.out.println("Lo ingresado no fue un numero");
        }
        
        System.out.println("Gracias por usar este progama");
        
    }
    
    /* Los metodos tambien pueden tirar excepciones */
    public static void convertir(String cadena) throws NumberFormatException{
        int datoConvertido;
        datoConvertido = Integer.parseInt(cadena);
        System.out.println("Convertido " + (datoConvertido * 10));
    }
}
