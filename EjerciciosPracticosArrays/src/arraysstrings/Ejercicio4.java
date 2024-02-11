package arraysstrings;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		String frase;
		String[] palabra;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce una frase --> ");
		frase = sc.nextLine();
		
		palabra = frase.split(" ");
		
		Arrays.sort(palabra);
		
		System.out.print("Palabras ordenadas --> ");
        for (String palabras : palabra) {
            System.out.print(palabras + " ");
        }
        
		
		sc.close();
	}

}
