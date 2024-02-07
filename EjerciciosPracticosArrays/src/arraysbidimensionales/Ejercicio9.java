package arraysbidimensionales;

/**
 * Clase con funciones que nos muestra si el array introducido es mágico, es
 * decir, si la suma de los elementos de cualquier fila o de cualquier columna
 * valen lo mismo.
 */
public class Ejercicio9 {

	/**
	 * En esta función principal creamos el array tabla y lo rellenamos de valores.
	 * Llamamos a la función y imprimimos su resultado.
	 */
	public static void main(String[] args) {

		// Creamos el array y asignamos valores.
		int[][] tabla = new int[3][3];

		tabla[0][0] = 8;
		tabla[0][1] = 1;
		tabla[0][2] = 6;
		tabla[1][0] = 3;
		tabla[1][1] = 5;
		tabla[1][2] = 7;
		tabla[2][0] = 4;
		tabla[2][1] = 9;
		tabla[2][2] = 2;

		boolean resultado = Ejercicio9.esMagica(tabla);

		// Verificamos si la matriz es mágica y mostramos el resultado.
		System.out.println("¿Es una matriz mágica? --> " + resultado);
	}

	/**
	 * Esta función toma el array tabla y verifica si es un array mágico, es decir,
	 * si la suma de los elementos de cada fila, columna es la misma.
	 * 
	 * @param tabla Array bidimensional de enteros creado en el main.
	 * @return true si la matriz es mágica, false en caso contrario.
	 */
	public static boolean esMagica(int tabla[][]) {

		int sumaFila = 0;

		// Calculamos la suma de la primera fila. Y almacenamos ese resultado en
		// sumaFila.
		for (int j = 0; j < tabla.length; j++) {
			sumaFila += tabla[0][j];
		}

		// Verificamos la suma de las filas restantes.
		for (int i = 1; i < tabla.length; i++) {
			int sumaFilaActual = 0;
			for (int j = 0; j < tabla.length; j++) {
				sumaFilaActual += tabla[i][j];
			}
			// Si son distintas devolvemos false
			if (sumaFilaActual != sumaFila) {
				return false;
			}
		}

		// Verificamos la suma de las columnas.
		for (int j = 0; j < tabla.length; j++) {
			int sumaColumna = 0;
			for (int i = 0; i < tabla.length; i++) {
				sumaColumna += tabla[i][j];
			}
			// Si son distintas devolvemos false
			if (sumaColumna != sumaFila) {
				return false;
			}
		}

		// Si no se da ningun caso devulve true.
		return true;

	}
}
