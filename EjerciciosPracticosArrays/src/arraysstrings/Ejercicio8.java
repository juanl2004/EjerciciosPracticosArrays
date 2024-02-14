package arraysstrings;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        String frase;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase --> ");
        frase = sc.nextLine();

        if (esPalindroma(frase)) {
            System.out.println("La frase es palíndroma.");
        } else {
            System.out.println("La frase no es palíndroma.");
        }
    }

    public static boolean esPalindroma(String frase) {

        frase = frase.replace(" ", ""); 
        frase = frase.toLowerCase(); 

        System.out.println("Frase sin espacios y en minúsculas: " + frase);

        for (int i = 0; i < frase.length() / 2; i++) {
            char primerCaracter = frase.charAt(i);
            char ultimoCaracter = frase.charAt(frase.length() - i - 1);
            System.out.println("Comparando caracteres: " + primerCaracter + " y " + ultimoCaracter);
            if (primerCaracter != ultimoCaracter) {
                return false;
            }
        }
        return true;
    }
}


