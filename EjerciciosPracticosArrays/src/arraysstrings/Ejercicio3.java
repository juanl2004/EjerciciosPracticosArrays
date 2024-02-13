package arraysstrings;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		String frase;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una frase -> ");
		frase = sc.nextLine();

		System.out.println("El número de espacios en la frase es de --> " + Ejercicio3.espaciosBlancos(frase));

		sc.close();
	}

	public static int espaciosBlancos(String frase) {

		int contador = 0;

		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ') {
				contador++;
			}
		}

		return contador;
	}
}

		