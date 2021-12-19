/*
 * Genere los datos para el arreglo
 * String[] promediosCualitativos = new String[7];

    Promedio Regular son todas las notas >=0 y <=5.9
    Promedio Bueno son todas las notas >=6 y <=8.9
    Promedio Sobresaliente son todas las notas >=9 y <=10
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Variables
        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};

        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan",
            "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning",
            "Juan Vasquez"};
        String[] promediosCualitativos = new String[7];

        double promedio;

        for (int i = 0; i < promedios.length; i++) {
            promedio = promedios[i];
            if (promedio >= 0 && promedio <= 5.9) {
                promediosCualitativos[i] = "Regular";
            } else {
                if (promedio >= 6 && promedio <= 8.9) {
                    promediosCualitativos[i] = "Bueno";
                } else {
                    if (promedio >= 6 && promedio <= 8.9) {
                        promediosCualitativos[i] = "Sobresaliente";
                    }
                }

            }

        }

        for (int i = 0; i < promedios.length; i++) {
            System.out.printf("%s promedio %.2f promedio cualitativo %s\n",
                    estudiantes[i],
                    promedios[i],
                    promediosCualitativos[i]);
        }

    }

}
