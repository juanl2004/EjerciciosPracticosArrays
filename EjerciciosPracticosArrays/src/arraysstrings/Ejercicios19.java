package arraysstrings;

import java.util.Scanner;

/**
 * Esta clase convierte una frase en formato camelCase.
 */
public class Ejercicios19 {

    /**
     * Método main que solicita al usuario una frase y la convierte en camelCase.
     */
    public static void main(String[] args) {
        // Variable que almacena la frase introducida por el usuario.
        String frase;

        //Creamos el Scanner para leer por teclado.
        Scanner sc = new Scanner(System.in);

        // Le pedimos al usuario que introduzca una frase.
        System.out.println("Introduce una frase --> ");
        frase = sc.nextLine();

        //Llamamos a la función y imprimimos el resultado.
        System.out.println(fraseCamel(frase));

        // Cierre de Scanner
        sc.close();
    }

    /**
     * Convierte una frase en formato camelCase.
     * @param frase La frase a convertir introducida por el usuario.
     * @return La frase convertida en camelCase.
     */
    public static String fraseCamel(String frase) {
        // Dividimos la frase en palabras.
        String[] palabras = frase.split(" ");
        // Variable para almacenar el resultado en camelCase.
        String resultado = "";

        // Variables temporales para almacenar la palabra, la primera letra y el resto de la palabra.
        String palabra = "";
        String primeraLetra = "";
        String restoPalabra = "";

        // Recooremos sobre cada palabra en la frase.
        for (int i = 0; i < palabras.length; i++) {
            // Obtenemos la palabra actual.
            palabra = palabras[i];
            // Convertimos la primera letra de la palabra a minúscula.
            primeraLetra = palabra.substring(0, 1).toLowerCase();
            // Obtenemos el resto de la palabra en minúsculas.
            restoPalabra = palabra.substring(1).toLowerCase();
            // Concatenar la primera letra en minúscula (o mayúscula si no es la primera palabra) con el resto de la palabra.
            resultado += (i == 0 ? primeraLetra : primeraLetra.toUpperCase()) + restoPalabra;
        }

        // Devolver la frase en camelCase.
        return resultado;
    }
}
