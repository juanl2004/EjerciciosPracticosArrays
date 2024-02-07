package ejerciciosarrays;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Creamos una tabla con una longitud de 10.
		int tabla[] = new int[10];

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Con este primer bucle le pedimos al usuario que introduzca un número y lo
		// almacenamos en la tabla creada anteriormente. El bucle se repetira tanta
		// veces como la longitud de la tabla para rellenar cada espacio.
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Escribe un número --> ");
			tabla[i] = sc.nextInt();
		}

		// Con este for inicializamos la i en 10 que es cada espacio en la tabla,
		// indicamos que retroceda un espacio atras cada vez que se ejecute hasta que la
		// i sea menor que 0.
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		
		//Cierre de Scanner
		sc.close();
	}

}
