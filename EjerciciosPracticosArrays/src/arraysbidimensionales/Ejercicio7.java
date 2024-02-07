package arraysbidimensionales;

/**
 * Clase con varias funciones para transformar un array en otro con los mismos
 * valores pero cambiados de forma.
 */
public class Ejercicio7 {

	/**
	 * En la función principal creamos un arrays llamado tabla de 4x4 y lo
	 * rellenamos con valores de 1 en 1. Tambien llamamos a la función ordenarT y
	 * imprimimos el resultado que nos devuleve esa función.
	 */
	public static void main(String[] args) {

		// Creamos un array bidimensional de 4 filas y 4 columnas
		int[][] tabla = new int[4][4];

		// Variable en la que se genera el valor con la qu eincrementar el array
		int valor = 1;

		// Recorremos el array para rellenarlo.
		for (int i = 0; i < tabla.length; i++) {

			for (int j = 0; j < tabla.length; j++) {
				tabla[i][j] = valor++;
			}
		}

		// En la variable resultado se guarda el resultado que devuelve la función.
		int[][] resultado = Ejercicio7.ordenarT(tabla);

		// Imprimimos el resultado.
		for (int[] fila : resultado) {
			for (int valor1 : fila) {
				System.out.print(valor1 + "\t");

			}
			System.out.println();
		}

	}

	/**
	 * Esta función toma un array tabla y devuelve otro array bidimensional que
	 * contiene los elementos de la tabla original intercambiados entre filas y
	 * columnas.
	 * 
	 * @param tabla Array bidimensional de enteros.
	 * @return Array bidimensional con filas y columnas intercambiadas.
	 */
	public static int[][] ordenarT(int[][] tabla) {

		int[][] tablaOrd = new int[4][4];

		// Recorrer el array original y cambiar filas por columnas.
		for (int i = 0; i < tabla.length; i++) {

			for (int j = 0; j < tabla.length; j++) {
				tablaOrd[i][j] = tabla[j][i];
			}
		}

		// Devolvemos el nuevo array.
		return tablaOrd;

	}

}
