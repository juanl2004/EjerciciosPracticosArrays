package arraysstrings;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        String frase;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase --> ");
        frase = sc.nextLine();

        frase.toLowerCase();
        
        if (Ejercicio8.esPalindroma(frase)) {
            System.out.println("La frase es palíndroma.");
        } else {
            System.out.println("La frase no es palíndroma.");
        }
    }

    public static boolean esPalindroma(String frase) {

    frase.toLowerCase();
    
     String fraseInvertida = "";
     
     boolean palindroma = false;
     
     for (int i = frase.length()-1; i >= 0; i--) {
    	 fraseInvertida += frase.charAt(i);
     }
     
     if (frase.replace(" ", "").equals(fraseInvertida.replace(" ", ""))) {
    	 palindroma = true;
     }
     
     return palindroma;
    }
}


