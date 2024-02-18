package arraysstrings;

import java.util.Random;
import java.util.Scanner;

/**
 * Esta clase es un juego en el que el Jugador 1 introduce una palabra, el
 * programa genera una pista anagrama para esa palabra, y el Jugador 2 intenta
 * adivinarla.
 */
public class Ejercicio15 {

	/**
	 * Método main que ejecuta el juego de adivinanza de palabras anagrama.
	 */
	public static void main(String[] args) {

		// Alamcenamos la palabra introducida por el Jugador 1.
		String jugador1 = "";

		// Almacenamos el intento de palabra del Jugador 2.
		String jugador2 = "";

		// Almacenamos la pista anagrama generada para la palabra introducida por el
		// Jugador 1.
		String pista = "";

		// Almacenamos los caracteres de la palabra del Jugador 1.
		char[] caracteres;

		// Creamos el Scanner para pedir por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al Jugador 1 que introduzca una palabra.
		System.out.println("Jugador1: Introduzca una palabra --> ");
		jugador1 = sc.nextLine();

		// Eliminamos espacios en blanco al principio y al final de la palabra.
		jugador1 = jugador1.trim();

		// Convertir la palabra en caracteres.
		caracteres = jugador1.toCharArray();

		// Generar una pista anagrama para la palabra del Jugador 1
		pista = anagrama(caracteres);

		// El Jugador 2 intenta adivinar la palabra del Jugador 1 hasta que la adivine.
		do {

			// Mostrar la pista del Jugador 2.
			System.out.println(pista);

			// Le pedimos al usuario que introduzca una palabra para comprobar si acierta.
			System.out.println("Jugador2: Introduzca la palabra correcta --> ");
			jugador2 = sc.next();

			// Continuar el bucle hasta que el intento del Jugador 2 sea igual a la palabra
			// del Jugador 1.
		} while (!jugador2.equals(jugador1));

		// Imprimir un mensaje cuando el Jugador 2 adivine la palabra del Jugador 1
		System.out.println("Correcto, la palabra era: " + jugador1);

		// Cierre de Scanner.
		sc.close();
	}

	/**
	 * Genera una pista anagrama para una palabra dada.
	 *
	 * @param caracteres Los caracteres de la palabra para la que se genera la pista
	 *                   anagrama.
	 * @return La pista anagrama generada.
	 */
	public static String anagrama(char[] caracteres) {
		Random aleatorio = new Random();

		String palabraDes = "";

		char[] letrasDes = new char[caracteres.length];

		for (int i = 0; i < caracteres.length; i++) {

			letrasDes[i] = caracteres[aleatorio.nextInt(0, caracteres.length)];

			palabraDes += letrasDes[i];

		}

		return palabraDes;

	}

}