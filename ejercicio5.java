/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
 */
package ejerciciosguia3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número límite");
        int limite = leer.nextInt();
        int suma=0;

        do {
            System.out.println("Ingrese un número para sumar");
            suma+= leer.nextInt();
        } while (suma<limite);
            System.out.println("El total de la suma es: " + suma);    
    }
    
}
