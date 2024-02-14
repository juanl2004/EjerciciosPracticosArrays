package arraysstrings;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		// Declaramos esta variable para alamacenar la palabra introducida por el
		// usuario.
		String palabra = "";

		// Declaramos fin para igualar esta palabra inicializada como fin a la
		// introducida por el usuario para finalizar de introducir palabras.
		String fin = "fin";

		//Declaramos es variable para 
		String conjuntoPalabras = "";

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce palabra a palabra para formar una frase --> ");
		palabra = sc.next();

		while (!palabra.equalsIgnoreCase(fin)) {
			conjuntoPalabras += palabra + " ";

			System.out.println("Introduce palabra a palabra para formar una frase --> ");
			palabra = sc.next();

		}

		System.out.println(conjuntoPalabras);

		sc.close();
	}

}
