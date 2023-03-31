/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.

 */
package ejerciciosguia3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número de minutos");
        int num = leer.nextInt();
            //1 hora = 60 min
            //24 horas = 24 * 60 = 1440 min
            
            int dias = num / 1440;
            int horas = (num % 1440)/60;
            int minutos = (num % 1440) % 60;
                    
        System.out.println(num + " minutos equivalen a " + dias + " dias " + horas + " horas " + minutos + " minutos.");
        

    }
    
}
