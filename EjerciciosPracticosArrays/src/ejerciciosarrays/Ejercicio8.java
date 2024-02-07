package ejerciciosarrays;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		// Creamos la variable número para almacenar el valor random generado.
		int numero;

		// Creamos una tabla de longitud "100".
		int tabla[] = new int[100];

		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);

		// Con este for recorremos toda la tabla. Ademas, en la variable número
		// generamos un número aleatorio entre 1 y 10 y lo vamos guardando en cada
		// indice de la tabla.
		for (int i = 0; i < tabla.length; i++) {
			numero = (int) (1 + Math.random() * 10);
			tabla[i] = numero;
		}

		// Le pedimos un número al usuario.
		System.out.println("Introduce un número --> ");
		numero = sc.nextInt();

		// Con este for recorremos la longitud de la tabla.
		for (int i = 0; i < tabla.length; i++) {
			// Comprobamos si los valores guardados en nuestra tabla son iguales al número
			// introducido y si es así, imprimimos todas las posiciones en las que se guarde
			// el número introducido por teclado.
			if (tabla[i] == numero)
				System.out.print(i + ", ");

		}

		//Cierre de Scanner 
		sc.close();	}
}
