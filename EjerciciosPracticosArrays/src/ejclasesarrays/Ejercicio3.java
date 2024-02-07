package ejclasesarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Declaramos la variable número donde se guardara el valor que nosotros
		// indroduzcamos por teclado.
		int numero;

		// Creamos la primera tabla donde se almacenaran los 10 primeros números
		// introducidos.
		int tabla1[] = new int[10];
		// Creamos la segunda tabla donde se almacenaran los 10 ultimos numeros
		// introducidos.
		int tabla2[] = new int[10];

		// Creamos el Scanner para poder introducir valores por teclado.
		Scanner sc = new Scanner(System.in);

		// Con este for recorremos la tabla entera. Iremos introduciendo un valor hasta
		// 20 veces.
		for (int i = 0; i < 20; i++) {
			System.out.println("Introduce un número");
			numero = sc.nextInt();

			// Si el indice es menor que 10, los 10 primeros numeros se guardaran en la
			// primera tabla.
			if (i < 10) {
				tabla1[i] = numero;
				// En cambio, si i es menor que 21 entonces se almacenan en la tabla 2.
			} else if (i < 21) {
				tabla2[i - 10] = numero;

			}
		}

		// Si los valores son iguales en una tabla o otra, se imprime que son iguales.
		if (Arrays.equals(tabla1, tabla2)) {
			System.out.println("Las tablas son iguales.");
			// Si no, se imprime no son iguales.
		} else {
			System.out.println("Las tablas no son iguales.");
		}

		// Cierre de Scanner.
		sc.close();
	}

}