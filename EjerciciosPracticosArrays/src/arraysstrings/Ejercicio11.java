package arraysstrings;

import java.util.Scanner;

/**
 * Esta clase codifica una palabra introducida por el usuario utilizando un
 * conjunto de caracteres original y otro conjunto de caracteres codificados.
 */
public class Ejercicio11 {

    /**
     * Método principal que solicita al usuario una palabra y la codifica utilizando
     * los conjuntos de caracteres CONJUNTO1 y CONJUNTO2.
     */
    public static void main(String[] args) {

        // Conjunto de caracteres original.
        final char[] CONJUNTO1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
        // Conjunto de caracteres codificado
        final char[] CONJUNTO2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };

        // Almacenamos la palabra introducida por el usuario.
        String palabra = "";

        // Almacenamos la palabra introducida por el usuario en minúsculas.
        String palabraMinusculas = "";

        // Variable para almacenar la palabra codificada.
        String palabraCodificada = "";

        // Variable temporal para procesar cada caracter de la palabra.
        char caracterTemp;

        // Índice para recorrer la palabra.
        int i = 0;

        // Creamos el Scanner para pedir por teclado.
        Scanner sc = new Scanner(System.in);

        // Solicitamos al usuario que introduzca una palabra.
        System.out.println("Introduce una palabra --> ");
        palabra = sc.next();

        // Convertimos la palabra a minúsculas.
        palabraMinusculas = palabra.toLowerCase();

        // Procesamos cada caracter de la palabra.
        while (i != palabra.length()) {
            // Tomamos un caracter de la palabra convertida a minúsculas.
            caracterTemp = palabraMinusculas.charAt(i);

            // Codificamos el caracter y lo agregamos a la palabra codificada.
            palabraCodificada += codifica(CONJUNTO1, CONJUNTO2, caracterTemp);

            // Incrementamos el índice para avanzar al próximo caracter de la palabra.
            i++;
        }

        // Imprimimos la palabra codificada.
        System.out.println(palabraCodificada);

        // Cerramos el objeto Scanner.
        sc.close();
    }

    /**
     * Codifica un caracter según los conjuntos de caracteres dados.
     * 
     * @param CONJUNTO1    Conjunto de caracteres original.
     * @param CONJUNTO2    Conjunto de caracteres codificado.
     * @param caracterTemp Caracter a codificar.
     * @return Caracter codificado.
     */
    public static char codifica(char[] CONJUNTO1, char[] CONJUNTO2, char caracterTemp) {
        // Inicializamos el caracter codificado con un espacio en blanco.
        char caracterCodificado = ' ';

        // Recorremos el conjunto de caracteres codificado
        for (int i = 0; i < CONJUNTO2.length; i++) {
            // Si el caracter coincide con el caracter en la posición i del conjunto
            // codificado, asignamos el caracter del conjunto original y
            // salimos del bucle con el break.
            if (caracterTemp == CONJUNTO2[i]) {
                caracterCodificado = CONJUNTO1[i];
                break;
            } else {
                // Si el caracter no coincide con ningún caracter del conjunto codificado,
                // guardamos el caracter original.
                caracterCodificado = caracterTemp;
            }
        }

        // Devolvemos el caracter codificado.
        return caracterCodificado;
    }
}
