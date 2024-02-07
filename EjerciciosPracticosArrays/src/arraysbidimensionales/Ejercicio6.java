package arraysbidimensionales;

import java.util.Arrays;
import java.util.Random;

/**
 * Clase con funciones que nos devolvera un arrays mostrandonos el mínimo y el
 * máximo de un arrays mucho mayor.
 */
public class Ejercicio6 {

	/**
	 * En el metodo main crearemos un array llamado tabla de 6 filas y 10 columnas
	 * que lo rellenaremos con numeros aleatorios entre 1 y 1000. Tambien llaremos a
	 * la función, crearemos otro array de 1 dimensión para mostras el mínimo y el
	 * máximo del array tabla y lo imprimiremos todo.
	 */
	public static void main(String[] args) {

		int[][] tabla = new int[6][10];

		Random rand = new Random();

		for (int i = 0; i < tabla.length; i++) {

			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = rand.nextInt(1000);
			}
		}

		int[] resultado = Ejercicio6.tablas2D(tabla);

		for (int[] fila : tabla) {
			for (int valor1 : fila) {
				System.out.print(valor1 + "\t");

			}
			System.out.println();
		}
		System.out.println();

		System.out.print("Los valores máximos y mínimos del array de arriba son --> ");
		System.out.println(Arrays.toString(resultado));
	}

	/**
	 * Este método toma un array bidimensional y devuelve otro array de una
	 * dimensión que contiene el valor mínimo y máximo del array tabla.
	 * 
	 * @param tabla Array bidimensional de enteros aleatorios.
	 * @return Array de una dimensión que contiene el valor mínimo y máximo de la
	 *         tabla original.
	 */
	public static int[] tablas2D(int[][] tabla) {

		// Inicializamos mayor a 0 para encontrar el máximo.
		int mayor = 0;
		// Inicializamos mayor a 1000 para encontrar el mínimo.
		int menor = 1000;

		int[] tabla2 = new int[2];

		// Recooremos la tabla para encontrar el máximo y el mínimo.
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {

				// Vamos actualizando el máximo si se encuentra un valor mayor.
				if (tabla[i][j] > mayor) {
					mayor = tabla[i][j];
				}

				// Vamos actualizando el mínimo si se encuentra un valor menor.
				if (tabla[i][j] < menor) {
					menor = tabla[i][j];
				}
			}
		}

		// Almacenamos el mínimo y el máximo en el array tabla2.
		tabla2[0] = menor;
		tabla2[1] = mayor;

		// Devolvemos la tabla2 con el máximo y mínimo.
		return tabla2;

	}
}
