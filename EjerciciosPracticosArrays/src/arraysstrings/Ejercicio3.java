package arraysstrings;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Creamos esta variable para almacenar la frase introducida por el usuario.
		String frase;

		// Creamso el Scanner para pedir por teclado.
		Scanner sc = new Scanner(System.in);

		// Pedimos la frase
		System.out.println("Introduce una frase -> ");
		frase = sc.nextLine();

		// Mostramos el número de espacios llamando a la función.
		System.out.println("El número de espacios en la frase es de --> " + Ejercicio3.espaciosBlancos(frase));

		// Cierre de Scanner
		sc.close();
	}

	// Creamos esta función para que nos cuente el número de espacios de la frase
	// introducida como parametro.
	public static int espaciosBlancos(String frase) {

		// Variable para contar el número de espacios.
		int contador = 0;

		// Con este for recorremos la frase
		for (int i = 0; i < frase.length(); i++) {
			// Con este if comparamos cada caracter, con un espacio y si aparece sumariamos
			// 1 en el contador.
			if (frase.charAt(i) == ' ') {
				contador++;
			}
		}

		// Devolvemos el número de veces que ha contado espacios.
		return contador;
	}
}
