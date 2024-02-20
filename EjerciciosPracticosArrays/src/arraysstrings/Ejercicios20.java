package arraysstrings;

import java.util.Scanner;

/**
 * Esta clase divide una palabra en la secuencias de letras que introduzca el
 * usuario.
 */
public class Ejercicios20 {

	/**
	 * Método main para pedir al usuario una palabra y la longitud de las secuencias
	 * para luego imprimir las secuencias resultantes.
	 */
	public static void main(String[] args) {
		// Variable para almacenar la palabra introducida por el usuario.
		String palabra = "";

		// Variable para almacenar la longitud de las secuencias de letras.
		int secuenciaLetras;

		// Creamos el Scanner para leer por teclado.
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario que introduzca una palabra.
		System.out.println("Introduzca una palabra --> ");
		palabra = sc.nextLine();

		// Solicitamos al usuario que introduzca la longitud de las secuencias de
		// letras.
		System.out.println("Secuencia en la que quieres que se divida la palabra --> ");
		secuenciaLetras = sc.nextInt();

		// Llamamos a la función y imprimimos el resultado de forma bonita..
		for (String secuencia : dividePalabra(palabra, secuenciaLetras)) {
			System.out.print(secuencia + ", ");
		}

		// Cerrar el objeto Scanner para liberar recursos
		sc.close();
	}

	/**
	 * Divide una palabra en secuencias de letras de una longitud especificada por
	 * el usuario.
	 * 
	 * @param palabra         La palabra a dividir.
	 * @param secuenciaLetras La longitud de las secuencias de letras.
	 * @return Un array que contiene las secuencias de letras.
	 */
	public static String[] dividePalabra(String palabra, int secuenciaLetras) {
		// Calculamos el número de secuencias de letras
		int numSecuenciaL = palabra.length() / secuenciaLetras;

		// Comprobamos si hay letras al final de la palabra que no formen parte de la
		// secuencia completa de letras de la longitud especificada.
		if (palabra.length() % secuenciaLetras != 0) {
			// Incrementamos si hay letras adicionales al final.
			numSecuenciaL++;
		}
		// Creamos un array para almacenar las secuencias de letras.
		String[] secuencias = new String[numSecuenciaL];

		// Lo utilizamos para controlar el punto de partida para extraer cada secuencia
		// de letras de la palabra utilizando el método substring.
		int inicio = 0;

		// Recorremos las secuencias de letras de la palabra.
		for (int i = 0; i < numSecuenciaL; i++) {
			// Si es la última secuencia, tomamos lo que queda.
			if (i == numSecuenciaL - 1) {
				secuencias[i] = palabra.substring(inicio);
			} else {
				// Si no, tomamos la secuencia de tamaño especificado.
				secuencias[i] = palabra.substring(inicio, inicio + secuenciaLetras);
			}
			// Actualizamos el índice de inicio para la siguiente secuencia.
			inicio += secuenciaLetras;
		}
		// Devolvemos el array con la palabra secuenciada.
		return secuencias;
	}
}
