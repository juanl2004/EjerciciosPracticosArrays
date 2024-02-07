package ejclasesarrays;

import java.util.Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Creamos la variable donde guardar el número aleatorio.
		int numero;

		// Creamos la tabla con una longitud maxima de 30.
		int tabla[] = new int[30];

		// Mediante este bucle for genereramos un número aleatorio y lo guardamos en la
		// tabla en cada vuelta. Este bucle se repetira tantas veces como la longitud
		// total de la tabla.
		for (int i = 0; i < tabla.length; i++) {
			numero = (int) (Math.random() * 10);
			tabla[i] = numero;
		}

		// Mediante esta clase ordenamos los valores aleatorios de la tabla de menor a
		// mayor.
		Arrays.sort(tabla);

		// Y con esta clase los imprimimos.
		System.out.println(Arrays.toString(tabla));
	}

}
