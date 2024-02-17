package arraysstrings;

import java.util.Scanner;

/**
 * Esta clase lee una frase y encuentra la palabra mas larga, luego imprime la
 * palabra más larga y el número de caracteres en esa palabra.
 */
public class Ejercicio12 {

	/**
	 * Método main que ejecuta el programa en el que se imprime la frase mas larga y
	 * el número de caracteres.
	 */
	public static void main(String[] args) {

		// Declaramos esta variable para que guarde la frase introducida por el usuario.
		String frase = "";

		// Declaramos esta variable para que guarde la palabra más larga encontrada.
		String palabraLarga = "";

		// Almacena los caracteres de la palabra más larga.
		char[] caracteres;

		// Contador para contar el número de caracteres de la palabra más larga.
		int contador = 0;

		// Creamos el Scanner para pedir por teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca una frase.
		System.out.println("Introduce una frase --> ");
		frase = sc.nextLine();

		// Dividimos la frase en palabras usando el espacio como delimitador.
		String[] palabra = frase.split(" ");

		// Asignar la primera palabra como la palabra más larga inicialmente.
		palabraLarga = palabra[0];

		// Recorrer todas las palabras para encontrar la más larga.
		for (int i = 0; i < palabra.length; i++) {

			// Comparar la longitud de la palabra actual con la longitud de la palabra más
			// larga.
			if (palabraLarga.length() < palabra[i].length()) {

				// Actualizamos la palabra más larga si se encuentra una más larga.
				palabraLarga = palabra[i];
			}
		}

		// Separar cada cararter de la palabra mas larga.
		caracteres = palabraLarga.toCharArray();

		// Imprimir la palabra más larga
		System.out.println("La palabra más larga es: " + palabraLarga);

		// Contar el número de caracteres en la palabra más larga.
		for (int i = 0; i < caracteres.length; i++) {
			contador++;
		}

		// Imprimir el número de caracteres de la palabra más larga.
		System.out.println("Número de caracteres de la palabra --> " + contador);

		// Cerrar Scanner
		sc.close();

	}
}