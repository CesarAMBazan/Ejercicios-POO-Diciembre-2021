package uam.zerolcamb.principal;

import java.util.Scanner;

/**
 *
 * @author Zerol
 */
public class Principal {
    public static void main(String[] args) {
        // arregloFijos();
        // arregloDefecto();
        // llenandoArreglo();
        arregloBidimensional();
    }
    
    public static void arregloFijos(){
        int[] arreglo = new int[10];
        
        for(int i = 0; i<10; i++){
            arreglo[i] = i+1;
        }
        
        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + " ");
        }
        
        System.out.println("");
        
        for(int i : arreglo){
            System.out.print(i + " ");
        }
    }
    public static void arregloDefecto(){
        String[] arreglo = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes",
                             "Sabado", "Domingo"};
        System.out.println("La longitud del arreglo es: " + arreglo.length);
        System.out.println("El cuarto elemento del arreglo es: " + arreglo[3]);
        for (String string : arreglo) {
            System.out.println(string);
        }
    }
    
    public static void llenandoArreglo(){
        int[] datos;
        int nDatos;
        int totalPares = 0;
        int totalNones = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dame cuantos datos quiere: ");
        nDatos = entrada.nextInt();
        
        datos = new int[nDatos];
        
        for(int i = 0; i < nDatos; i++){
            System.out.print("Dato:");
            datos[i] = entrada.nextInt();
        }
        
        for (int dato : datos) {
            if(dato % 2 == 0 ){
                totalPares += 1;
            } else {
                totalNones += 1;
            }
        }
        
        System.out.println("Pares: " + totalPares);
        System.out.println("Nones: " + totalNones);
    }
    
    public static void arregloBidimensional(){
        int[][] matriz;
        int nColumnas;
        int nFilas;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Filas: ");
        nFilas = entrada.nextInt();
        
        System.out.println("Columnas");
        nColumnas = entrada.nextInt();
        
        matriz = new int[nFilas][nColumnas];
        
        for(int i = 0; i < nFilas ; i++){
            for(int j = 0 ; j < nColumnas; j++){
                System.out.println("M["+i+"]["+j+"]:");
                matriz[i][j] = entrada.nextInt();
            }
        }
        for(int i = 0 ; i < nFilas ; i++){
            for(int j = 0; j < nColumnas; j++){
                System.out.println("M[" + i + "][" + j + "] = " + matriz[i][j]);
            }
        }
    }
}
