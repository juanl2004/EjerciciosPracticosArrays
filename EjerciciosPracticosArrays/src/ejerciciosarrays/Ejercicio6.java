package ejerciciosarrays;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		// Creamos una tabla de longitud determinada en esta caso de "8".
		int numero[] = new int[8];

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Con este for le pedimos un número al usuario y lo guardamos en la tabla tanta
		// veces como sea necesario para completar cada hueco de la tabla.
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Introduce un número --> ");
			numero[i] = sc.nextInt();
		}

		// Mediante este for y el condicional if comprobamos cada valor guardado en cada
		// indice de la tabla. Y segun la condición dada se imprimirá "par" o "impar".
		for (int i = 0; i < numero.length; i++) {
			if (numero[i] % 2 == 0) {
				System.out.println("Es par --> " + numero[i]);
			} else {
				System.out.println("Es impar --> " + numero[i]);
			}

		}

		// Cierre de Scanner
		sc.close();
	}

}
