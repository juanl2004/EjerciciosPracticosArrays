package arraysstrings;

import java.util.Scanner;

public class Ejercicio17 {

	public static final String FIN = "*/";
	public static final String INICIO = "*/";

	public static void main(String[] args) {

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
	}
}