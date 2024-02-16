package arraysstrings;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {

		String palabra;
		String palabra1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una palabra o una frase --> ");
		palabra = sc.nextLine();
		
		System.out.println("Introduce una palabra o una frase --> ");
		palabra1 = sc.nextLine();
		
		System.out.println("¿Las frases son anagramas? -> " + Ejercicio13.esAnagrama(palabra, palabra1));
	
	sc.close();
	}
		public static boolean esAnagrama(String palabra, String palabra1) {
			
			char[] tabla1;
			char[] tabla2;
			
			palabra.toLowerCase().replace(" ", "");
			palabra1.toLowerCase().replace(" ", "");

			tabla1 = palabra.toCharArray();
			tabla2 = palabra1.toCharArray();			
			
			Arrays.sort(tabla1);
			Arrays.sort(tabla2);
			
			return Arrays.equals(tabla1, tabla2);
		}
	}


