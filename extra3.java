/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String.
 */
package ejerciciosguia3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra = leer.nextLine();
        letra=letra.toUpperCase();
        
        switch (letra){
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
              System.out.println("La letra ingresada es Vocal");
              break;
            default:
              System.out.println("La letra ingresada No es Vocal"); 
        }
    }
    
}
