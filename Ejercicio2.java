/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
import java.util.Scanner;
/**
 *
 * @author Eloy
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese una frase");
         String frase = leer.next();
         if (frase.equals("eureka")) {
           System.out.println("La frase es correcta");
         } else {
         System.out.println("La frase es incorrecta");
               
        }
    }
    
}
