package ejclasesarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Declaramos la variable donde se guardara la longitud de la tabla.
		int N;
		// Declaramos la variable donde se guardara el valor con el que se va a rellenar
		// la tabla.
		int M;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca por teclado la longitud de la tabla.
		System.out.println("Introduce la longitud de la tabla --> ");
		N = sc.nextInt();

		// Le pedimos al usuario que introduzca el valor con el que vamos a rellenar la
		// tabla.
		System.out.println("Introduce el valor con el que completar la tabla --> ");
		M = sc.nextInt();

		// Creamos la tabla con la longitud que el usuario a introducido por teclado.
		int tabla[] = new int[N];

		// Declaramos la clase "fill" para asignar el valor que el suario ha introducido
		// por teclado a toda la tabla.
		Arrays.fill(tabla, M);

		//Imprimimos la tabla
		System.out.println(Arrays.toString(tabla));

		//Cierre de Scanner
		sc.close();
	}

}
