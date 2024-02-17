package arraysstrings;

import java.util.Scanner;

/**
 * Esta clase se compone de un main y una función. Se encargar de devolvernos
 * una frase invertida que previamente hemos introducido por teclado
 */
public class Ejercicio05 {

	/**
	 * Metodo main, declaramos el Scanner y pedimos al usuario que introduzca una
	 * frase la cual se alamacenara en la variable String cadena y también llamamos
	 * a la función.
	 */
	public static void main(String[] args) {
		// Creamos esta variable para que almacene la frase introducida por el usuario.
		String cadena;

		// Creamos el Scanner para pedir por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca una frase.
		System.out.println("Escribe una frase --> ");
		cadena = sc.nextLine();

		// Llamamos a la función para que nos devuelva la frase invertida.
		System.out.println(Ejercicio05.delReves(cadena));

		// Cierre de Scanner
		sc.close();
	}

	/**
	 * Esta función se encarga de leer la frase al raves y de mostrarnosla.
	 * 
	 * @param cadena Variable que almacena la frase, introducida como parametro.
	 * @return palabraInvertida, nos devuelve la frase invertida.
	 */
	public static String delReves(String cadena) {

		// Declaramos la variable palabraInvertida para que nos almacena la frase al
		// reves.
		String palabraInvertida = "";

		// Con este bucle for recorremos la frase del final al principio.
		for (int i = cadena.length() - 1; i > -1; i--) {
			// En palabraInvertida vamos almacenando cada caracter que se va leyendo en cada
			// vuleta.
			palabraInvertida += cadena.charAt(i);
		}

		// Devolvemos la palabra ya invertida.
		return palabraInvertida;

	}

}
