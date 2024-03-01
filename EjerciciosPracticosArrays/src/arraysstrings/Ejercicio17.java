package arraysstrings;

import java.util.Scanner;

<<<<<<< HEAD
=======
/**
 * Clase que elimina comentarios de código C.
 */
>>>>>>> branch 'master' of https://github.com/juanl2004/EjerciciosPracticosArrays.git
public class Ejercicio17 {

<<<<<<< HEAD
	public static final String FIN = "*/";
	public static final String INICIO = "*/";

=======
	/**
	 * Representa el final de un comentario en código C.
	 */
	public static final String FIN = "*/";

	/**
	 * Representa el inicio de un comentario en código C.
	 */
	public static final String INICIO = "/*";

	/**
	 * Método main que solicita al usuario una línea de código C, llama al método
	 * sinComentarios para eliminar los comentarios y muestra el resultado.
	 */
>>>>>>> branch 'master' of https://github.com/juanl2004/EjerciciosPracticosArrays.git
	public static void main(String[] args) {

<<<<<<< HEAD
		String codigoC;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una frase --> ");
		codigoC = sc.nextLine();
		
		System.out.println(sinComentarios(codigoC));
		
	}
	
	public static String sinComentarios(String codigoC) {
		String cadSinComentarios = "";
		int inicio;
		int fin;
		
		inicio = codigoC.indexOf(INICIO);
		fin = codigoC.indexOf(FIN);
		
		while (inicio != -1) {
			cadSinComentarios += codigoC.substring(fin, inicio);
			fin = codigoC.indexOf(FIN, inicio)+FIN.length();
			inicio = codigoC.indexOf(INICIO, fin);
		}
		
		return cadSinComentarios;
=======
		// Declaramos una variable para almacenar la entrada del usuario.
		String codigoC;

		// Creamos el Scanner para pedir por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca una clase
		System.out.println("Introduce una frase --> ");
		codigoC = sc.nextLine();

		// Llamamos a la función "sinComentarios" y imprimimos lo que nos devuelve.
		System.out.println(sinComentarios(codigoC));

		// Cierre de Scanner
		sc.close();
>>>>>>> branch 'master' of https://github.com/juanl2004/EjerciciosPracticosArrays.git
	}

	/**
	 * Elimina los comentarios de una cadena de código C.
	 * 
	 * @param codigoC Cadena de código C con comentarios.
	 * @return Cadena de código C sin comentarios.
	 */
	public static String sinComentarios(String codigoC) {

		// Creamos esta variable para almacenar el código sin comentarios.
		String cadSinComentarios = "";

		// Se busca la posición del primer inicio de comentario en el código.
		int inicio = codigoC.indexOf(INICIO);

		// Se inicializa la variable fin que representará el fin del comentario.
		int fin = 0;

		// Mientras se encuentren comentarios en el código.
		while (inicio != -1) {

			// Se añade a la cadena el código que está fuera de los comentarios.
			cadSinComentarios += codigoC.substring(fin, inicio);

			// Se busca la posición del fin del comentario.
			fin = codigoC.indexOf(FIN, inicio) + FIN.length();

			// Se busca la posición del próximo inicio de comentario.
			inicio = codigoC.indexOf(INICIO, fin);
		}
		// Devolvemos el código sin comentarios.
		return cadSinComentarios;
	}

}
