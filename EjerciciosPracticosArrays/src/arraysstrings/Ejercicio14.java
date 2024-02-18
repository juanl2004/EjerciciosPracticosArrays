package arraysstrings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Esta clase cuenta las veces que se repite la letra del abecedario en una
 * frase introducida por el usuario.
 */
public class Ejercicio14 {

	/**
	 * Método main que solicita al usuario una frase, cuenta las veces que se repite
	 * cada letra del abecedario en la frase y luego las imprime en orden
	 * alfabético.
	 */
	public static void main(String[] args) {
		// Creamos una constante en la que declaramos el abecedario.
		final char[] abecedario = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p',
				'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		// Alamcenamos la frase introducida por el usuario.
		String frase;

		// Almacenamos la copia en minúsculas de la frase.
		String fraseMin;

		// Almacenamos los caracteres de la frase sin espacios ni signos de
		// puntuación.
		char[] caracteres;

		// Contador para contar las veces que se repite cada letra.
		int cont;

		// Creamos el Scanner para leer por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca una frase.
		System.out.println("Introduce una frase --> ");
		frase = sc.nextLine();

		// Convertir la frase a minúsculas y eliminar los espacios.
		fraseMin = frase.toLowerCase().replace(" ", "");

		// Convertir la frase en caracteres.
		caracteres = fraseMin.toCharArray();

		// Ordenar los caracteres para facilitar la suma de cada letra.
		Arrays.sort(caracteres);

		// Imprimir la frase original.
		System.out.println();
		System.out.println("Frase: " + frase);
		System.out.println("Resultado:");

		// Recorremos cada letra del abecedario.
		for (int i = 0; i < abecedario.length; i++) {
			// Reiniciar el contador para cada letra.
			cont = 0;

			// Recorremos cada carácter de la frase.
			for (int j = 0; j < caracteres.length; j++) {
				// Si el carácter actual coincide con la letra del abecedario, incrementamos el
				// contador
				if (abecedario[i] == caracteres[j]) {
					cont++;
				}
			}

			// Si la letra aparece al menos una vez en la frase, imprimir las veces que
			// aparece.
			if (cont > 0) {
				System.out.println(abecedario[i] + ": " + cont + " veces");
			}
		}

		// Cierre de Scanner
		sc.close();
	}

}
