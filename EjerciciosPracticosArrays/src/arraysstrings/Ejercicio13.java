package arraysstrings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Esta clase verifica si dos palabras o frases son anagramas.
 */
public class Ejercicio13 {

	/**
	 * Método main que nos dice si dos palabras o frases son anagramas.
	 */
	public static void main(String[] args) {

		// Creamos el Scanner para pedir por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que nos introduzca una palabra o una frase.
		System.out.println("Introduce una palabra o una frase --> ");
		String palabra = sc.nextLine();

		// Le volvemos a pedir al usuario que nos introduzca una palabra o una frase.
		System.out.println("Introduce otra palabra o una frase --> ");
		String palabra1 = sc.nextLine();

		// Llamamos a la función para que nos delvuelva el resultado.
		System.out.println("¿Las palabras/frases son anagramas? -> " + esAnagrama(palabra, palabra1));

		// Cierre de Scanner.
		sc.close();
	}

	/**
	 * Verifica si dos palabras o frases son anagramas.
	 *
	 * @param palabra  La primera palabra o frase.
	 * @param palabra1 La segunda palabra o frase.
	 * @return true si son anagramas, false en caso contrario.
	 */
	public static boolean esAnagrama(String palabra, String palabra1) {

		// Convertir las palabras a minúsculas y quitar espacios en blanco
		palabra = palabra.toLowerCase().replace(" ", "");
		palabra1 = palabra1.toLowerCase().replace(" ", "");

		// Convertir las palabras a caracteres y ordenarlos.
		char[] tabla1 = palabra.toCharArray();
		char[] tabla2 = palabra1.toCharArray();
		Arrays.sort(tabla1);
		Arrays.sort(tabla2);

		// Verificar si los caracteres ordenados son iguales.
		return Arrays.equals(tabla1, tabla2);
	}
}
