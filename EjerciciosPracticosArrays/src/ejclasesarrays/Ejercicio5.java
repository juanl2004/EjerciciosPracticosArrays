package ejclasesarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Declaramos esta variable para registrar la puntuación de cada jugador.
		int numero = 0;
		// Esta variable la creamos para a la hora de preguntar nos indique cual es el
		// jugador que debe de introducir la puntuación.
		int jugador = 0;
		// Declaramos esta variable que nos servirá de indice para la tabla2.
		int auxiliar;

		// Creamos la primera tabla "tabla".
		int tabla[] = new int[8];
		// Creamos la segunda tabla "tabla2", para copiar los valores de la primera
		// tabla pero al reves.
		int tabla2[] = new int[8];

		// Creamos el Scanner para pedir unos números por teclado.
		Scanner sc = new Scanner(System.in);

		// Con este bucle for recorremos toda la primera tabla.
		for (int i = 0; i < tabla.length; i++) {
			// En cada vuelta del for le sumamos uno a la variable jugador para cuando el
			// usuario introduzca la puntuación del jugador sepa de que jugador debe
			// introducirla.
			jugador++;

			// Gracias a este bucle do-while podemos preguntar la puntución de un jugador
			// una y otra vez hasta que el valor introducido no este comprendido entre 1000
			// y 2800.
			do {
				// Le pedimos al usuario que introduzca por teclado la puntuación de cada
				// jugador.
				System.out.println("Introduce la puntuación del jugador " + jugador + " --> ");
				numero = sc.nextInt();
				// Almacenamos la puntuación de cada jugador en la primera tabla.
				tabla[i] = numero;
				// La condición para volver a preguntar la puntución en caso de que se ingrese
				// un valor erroneo.
			} while (numero < 1000 || numero > 2800);

		}

		// Ordenamos los valores de la tabla de menor a mayor.
		Arrays.sort(tabla);

		// Con este bucle for conseguimos que en cada vuelta la variable "auxiliar
		// recorra un indici hacia atras desde el final. Y que ese valor que se
		// encuentra en dicha psición de la tabla 1 se vaya copiando en la tabla 2 de
		// izquierda a derecha."
		for (int i = 0; i < tabla.length; i++) {
			auxiliar = tabla.length - i - 1;
			tabla2[auxiliar] = tabla[i];
		}

		// Imprimimos la tabla 2 que es donde se ha copia los nuevos valores ordenados
		// de mayor a menor.
		System.out.println(Arrays.toString(tabla2));
	
		//Cierre de Scanner
		sc.close();
	}

}
