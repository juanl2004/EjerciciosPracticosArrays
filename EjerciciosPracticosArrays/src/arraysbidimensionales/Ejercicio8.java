package arraysbidimensionales;

/**
 * Clase con funciones que nos muestra si la matriz es simetrica o no.
 */
public class Ejercicio8 {

	/**
	 * En esta función principal creamos un array de 3 filas y 3 columans y
	 * introducimos los valores. Tambien llamamos a la función y imprimos el
	 * resultado.
	 */
	public static void main(String[] args) {

		// Creación del array
		int filas = 3;
		int columnas = 3;
		int[][] tabla = new int[filas][columnas];

		tabla[0][0] = 1;
		tabla[0][1] = 2;
		tabla[0][2] = 3;
		tabla[1][0] = 2;
		tabla[1][1] = 4;
		tabla[1][2] = 5;
		tabla[2][0] = 3;
		tabla[2][1] = 5;
		tabla[2][2] = 6;

		// Llamada a la función de tipo boolean porque el resultado que nos da la
		// función es este caso es true o false.
		boolean resultado = Ejercicio8.MatrizSimetrica(tabla, filas, columnas);

		// Verificamos si el array es simétrico y imprimimos lo que corresponda.
		if (resultado == true) {
			System.out.println("La matriz es simétrica");

		} else {
			System.out.println("La matriz no es simétrica");
		}

	}

	/**
	 * Esta función recorre el array y verifica si es simetrico respecto a su
	 * diagonal principal.
	 * 
	 * @param tabla    Array bidimensional de enteros.
	 * @param filas    Número de filas en el array.
	 * @param columnas Número de columnas en el array.
	 * @return true si la matriz es simétrica, false en caso contrario.
	 */
	public static boolean MatrizSimetrica(int[][] tabla, int filas, int columnas) {

		// Recorrer el array y verificar la simetría respecto a la diagonal principal
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				if (tabla[i][j] != tabla[j][i]) {
					return false;
				}
			}
		}

		return true;

	}
}
