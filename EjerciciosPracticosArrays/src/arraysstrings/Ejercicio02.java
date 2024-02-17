package arraysstrings;

import java.util.Scanner;

/**
 * Esta clase crea un juego donde un jugador introduce una contraseña y otro
 * intenta adivinarla.
 */
public class Ejercicio02 {

	/**
	 * Método main donde un jugador introduce una contraseña y otro intenta
	 * adivinarla.
	 */
	public static void main(String[] args) {

		// Esta variable alamacena la contraseña que se debe de acertar.
		String contraseña;

		// Esta variable almacena las palabra que introducira el usuario intentando
		// acertar la contraseña.
		String intento;

		// Creamos el Scanner para pedir por teclado
		Scanner sc = new Scanner(System.in);

		// Le pido al primer jugador que introduzca contraseña por teclado
		System.out.println("Jugador 1: Introduzca la contraseña -->");
		contraseña = sc.nextLine();

		// Le pido al segundo juagdor que introduzaca una palabra.
		System.out.println(" Jugador 2: Acierta la contraseña --> ");
		intento = sc.nextLine();

		// Creo un bucle for para recorrer cada elemento de la contraseña.
		for (int i = 0; i < contraseña.length(); i++) {

			// Creo una nueva variable intentoArray y le asigno el valor de la variable
			// intento
			// como un array.
			char[] intentoArray = intento.toCharArray();

			// Comparo si el caracter que está en la posición i de la contraseña
			// es igual al caracter que está en la posición i de la variable intento.
			if (contraseña.charAt(i) == intento.charAt(i)) {

				// Si coinciden imprimo el elemento que está en la posición i del array
				// cadenaArray.
				System.out.print(intentoArray[i]);

			} else {
				// Si los caracteres no son iguales se imprime un asterisco.
				System.out.print("*");
			}
		}
		// Cierre de Scanner
		sc.close();
	}

}
