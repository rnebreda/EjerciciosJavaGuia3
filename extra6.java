/*
Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
 */
package ejerciciosguia3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas");
        int num = leer.nextInt();
        int i = 0, j = 0;
        double altura = 0, suma = 0, sumaMenores = 0;

        do {
            System.out.println("Ingrese la altura de la persona");
            altura = leer.nextDouble();
            if (altura < 1.60) {
                sumaMenores += altura;
                j++;
            }
            suma += altura;
            i++;

        } while (i < num);

        System.out.println("La altura promedio de los menores de 1,60 es= " + (sumaMenores / j));
        System.out.println("La altura promedio de todas las personas es= " + (suma / i));

    }

}
