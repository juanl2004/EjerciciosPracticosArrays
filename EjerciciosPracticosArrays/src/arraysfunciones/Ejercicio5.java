package arraysfunciones;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Creamos un array de enteros con una longitud de 10.
		int t[] = { 2, 5, 7, 2, 10, 10, 7, 6, 5, 2 };

		// Creamos la variable valor donde se guardará el valor que deseamos encontrar.
		int valor;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca el valor que desea encontrar.
		System.out.println("Introduce el valor que deseas encontrar --> ");
		valor = sc.nextInt();

		// Llamamos a la función buscarTodos
		int[] resultado = Ejercicio5.buscarTodos(t, valor);

		// Imprimimos el resultado devuelto por la función.
		System.out.println(Arrays.toString(resultado));

		// Cierre de Scanner
		sc.close();
	}

	// En esta función recorremos el array para buscar todas las veces en la que
	// aparece el valor introducido y devolvemos otro array con la posición donde se
	// encuentran.
	public static int[] buscarTodos(int t[], int valor) {

		int posicion = 0;
		int contador = 0;

		// Contamos cuantas veces aparece el valor en el array.
		for (int i = 0; i < t.length; i++) {

			if (t[i] == valor) {
				contador++;
			}
		}

		// Creamos un array para almacenar las posiciones de los valores repetidos.
		int indices[] = new int[contador];

		// Almacenamos las posiciones de los números en el array indices.
		for (int j = 0; j < t.length; j++) {

			if (t[j] == valor) {
				indices[posicion++] = j;
			}
		}

		// Devolvemos el array con las posiciones del número repetido.
		return indices;
	}

}
