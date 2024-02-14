package arraysstrings;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		String cadena;

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe una frase --> ");
		cadena = sc.nextLine();
	
		System.out.println(Ejercicio5.delReves(cadena));
		
		sc.close();
	}

	public static String delReves(String cadena) {
		
		String palabraInvertida = "";
		
		for (int i = cadena.length()-1; i > -1; i--) {
			palabraInvertida += cadena.charAt(i);
		}
		
		
		return palabraInvertida;

	}

}
