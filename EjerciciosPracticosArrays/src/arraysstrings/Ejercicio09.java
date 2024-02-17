package arraysstrings;

import java.util.Scanner;

/**
 * Esta frase consta de un main y una función que en conjunto traducen frases de
 * Javalandia.
 */
public class Ejercicio09 {

	// Definimos estas constantes para el inicio y fin de la frase en Javalandia.
	private static final String INICIO = "Javalín, javalón";
	private static final String FIN = "javalén, lén, lén";

	/**
	 * Metodo main que traduce una frase de Javalandia a español.
	 */
	public static void main(String[] args) {

		// Creamos el Scanner para pedir por teclado.
		Scanner sc = new Scanner(System.in);

		// Declaramos esta variable para almacenar la frase original.
		String fraseJavalandia = "";

		// Declaramos esta variable para almacenar la frase traducida.
		String fraseTraducida = "";

		// Le pedimos al usuario que introduzca una frase.
		System.out.println("Introduzca una frase --> ");
		fraseJavalandia = sc.nextLine();

		// Verificamos si la frase comienza con el inicio de frase en Javalandia.
		if (fraseJavalandia.startsWith(INICIO)) {
			// Si comienza con el inicio de frase en Javalandia, la traducción será la
			// frase original sin el inicio de frase.
			fraseTraducida = fraseJavalandia.replace(INICIO, "");

			// Verificamos si la frase termina con la finalización de frase en Javalandia.
		} else if (fraseJavalandia.endsWith(FIN)) {
			// Si termina con la finalización de frase en Javalandia, la traducción será la
			// frase original sin la finalización de frase.
			fraseTraducida = fraseJavalandia.replace(FIN, "");

		} else {
			// Si la frase no comienza ni termina con las palabras específicas de
			// Javalandia,
			// la traducción será la misma frase original.
			fraseTraducida = fraseJavalandia;
		}

		// Eliminamos los espacios en blanco al inicio y al final de la frase traducida.
		fraseTraducida = fraseTraducida.trim();

		// Imprimimos la frase traducida.
		System.out.println(fraseTraducida);

		// Cierre de Scanner
		sc.close();
	}

}
