/*
 * Elaborar un algoritmo en el cuál se ingrese una letra y se 
detecte si se trata de una vocal. Caso contrario mostrar un mensaje. 
Nota: investigar la función equals() de la clase String.
 */
package ejerciciosguia3;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author VICTOR
 */
public class EjercicioExtra3_Victor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String letra;
    Scanner leer = new Scanner(System.in);
    
    letra = leer.next();
            
    System.out.println("Ingrese una Letra " + letra);
    if (("A".equals(toUpperCase(letra)))||("E".equals(toUpperCase(letra)))||("I".equals(toUpperCase(letra)))||("O".equals(toUpperCase(letra)))||("U".equals(toUpperCase(letra)))  ) {
            System.out.println("Es una Vocal");
    }else{
        System.out.println("NO ES UNA Vocal");
    }
    }
    
}
