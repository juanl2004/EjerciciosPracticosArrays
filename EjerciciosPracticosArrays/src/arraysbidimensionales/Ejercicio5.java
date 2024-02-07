package arraysbidimensionales;

import java.util.Random;

/**
 * Clase con varias funciones y nos muestra un array relleno de 20 números
 * aleatorios, la suma de cada fila y columna y el resultado total.
 */
public class Ejercicio5 {

	/**
	 * En la función principal llamamos a la función tablaAleatorios y almacenamos
	 * su resultado en resultado. También mostramos la matriz y calculamos la suma
	 * de las filas. Y por ultimo calculamos la suma de las columnas y el total de
	 * la suma de los 20 números.
	 */
	public static void main(String[] args) {

		int[][] resultado = Ejercicio5.tablaAletorios();

		// Creamos la variable sumaFilas para almacenar temporalmente la suma de los
		// elementos de cada fila.
		int sumaFilas = 0;

		// Creamos la variable sumaColumna para almacenar temporalmente la suma de los
		// elementos de cada columna.
		int sumaColumna = 0;

		// Creamos la variable total para almacenar la suma total de todos los elementos
		// del array.
		int total = 0;

		// Mostrar el array y calcular la suma de las filas.
		for (int[] fila : resultado) {
			sumaFilas = 0;

			for (int valor : fila) {
				System.out.print(valor + "\t");
				sumaFilas += valor;
			}
			System.out.println(sumaFilas);
		}

		// Calcular la suma de las columnas y el total del array.
		for (int j = 0; j < resultado[0].length; j++) {
			sumaColumna = 0;
			for (int i = 0; i < resultado.length; i++) {
				sumaColumna += resultado[i][j];
			}
			total += sumaColumna;
			System.out.print(sumaColumna + "\t");
		}
		System.out.println(total);

	}

	/**
	 * Esta función genera un array de 4 filas y 5 columnas con valores aleatorios
	 * entre 100 y 1000.
	 * 
	 * @return Array bidimensional con valores aleatorios.
	 */
	public static int[][] tablaAletorios() {

		// Creamos la clase Random.
		Random random = new Random();

		// Creamos el array de 4 filas y 5 columnas.
		int[][] aleatorio = new int[4][5];

		// Recorremos el array y lo rellenamos con números aleatorios.
		for (int i = 0; i < aleatorio.length; i++) {

			for (int j = 0; j < aleatorio.length + 1; j++) {
				aleatorio[i][j] = random.nextInt(100, 1000);
			}
		}

		// Devolvemos la tabla aleatorio.
		return aleatorio;

	}
}
