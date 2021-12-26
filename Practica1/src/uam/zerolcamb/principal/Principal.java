
package uam.zerolcamb.principal;

import java.util.Scanner;



/**
 *
 * @author Zerol
 */
public class Principal {
    public static void main(String[] args) {
       
        /* Declaración del Scanner de entrada */
        Scanner entrada = new Scanner(System.in);
        
        /* Datos primivitos comunmente utilizados */
        int datoEntero = 5;
        float datoFlotante = 17.89F;
        double datoDoble = 17.546;
        boolean datoBooleano = true;
        char datoCaracter = 'a';
        
        /*¨Imprimiento datos */
        System.out.println("El entero es: " + datoEntero);
        System.out.println("El flotante es: " + datoFlotante);
        System.out.println("El doble es: " + datoDoble);
        System.out.println("El booleano es: " + datoBooleano);
        System.out.println("El caracter es: " + datoCaracter);
        
        /* Leer datos de entrada */
        System.out.println("Dame un entero: ");
        datoEntero = entrada.nextInt();
        
        System.out.println("Leiste el " + datoEntero);
        
        // manejoCadenas();
        operacionesCadenas();
    }
    
    public static void manejoCadenas(){
        
        /* Declaracion de cadenas */
        String cadena = "";
        String cadenaCaracteres = new String();
        String cadenaValor = new String("Cadena con valor inicial");
        char leerCaracter;
        
        /* Impresion de cadenas */
        System.out.println("Cadena: " + cadena);
        System.out.println("Cadena: " + cadenaCaracteres);
        System.out.println("Cadena: " + cadenaValor);
        
        Scanner entrada = new Scanner(System.in);
        // Leer cadena next
        System.out.println("Dame una cadena sin espacios: ");
        cadena = entrada.next();
        // Leer cadena next line
        System.out.println("Dame una cadena con espacios: ");
        // Limpieza de buffer de entrada
        entrada.nextLine();
        cadenaCaracteres = entrada.nextLine();
        // Leer caracter de entrada
        System.out.println("Dame un caracter: ");
        leerCaracter = entrada.next().charAt(0);
       
       
        System.out.println("Cadena: " + cadena);
        System.out.println("Cadena: " + cadenaCaracteres);
        System.out.println("Cadena: " + cadenaValor);
        System.out.println("Caracter: " + leerCaracter);
    }
    
    public static void operacionesCadenas(){
        String cadena;
        
        int comparacion;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa una cadena");
        cadena = entrada.nextLine();
        
        System.out.println("La longitud es: " + cadena.length());
        
        comparacion = cadena.compareTo("Zebra");
        
        System.out.println("Comparacion " + comparacion);
        // primera opcion para concatentar
        cadena = cadena + " " + cadena + " NUEVA ";
        // Segunda opcion
        cadena = cadena.concat(" " + cadena);
        
        System.out.println("Concatenada: " + cadena);
        
        
    }
}
