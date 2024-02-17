package arraysstrings;

import java.util.Scanner;

/**
 * Esta clase nos compueba si la frase es palindroma o no.
 */
public class Ejercicio08 {

	/**
	 * Metodo principal que le pide al usuario una frase y verifica si es
	 * palindroma.
	 */
	public static void main(String[] args) {
		// Declaramos esta variable para almacenar la frase introducida por el usuario.
		String frase;

		// Almacenamos la frase original
		String fraseOriginal;

		// Creamos el Scanner para pedir por teclado.
		Scanner sc = new Scanner(System.in);

		// Pedir al usuario que introduzca una frase por teclado.
		System.out.println("Introduce una frase --> ");
		frase = sc.nextLine();

		// Lo primero que haremos será quitarle los espacios a la frase
		fraseOriginal = frase.replace(" ", "");

		// Llamamos a la función para verificar si la frase es palíndroma y mostrar el
		// resultado. Con la condición iguales una frase con la otra para comprobar si
		// son iguales.
		if (fraseOriginal.equals(Ejercicio08.esPalindroma(frase, fraseOriginal))) {
			System.out.println("La frase es palíndroma.");
		} else {
			System.out.println("La frase no es palíndroma.");
		}

		// Cierre de Scanner
		sc.close();
	}

	/**
	 * Este método verifica si una frase dada es palíndroma.
	 * 
	 * @param frase La frase que se desea verificar.
	 * @return true si la frase es palíndroma, false en caso contrario.
	 */
	public static String esPalindroma(String frase, String fraseOriginal) {

		// Aquí guardaremos la frase dada la vuelta
		String fraseInvertida = "";

		// Creamos un bucle que se repita el número de veces igual a los caracteres de
		// la frase, empezando por el final de esta
		for (int i = (fraseOriginal.length()) - 1; i >= 0; i--) {
			// Introducimos en la cadena el caracter correspondiente.
			fraseInvertida += fraseOriginal.charAt(i);
		}
		// Devolvemos la frase dada la vuelta.
		return fraseInvertida;
	}

}