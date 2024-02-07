package arraysbidimensionales;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Creamos un array llamado tabla con una longitud de 3 filas y 3 columnas.
		int[][] tabla = new int[3][3];

		// Llamaos a la función para que nos muestre le valor que devuelve dicha
		// función.
		int[][] resultado = Ejercicio3.numerosMultiplicados(tabla);

		// Imprimimos el resultado obtenido por la función de forma bonita.
		for (int[] fila : resultado) {
			for (int valor1 : fila) {
				System.out.print(valor1 + "\t");

			}
			System.out.println();
		}
	}

	// Creamos la función que nos devolvera la tabla rellena con los valores que se
	// den tras aplicar la instrucción. La función recibe la tabla creada en el
	// main.
	public static int[][] numerosMultiplicados(int tabla[][]) {

		//Con este for recorremos la tabla y la vamos rellenando con los valores tras ejecutar dicha función.
		for (int i = 0; i < tabla.length; i++) {

			for (int j = 0; j < tabla.length; j++) {
				tabla[i][j] = 10 * (i + j);
			}
		}

		//Devolvemos la tabla ya rellenada.
		return tabla;

	}
}
