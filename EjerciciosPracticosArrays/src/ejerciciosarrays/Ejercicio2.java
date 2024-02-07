package ejerciciosarrays;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Creamos una tabla que la llamamos "tabla" con una longitud determinada.
		double tabla[] = new double[5];

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Con el primer bucle for le pedimos al usuario que introduzca un número y lo
		// guarde en la tabla. Con el bucle for repetiremos este bucle 5 veces.
		for (int i = 0; i < tabla.length; i++) {

			// Le pedimos un número al usuario.
			System.out.println("Escribe un número --> ");
			// Guardamos el resultado en la i de la tabla.
			tabla[i] = sc.nextDouble();
		}

		// Con este for conseguimos imprimir todos los valores de una tabla.
		for (double numeros : tabla) {
			// Imprimimos números.
			System.out.println(numeros);
		}

		// Cierre de Scanner
		sc.close();
	}

}
