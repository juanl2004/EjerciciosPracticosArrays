package arraysstrings;

import java.util.Scanner;

public class Ejercicio07 {

	/**
	 * Este método principal solicita al usuario una frase y una palabra, y luego
	 * llama a la función para buscar cuántas veces aparece la palabra en la frase.
	 */
	public static void main(String[] args) {

		// Creamos esta variable para almacenar la frase introducida por el usuario.
		String frase;
		// Creamos esta variable para alamacenar la palabra que debemos buscar en la
		// frase.
		String palabra;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("¿Cuantas veces aparece la palabra en la frase?");

		// Le pedimos al usuario que introduzca una frase por teclado.
		System.out.println("Introduce una frase --> ");
		frase = sc.nextLine();

		// Le pedimos al usuario que introduzca una palabra
		System.out.println("Introduce la palabra que deseeas buscar --> ");
		palabra = sc.nextLine();

		// Mostramos el resultado llamando a la función busquedaPalabra.
		System.out.println("La palabra aparece --> " + Ejercicio07.busquedaPalabra(frase, palabra));

		sc.close();
	}

	/**
	 * Este método busca cuántas veces aparece una palabra dada en una frase.
	 * 
	 * @param frase   La frase en la que se buscará la palabra.
	 * @param palabra La palabra que se desea buscar en la frase.
	 * @return El número de veces que aparece la palabra en la frase.
	 */
	public static int busquedaPalabra(String frase, String palabra) {
		// Contador para contabilizar el número de veces que aparece la palabra en la
		// frase
		int contador = 0;

		// Separar la frase por palabras en una tabla.
		String[] palabras = frase.split(" ");

		// Recorrer la tabla para contabilizar cuantas veces aparece.
		for (String veces : palabras) {
			// Comprobamos palabra por palabra con la palabra introducida por el usuario.
			if (veces.equalsIgnoreCase(palabra)) {
				contador++;
			}
		}

		// Devolvemos el número de veces.
		return contador;
	}
}
