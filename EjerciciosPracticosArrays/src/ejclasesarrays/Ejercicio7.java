package ejclasesarrays;

import java.util.Arrays;

public class Ejercicio7 {

	public static void main(String[] args) {

		// Declaramos esta variable para contabilizar el número de aciertos.
		int contador = 0;

		// Declaramos esta variable donde almacenar el número generado aleatoriamente.
		int aleatorio = 0;

		// Creamos la tabla "apuesta" que se completa con números aleatorios y seria la
		// jugada del jugador.
		int apuesta[] = new int[6];

		// Creamos la tabla "ganadora" que es la combinación de números premiados y son
		// los que debes de acertar.
		int ganadora[] = { 9, 21, 37, 38, 41, 49 };

		// Con este for recorremos la tabla entera y la completamos con números
		// aleatorios entre 1 y 49.
		for (int i = 0; i < apuesta.length; i++) {
			aleatorio = (int) (1 + Math.random() * 49);
			apuesta[i] = aleatorio;
		}

		// Ordenamos la tabla apuesta.
		Arrays.sort(apuesta);

		// Imprimos las tablas y algunos mensajes mas solo para hacer el resultado mas
		// bonito.
		System.out.println("Apuesta -->       " + Arrays.toString(apuesta));
		System.out.println("Combinación ganadora... ");
		System.out.println("");
		System.out.println("Serie ganadora --> " + Arrays.toString(ganadora));

		// Con este for recorremos la tabla apuesta hasta el final.
		for (int i = 0; i < apuesta.length; i++) {
			// Utilizamos la clase binarySearch para buscar el número en la tabla
			// ganadora
			int indice = Arrays.binarySearch(ganadora, apuesta[i]);

			// Si el índice es mayor o igual a 0, significa que encontramos un número.
			if (indice >= 0) {
				// Entonces lo vamos contabilizando.
				contador++;
			}
		}

		// Imprimimos el número de aciertos.
		System.out.println("Número de aciertos: " + contador);

	}

}
