package examenarray;

import java.util.Random;
import java.util.Scanner;

public class PrimeraPratica01 {
	private static final String[] palabras = { "humanidad", "persona", "hombre", "mujer", "individuo", "cuerpo",
			"pierna", "cabeza", "brazo", "familia" };
	private static int NUMINTENTOS = 7;
	private static String palabraSecreta;
	private static String palabraPista;
	private static String noAcertadas = "";

	public static void main(String[] args) {
		generaPalabra();
		System.out.println("¡Bienvenido al juego del ahorcado!");
		System.out.println("Adivina la palabra:");

		Scanner scanner = new Scanner(System.in);

		while (!haAdivinado() && NUMINTENTOS > 0) {
			pintaPista();
			System.out.println("Intentos restantes: " + NUMINTENTOS);
			int opcion = menu();

			if (opcion == 1) {
				System.out.print("Introduce una letra: ");
				String letra = scanner.nextLine().toLowerCase();
				compruebaLetra(letra);
			} else if (opcion == 2) {
				System.out.print("Introduce la palabra: ");
				String palabra = scanner.nextLine().toLowerCase();
				compruebaPalabra(palabra);
			} else {
				System.out.println("Opción inválida. Por favor, elige de nuevo.");
			}
		}

		if (haAdivinado()) {
			System.out.println("¡¡ENHORABUENA!! HAS ACERTADO");
		} else {
			System.out.println("GAME OVER. La palabra era: " + palabraSecreta);
		}

		scanner.close();
	}

	private static void generaPalabra() {
		Random rand = new Random();
		palabraSecreta = palabras[rand.nextInt(palabras.length)];
		palabraPista = "_".repeat(palabraSecreta.length());
	}

	private static int menu() {
		System.out.println("Seleccione una de las siguientes opciones:");
		System.out.println("1. Introducir letra.");
		System.out.println("2. Introducir palabra.");

		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

	private static void compruebaLetra(String letra) {
		if (palabraSecreta.contains(letra)) {
			for (int i = 0; i < palabraSecreta.length(); i++) {
				if (palabraSecreta.charAt(i) == letra.charAt(0)) {
					palabraPista = palabraPista.substring(0, i) + letra + palabraPista.substring(i + 1);
				}
			}
		} else {
			noAcertadas += letra + " ";
			NUMINTENTOS--;
		}
	}

	private static void compruebaPalabra(String palabra) {
		if (palabra.equals(palabraSecreta)) {
			palabraPista = palabraSecreta;
		} else {
			NUMINTENTOS--;
		}
	}

	private static boolean haAdivinado() {
		return palabraPista.equals(palabraSecreta);
	}

	private static void pintaPista() {
		System.out.println("Letras usadas no acertadas: " + noAcertadas);
		System.out.println("Pista: " + palabraPista);
	}
}