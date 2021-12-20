/*
Modifique el ciclo repetitivo para que salga del mismo, 
cuando el usuario ingrese por teclado una letra que coincida 
con alguna de las primeras letras de los nombres del arreglo estudiantes. 
Debe usar un ciclo repetitivo para recorrer el arreglo estudiantes.
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Antes de analizar el presente ejercicio,
        usted debe revisar y entender lo desarrollado
        en el archivo Ayuda01.java del paquete2
         */
        Scanner entrada = new Scanner(System.in);

        String[] estudiantes = {"Kimberly", "Hogan",
            "Teresa", "Luis", "Mark", "Jennifer",
            "Alcides"};
        String inicial;

        boolean bandera = true;

        while (bandera) {
            System.out.println("Ingrese una letra");
            inicial = entrada.nextLine();

            for (int i = 0; i < estudiantes.length; i++) {

                char inicialLetra = estudiantes[i].charAt(0);
                String inicialLetras = String.valueOf(inicialLetra);
                
                if (inicial.equals(inicialLetras)){
                    bandera = false;
                }
                
            }

        }

    }

}
