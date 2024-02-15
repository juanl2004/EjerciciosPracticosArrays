package arraysstrings;

import java.util.Scanner;

public class Ejercicio9 {

	private static final String COMIENZO = "Javalín, javalón";
	private static final String FINALIZACION = "javalén, lén, lén";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String fraseJavalandia = "";

		String fraseTraducida = "";

		System.out.println("Introduce la frase");
		fraseJavalandia = sc.nextLine();

		if (fraseJavalandia.startsWith(COMIENZO)) {

			fraseTraducida = fraseJavalandia.replace(COMIENZO, "");

		} else if (fraseJavalandia.endsWith(FINALIZACION)) {

			fraseTraducida = fraseJavalandia.replace(FINALIZACION, "");

		} else {
			fraseTraducida = fraseJavalandia;
		}

		fraseTraducida = fraseTraducida.trim();

		System.out.println(fraseTraducida);

		sc.close();
	}

}
