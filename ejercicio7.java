package ejerciciosguia3;

import java.util.Scanner;

/*
Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals()
 */
/**
 *
 * @author Usuario
 */
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String palabra="";
        int longitud = 0, correctas = 0, incorrectas = 0;

        while (!palabra.equals("&&&&&")) {
            System.out.println("Ingrese una cadena");
            palabra = leer.nextLine();
            longitud = palabra.length();
            
            if ((longitud <= 5) && (longitud >= 2) && (palabra.substring(0, 1).equals("X")) && (palabra.substring(longitud - 1, longitud).equals("O"))) {
                    correctas++;
            } else {
                incorrectas++;
            }

        }
        System.out.println("Cantidad de cadenas correctas = " + correctas);
        System.out.println("Cantidad de cadenas incorrectas = " + (incorrectas-1));
        System.out.println("Cantidad TOTAL de cadenas = " + (correctas+incorrectas-1));
    }

}
