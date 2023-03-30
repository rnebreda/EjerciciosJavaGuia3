/*
 * Crear un programa que dado un número determine si es par o impar.
 */
package ejerciciosguia3;

import java.util.Scanner;



/**
 *
 * @author Usuario
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = leer.nextInt();

        if (num % 2 == 0) {
            System.out.println("El número " + num + " es par");
        } else {
            System.out.println("El número " + num + " es impar");
        }

    }

}
