package ejerciciosarrays;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		// Creamos un array de 12 posiciones para almacenar las temperaturas de los 12
		// meses.
		int temperatura[] = new int[12];

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Declaramos meses como un array de cadenas de texto con los nombres de los
		// meses
		String meses[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };

		// Recorremos la tabla temperatura para almacenar la temperatura de cada mes,
		// pidiendole al usuario que la introduzca.
		for (int i = 0; i < temperatura.length; i++) {
			System.out.print("Ingrese la temperatura de " + meses[i] + ":");
			temperatura[i] = sc.nextInt();
		}

		// Recorre cada mes
		for (int i = 0; i < temperatura.length; i++) {
			// Imprime el nombre del mes.
			System.out.print(meses[i] + " -->");
			// Recorre desde 0 hasta la temperatura del mes en el que nos encontramos.
			for (int j = 0; j < temperatura[i]; j++) {
				// Imprime asteriscos para representar la temperatura.
				System.out.print(" *");
			}
			// Imprime una nuevalínea después de cada mes.
			System.out.println();
		}
		// Imprime una línea en blanco.
		System.out.print("");

		// Cierre de Scanner
		sc.close();
	}

}
