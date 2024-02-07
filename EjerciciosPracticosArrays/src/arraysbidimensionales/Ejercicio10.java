package arraysbidimensionales;

import java.util.Scanner;

/**
 * Clase con funciomes que nos devolvera un array girado 90º.
 */
public class Ejercicio10 {

	/**
	 * En esta función principal le pedimos al usuario que introduzca la longitud
	 * del array que vamos a crear y que lo vaya rellenando de 1 en 1 desde 1.
	 * LLamamos a la función gira90 y mostramos su resutaldo.
	 */
	public static void main(String[] args) {

		// Variable en la que se almacenara el valor introducido por el usuario.
		int longitud;
		// Variable en la que vamos almacenando el valor que se va incrementando en el
		// array.
		int valor = 1;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario la longitud.
		System.out.println("Introduce la longitud de tu array --> ");
		longitud = sc.nextInt();

		// Creamos el array con la longitud introducida por el usuario y completamos la
		// tabla de 1 en 1.
		int[][] tablaInicio = new int[longitud][longitud];

		for (int i = 0; i < tablaInicio.length; i++) {

			for (int j = 0; j < tablaInicio.length; j++) {
				tablaInicio[i][j] = valor++;
			}
		}

		// Llamamos a la función y almacenamos el resltado en la varible resultado.
		int[][] resultado1 = Ejercicio10.gira90(tablaInicio);

		// Imprimimos el resultado de forma bonita.
		for (int[] fila : resultado1) {
			for (int valor1 : fila) {
				System.out.print(valor1 + "\t");

			}
			System.out.println();
		}

		// Cierre de Scanner.
		sc.close();
	}

	/**
	 * Esta función toma el array creado en el main y lo rota 90º.
	 * 
	 * @param tablaInicio Array bidimensional de enteros.
	 * @return Array resultado rotada 90º.
	 */
	public static int[][] gira90(int tablaInicio[][]) {

		// Creamos un nuevo array con la misma longitud de la tabla anterior.
		int[][] resultado = new int[tablaInicio.length][tablaInicio.length];

		// Recorremos la tabla.
		for (int i = 0; i < tablaInicio.length; i++) {
			for (int j = 0; j < tablaInicio.length; j++) {

				// i se convierte en la nueva columna j en la matriz resultado y j se convierte
				// en la nueva fila n - 1 - i en la matriz resultado. La fórmula n - 1 - i
				// refleja verticalmente las filas del array principal
				resultado[j][tablaInicio.length - 1 - i] = tablaInicio[i][j];
			}
		}

		// Devolvemos la tabla con la rotación.
		return resultado;
	}
}
