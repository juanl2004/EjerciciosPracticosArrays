package arraysstrings;

import java.util.Scanner;

public class Ejercicio10 {

	private static final char[] CONJUNTO1 = 
		{ 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };

	private static final char[] CONJUNTO2 = 
		{ 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String frase = "";

		String aux = "";

		String fraseCodificada = "";

		char c;

		int i = 0;

		System.out.println("Introduce una palabra");
		frase = sc.next();

		aux = frase.toLowerCase();

		while (i != frase.length()) {

			c = aux.charAt(i);

			fraseCodificada += codifica(CONJUNTO1, CONJUNTO2, c);

			i++;
		}

		System.out.println(fraseCodificada);

		sc.close();
	}

	public static char codifica(char[] CONJUNTO1, char[] CONJUNTO2, char c) {

		char cCodificado = ' ';

		for(int i = 0; i < CONJUNTO1.length; i++) {
			if(c == CONJUNTO1[i]) {
				cCodificado = CONJUNTO2[i];
				break;
			}else {
				cCodificado = c;
			}
		}
		
		return cCodificado;

	}
}
