package ejerciciosarrays;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Creamos una tabla llamada "tabla" con una longitud determinada (10).
		int tabla[] = new int[10];

		// Creamos la variable suma y la inizializamos en 0.
		int suma = 0;

		// Declaramos la variable max y min para almacenar dichos valores.
		int max;
		int min;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Con este for le pedimos un número al usuario y lo guardamos en la tabla tanta
		// veces como sea necesario para completar cada hueco de la tabla.
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Introduce un número --> ");
			tabla[i] = sc.nextInt();
		}

		// Con este for calculamos la suma de todos los números de la tabla.
		for (int numero : tabla) {
			suma += numero;
		}
		// Inizializamso max y min con el primer indice de la tabla despues de que se
		// ingresen los números.
		max = tabla[0];
		min = tabla[0];

		// Mediante el bucle for comparamos cada elemento del array con el valor
		// actual de max y min. Si el elemento actual (tabla[i]) es mayor que max,
		// actualizamos max con el valor del elemento actual y igual con el min.
		for (int i = 1; i < 10; i++) {
			if (tabla[i] > max) {
				max = tabla[i];
			}

			if (tabla[i] < min) {
				min = tabla[i];
			}
		}

		// Imprimimimos resultados
		System.out.println("Suma de los números: " + suma);
		System.out.println("Número máximo: " + max);
		System.out.println("Número mínimo: " + min);

		// Cierre de Scanner
		sc.close();
	}

}
