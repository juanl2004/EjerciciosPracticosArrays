package arraysstrings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Esta clase ordena alfabéticamente las palabras de una frase introducida por
 * el usuario.
 */
public class Ejercicio04 {

	/**
	 * Método main que solicita al usuario una frase, la divide en palabras y las
	 * ordena alfabéticamente.
	 */
	public static void main(String[] args) {
		// Creo la variable frase para almacenar la frase introducida por el usuario.
		String frase;
		// Creamos esta variable para almacenar cada palabra es un espacio de un array.
		String[] palabra;

		// Creamos el Scanner para pedir por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca una frase.
		System.out.println("Introduce una frase --> ");
		frase = sc.nextLine();

		// Con el split devolvemos cada palabra es un espacio del array.
		palabra = frase.split(" ");

		// Con el array sort ordenamos las palabras de forma alfabética.
		Arrays.sort(palabra);

		System.out.print("Palabras ordenadas --> ");
		// Con este bucle for recorremos el array palabra y vamos mostrando cada espacio
		// en cada vuelta.
		for (String palabras : palabra) {
			System.out.print(palabras + " ");
		}

		// Cierre de Scanner
		sc.close();
	}

}
