package uam.zerolcamb.principal;

import java.util.Scanner;

/**
 *
 * @author Zerol
 */
public class Principal {
    public static void main(String[] args) {
        /* Descomentar los metodos que quiera utilizar */
        // arregloFijos();
        // arregloDefecto();
        // llenandoArreglo();
        arregloBidimensional();
    }
    
    public static void arregloFijos(){
        /* Aqui se trabajan con arreglos con un tamaño fijo */
        int[] arreglo = new int[10];

        /* for para ingresar los datos al arreglo */
        for(int i = 0; i<10; i++){
            arreglo[i] = i+1;
        }
        /* for para imprimir los datos del arreglo */
        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + " ");
        }
        
        System.out.println("");

        /* foreach para imprimir los datos del arreglo */
        for(int i : arreglo){
            System.out.print(i + " ");
        }
    }
    public static void arregloDefecto(){
        /* Aquí se trabajarán los arreglos que ya tienen los valores por defecto */
        String[] arreglo = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes",
                             "Sabado", "Domingo"};
        System.out.println("La longitud del arreglo es: " + arreglo.length);
        System.out.println("El cuarto elemento del arreglo es: " + arreglo[3]);
        /* Impresion de los datos del arreglo usando un foreach */
        for (String string : arreglo) {
            System.out.println(string);
        }
    }
    
    public static void llenandoArreglo(){
        /* Llenando un arreglo unidimensional */
        int[] datos;
        int nDatos;
        int totalPares = 0;
        int totalNones = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dame cuantos datos quiere: ");
        nDatos = entrada.nextInt();
        
        datos = new int[nDatos];

        /* Llenando los datos a partir de la entrada del usuario */
        for(int i = 0; i < nDatos; i++){
            System.out.print("Dato:");
            datos[i] = entrada.nextInt();
        }

        /* determinar si son pares o nones */
        for (int dato : datos) {
            /* Utilizando la operación modulo, si existe no hay residuo al dividir entre dos significa que es par */
            if(dato % 2 == 0 ){
                totalPares += 1;
            } else {
                /* De otra manera seria impar */
                totalNones += 1;
            }
        }
        
        System.out.println("Pares: " + totalPares);
        System.out.println("Nones: " + totalNones);
    }
    
    public static void arregloBidimensional(){
        /* Trabajando con un arreglo bidimensional */
        int[][] matriz;
        int nColumnas;
        int nFilas;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Filas: ");
        nFilas = entrada.nextInt();
        
        System.out.println("Columnas");
        nColumnas = entrada.nextInt();

        /* Se construye la matriz a partir de la entrada del usuario */
        matriz = new int[nFilas][nColumnas];

        /* Para recorrer un arreglo bidimensional se utilizan dos for */
        for(int i = 0; i < nFilas ; i++){
            for(int j = 0 ; j < nColumnas; j++){
                System.out.println("M["+i+"]["+j+"]:");
                matriz[i][j] = entrada.nextInt();
            }
        }

        /* Se vuelven a utilizar dos for para imprimir el arreglo */
        for(int i = 0 ; i < nFilas ; i++){
            for(int j = 0; j < nColumnas; j++){
                System.out.println("M[" + i + "][" + j + "] = " + matriz[i][j]);
            }
        }
    }
}
