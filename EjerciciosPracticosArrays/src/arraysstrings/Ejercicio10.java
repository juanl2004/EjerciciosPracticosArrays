package arraysstrings;

import java.util.Scanner;

/**
 * Esta clase codifica una palabra introducida por el usuario utilizando un
 * conjunto de caracteres y un conjunto de caracteres codificados.
 */
public class Ejercicio10 {

	/**
	 * Método principal que solicita al usuario una palabra y la codifica utilizando
	 * los conjuntos de caracteres CONJUNTO1 y CONJUNTO2.
	 */
	public static void main(String[] args) {

		// Declaramos como constante "CONSTANTE1" ya que son una serie de caracteres que
		// no se van a modificar.
		final char[] CONJUNTO1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
		// Declaramos como constante "CONSTANTE2" ya que son una serie de caracteres que
		// no se van a modificar.
		final char[] CONJUNTO2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };

		// Almacenamos la frase introducida por el usuario.
		String frase = "";

		// Almacenamos la frase introducida por el usuario pero en minuscula.
		String fraseMin = "";

		// Variable para almacenar la frase codificada.
		String fraseCodificada = "";

		// Variable temporal para procesar cada caracter de la frase.
		char caracterTemp;

		// Índice para recorrer la frase.
		int i = 0;

		// Creamos el Scanner para pedir por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca una palabra.
		System.out.println("Introduce una palabra --> ");
		frase = sc.next();

		// Convertimos la frase a minúsculas.
		fraseMin = frase.toLowerCase();

		// Comparamos cada caracter de la frase.
		while (i != frase.length()) {
			// Cojemos un caracter de la frase convertida a minúsculas.
			caracterTemp = fraseMin.charAt(i);

			// Codificamos el caracter y lo agregamos a la frase codificada.
			fraseCodificada += codifica(CONJUNTO1, CONJUNTO2, caracterTemp);

			// Incrementamos el índice para avanzar al próximo caracter de la frase.
			i++;
		}

		// Imprimimos la frase codificada
		System.out.println(fraseCodificada);

		// Cerramos el objeto Scanner
		sc.close();
	}

	/**
	 * Codifica un caracter según la palabra introducida.
	 * 
	 * @param CONJUNTO1    Conjunto de caracteres original.
	 * @param CONJUNTO2    Conjunto de caracteres codificado.
	 * @param caracterTemp Caracter a codificar.
	 * @return Caracter codificado.
	 */
	public static char codifica(char[] CONJUNTO1, char[] CONJUNTO2, char caracterTemp) {
		// Inicializamos el caracter codificado con un espacio en blanco
		char caracterCod = ' ';

		// Recorremos el conjunto de caracteres original.
		for (int i = 0; i < CONJUNTO1.length; i++) {
			// Si el caracter coincide con el caracter en la posición i del conjunto
			// original, le asignamos el caracter del conjunto codificado y salimos del
			// bucle con el break.
			if (caracterTemp == CONJUNTO1[i]) {
				caracterCod = CONJUNTO2[i];
				break;
			} else {
				// Si el caracter no coincide con ningún caracter del conjunto original,
				// conservamos el caracter original.
				caracterCod = caracterTemp;
			}
		}

		// Devolvemos el caracter codificado.
		return caracterCod;
	}
}