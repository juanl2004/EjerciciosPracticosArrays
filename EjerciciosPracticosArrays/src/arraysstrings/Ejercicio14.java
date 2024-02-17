package arraysstrings;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		final char[] abecedario = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o',
				'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		
		String frase; 
		String fraseMin;
		char[] caracteres;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una frase --> ");
		frase = sc.nextLine();
		
		fraseMin = frase.toLowerCase().replace(" ", "");
		
		caracteres = fraseMin.toCharArray();
		
		Arrays.sort(caracteres);
		
		for (int i = 0; i < caracteres.length; i++) {
			
			
			
		}
		sc.close();
	}

}
