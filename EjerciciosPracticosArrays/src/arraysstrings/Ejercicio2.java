package arraysstrings;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		String contraseña;

		String intento;

		Scanner sc = new Scanner(System.in);

		System.out.println("Jugador 1, Introduce la contraseña --> ");
		contraseña = sc.nextLine();

		do {
			System.out.println("Jugador 2, Intenta acertar la contraseña --> ");
			intento = sc.nextLine();

			if (contraseña.compareTo(intento) < 0) {
				System.out.println("La palabra introducida en mayor alfabéticamente");
			} else if (contraseña.compareTo(intento) > 0) {
				System.out.println("La palabra introducida en menor alfabéticamente");
			} else {
				System.out.println("¡HAS ACERTADO!");
			}

		} while (!contraseña.equals(intento));

		sc.close();
	}

}
