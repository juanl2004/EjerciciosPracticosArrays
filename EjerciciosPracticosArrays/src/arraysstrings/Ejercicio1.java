package arraysstrings;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Creamos la variable frase 1 para almacenar la primera frase introducida por
		// el usuario.
		String frase1;
		// Creamos la variable frase 2 para almacenar la segunda frase introducida por
		// el usuario.
		String frase2;

		// Creamos el Scanner para pedir por teclado
		Scanner sc = new Scanner(System.in);

		System.out.println("Compara cual de las dos frases es la mas larga");

		// Le pedimos al usuario que introduzca la primera frase.
		System.out.println("Introduce una frase --> ");
		frase1 = sc.nextLine();

		// Le pedimos al usuario que introduzca la segunda frase.
		System.out.println("Introduce otra frase --> ");
		frase2 = sc.nextLine();

		// Creamos esta condición para igualar cual de las dos frase es mas larga y si
		// son iguales.
		if (frase1.length() < frase2.length()) {
			System.out.println("La segunda frase es mayor");
		} else if (frase2.length() < frase1.length()) {
			System.out.println("La primera frase es mayor");
		} else {
			System.out.println("Las frases son iguales");
		}

		//Cierrre de Scanner
		sc.close();
	}

}
