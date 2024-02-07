package ejerciciosarrays;

import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Declaramos la variable número.
		int numero;

		// Construimos una tabla con una longitud determinada.
		int tabla[] = new int[10];

		// Creamos la clase Random para generar números aleatorios.
		Random rnd = new Random();

		// Inicializamos el for en 0 y le indicamos que debe de ser menor a la longitud
		// de la tabla.
		for (int i = 0; i < tabla.length; i++) {
			//Generamos un número aleatorio.
			numero = rnd.nextInt(100) + 1;
			//Lo imprimimos.
			System.out.println(numero);
		}

	}

}
