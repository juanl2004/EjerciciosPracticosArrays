package arraysbidimensionales;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Creamos el Scanner para poder introducir valores por teclado.
		Scanner sc = new Scanner(System.in);

		// Creamos un arrays llamado tabla con 4 filas y 5 columnas.
		int[][] tabla = new int[4][5];

		// Declaramos la variable media donde almacenaremos el valor de la nota media de
		// cada alumno.
		double media = 0;
		// Declaramos la variable notaMin donde almacenamos el valor de la nota minima
		// de las introducidas por cada alumno.
		int notaMin = 0;
		// Declaramos la variable notaMax donde almacenamos el valor de la nota maxima
		// de las introducidos por cada alumno.
		int notaMax = 0;

		// Creamos estos for para recorrer las filas enteras y ir completandolas con los
		// valores introducidos por el usuario.
		// Con este for controlamos las filas
		for (int fila = 0; fila < 4; fila++) {

			// Con este las columnas
			for (int columna = 0; columna < 5; columna++) {
				// Con este for rrecorremos cada columna de una fila.
				System.out.println("Introduce la nota " + (columna + 1) + " del alumno " + (fila + 1) + " --> ");
				// Y la leemos y alamcenamos.
				tabla[fila][columna] = sc.nextInt();

			}
		}

		// Imprimimos el array.
		for (int[] fila : tabla) {
			for (int valor : fila) {
				System.out.print(valor + "\t");

			}
			System.out.println();
		}

		// Creamos estos for para recorrer las filas y columnas
		for (int fila = 0; fila < 4; fila++) {
			System.out.println();
			// Ordena la fila en la que se encuentre
			Arrays.sort(tabla[fila]);
			// Indicamos que la nota minima se encuentra en la posición 0 de la fila porque
			// previamente la hemos ordenado de menor a mayor.
			notaMin = tabla[fila][0];
			// Indicamos que la nota maxima se encuentra en la posición 4 de la fila porque
			// previamente la hemos ordenado de menor a mayor y sabemos que la mayor es la
			// nota maxima.
			notaMax = tabla[fila][4];
			// Imprimos los resultados.
			System.out.println("Alumno " + (fila + 1));
			System.out.println("Nota minima --> " + notaMin);
			System.out.println("Nota maxima --> " + notaMax);
			// En cada vuelta de fila volvemos a inicializar la media en 0 despues de
			// mostrar el resultado para que empieze de nuevo y no se incremente.
			media = 0;

			for (int columna = 0; columna < 5; columna++) {
				// En media vamos almacenando cada valor que se encuentre en la fila que nos
				// encontremos.
				media += tabla[fila][columna];

			}
			// Imprimos la nota media
			System.out.println("Nota media --> " + (media / 5));
		}

		// Cierre de Scanner
		sc.close();
	}

}
