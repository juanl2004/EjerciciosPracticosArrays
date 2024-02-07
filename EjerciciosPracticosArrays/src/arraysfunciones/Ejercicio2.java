package arraysfunciones;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Creamos la tabla y le introducimos los valores por parametros.
		int t[] = { 4, 100, 8, 6, 90 };

		// Creamos la variable resultado y llamamos a la función maximo para que nos
		// devuelva el valor.
		int resultado = Ejercicio2.maximo(t);

		// Imprimimos el resultado.
		System.out.println("El mayor número de la tabla es --> " + resultado);
	}

	// Creamos la función maximo donde devolveremos el valor maximo de la tabla y
	// introducimos como variable la tabla.
	public static int maximo(int t[]) {

		// Creamos la variable maximo donde se almacenara el valor maximo de la tabla.
		int maximo = 0;

		// Ordenamos la tabla primero para saber que el número mayor estará al final de
		// la tabla.
		Arrays.sort(t);

		// Con este for recorremos toda la tabla y numero sera el ultimo valor de la
		// tabla por lo tanto lo igualamos a maximo.
		for (int numero : t) {
			maximo = numero;
		}

		// Devolvemos maximo.
		return maximo;

	}

}
