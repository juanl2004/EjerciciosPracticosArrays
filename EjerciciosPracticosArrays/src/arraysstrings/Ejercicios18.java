package arraysstrings;

import java.util.Scanner;

/**
 * Clase que contiene una función para generar código HTML básico a partir de un
 * título y contenido.
 */
public class Ejercicios18 {

	/**
	 * Método main para probar la que se genera código HTML. Se le solicita al
	 * usuario que ingrese un título y contenido, y luego genera y muestra el código
	 * HTML.
	 */
	public static void main(String[] args) {

		// Variables para almacenar el título y el contenido ingresados por el usuario.
		String titulo = "";
		String contenido = "";

		// Creamos el Scanner para pedir por teclado.
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario que introduzca un titulo.
		System.out.println("Introduce un título --> ");
		titulo = sc.nextLine();

		// Pedimos al usuario que introduzca contenido para su página.
		System.out.println("Introduce el contenido de tu página --> ");
		contenido = sc.nextLine();

		// Llamamos a la función y imprimimos el resultado.
		System.out.println(generarHTML(titulo, contenido));

		// Cierre de Scanner
		sc.close();
	}

	/**
	 * Genera código HTML con un título y un contenido.
	 * 
	 * @param titulo    Título de la página.
	 * @param contenido Contenido de la página.
	 * @return Una cadena que representa el código HTML generado.
	 */
	public static String generarHTML(String titulo, String contenido) {

		// Construimos el documento HTML con las etiquetas necesarias.
		String html = "<!DOCTYPE html>\n";

		html += "<html>\n";
		html += "<head>\n";
		// Agrega el título al encabezado del documento.
		html += "<title>" + titulo + "</title>\n";
		html += "</head>\n";
		html += "<body>\n";
		// Agrega el título como encabezado de primer nivel y el contenido como párrafo.
		html += "<h1>" + titulo + "</h1>\n";
		html += "<p>" + contenido + "</p>\n";
		html += "</body>\n";
		html += "</html>";

		// Devuelve el código HTML generado.
		return html;
	}
}