package arraysstrings;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		String frase1;
		String frase2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Compara cual de las dos frases es la mas larga");
		
		System.out.println("Introduce una frase --> ");
		frase1 = sc.nextLine();
		
		System.out.println("Introduce otra frase --> ");
		frase2 = sc.nextLine();

		if (frase1.length() < frase2.length()) {
			System.out.println("La segunda frase es mayor");
		} else if (frase2.length() < frase1.length()) {
			System.out.println("La primera frase es mayor");
		} else {
			System.out.println("Las frases on iguales");
		}
		
		sc.close();
	}

}
