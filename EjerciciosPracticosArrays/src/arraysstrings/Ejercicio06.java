package arraysstrings;

import java.util.Scanner;

/**
 * Esta clase permite al usuario introducir palabras una una para formar una
 * frase. Se dejan de introducir palabras cuando el usuario escribe "fin".
 */
public class Ejercicio06 {

	/**
	 * Método main que permite al usuario introducir palabras para formar una frase.
	 */
	public static void main(String[] args) {

		// Declaramos esta variable para almacenar la palabra introducida por el
		// usuario.
		String palabra = "";

		// Declaramos fin para igualar esta palabra inicializada como fin a la
		// introducida por el usuario para finalizar de introducir palabras.
		String fin = "fin";

		// Declaramos es variable para ir guardando todas las palabras para formar la
		// frase final.
		String conjuntoPalabras = "";

		// Creamos el Scanner para leer por teclado
		Scanner sc = new Scanner(System.in);

		// Pedimos que introduzca una palabra por teclado.
		System.out.println("Introduce palabra a palabra para formar una frase --> ");
		palabra = sc.next();

		// Con este bucle while comprobamos si la palabra introducida es igual a la
		// variable fin. Para cuando terminamos la frase con "fin" ya no vuelve
		// preguntar y se sale del bucle y muestra la frase.
		while (!palabra.equalsIgnoreCase(fin)) {

			// En esta variable vamos sumando palabra palabra que va introduciendo el
			// usuario y con una separación entre palabra y palabra.
			conjuntoPalabras += palabra + " ";

			// Volvemos a preguntar.
			System.out.println("Introduce palabra a palabra para formar una frase --> ");
			palabra = sc.next();

		}

		// Imprimo la frase almacenada en conjuntoPalabras.
		System.out.println(conjuntoPalabras);

		// Cierre de Scanner.
		sc.close();
	}

}
