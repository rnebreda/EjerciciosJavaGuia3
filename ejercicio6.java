/*
Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.
1 - Sumar
2 - Restar
3 - Multiplicar
4 - Dividir
5 - Salir
Elija opción:
 */
package ejerciciosguia3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        boolean salida = false;

        do {
            System.out.println("Ingrese 2 números enteros positivos");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
        } while (num1 < 0 || num2 < 0);

        do {
            String salir = "";
            System.out.println("******************");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Salir");
            System.out.println("Elija opción:");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    int suma = num1 + num2;
                    System.out.println("La suma es " + suma);
                    break;
                case 2:
                    int resta = num1 - num2;
                    System.out.println("La resta es " + resta);
                    break;
                case 3:
                    int mult = num1 * num2;
                    System.out.println("La multiplicación es " + mult);
                    break;
                case 4:
                    double div = num1 / num2;
                    System.out.println("La división es " + div);
                    break;
                case 5:
                    System.out.println("Desea salir del programa? S=si");
                    salir = leer.next();
                    if ("s".equalsIgnoreCase(salir)) {
                        salida = true;
                    } else {
                        do {
                            System.out.println("Ingrese 2 números enteros positivos");
                            num1 = leer.nextInt();
                            num2 = leer.nextInt();
                        } while (num1 < 0 || num2 < 0);
                    }
                    break;
                default:
                    System.out.println("La opcion no es correcta");
                    break;
            }

        } while (!salida);
        System.out.println("Programa finalizado");
    }

}
