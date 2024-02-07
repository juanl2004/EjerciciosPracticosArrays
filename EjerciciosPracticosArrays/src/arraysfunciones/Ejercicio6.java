package arraysfunciones;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		// Definimos un array con 6 números enteros.
		int t[] = { 10, 1, 5, 8, 9, 2 };

		// Declaramos esta variable para saber el número de elementos a agrupar para la
		// suma.
		int numElementos;

		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario en cuanto quiere que se agrupen los números.
		System.out.print("Introduce en cuanto quieres que se agrupen los numeros a sumar --> ");
		numElementos = sc.nextInt();

		// Llamamos a la función para obtener el resultado.
		int[] resultado = Ejercicio6.suma(t, numElementos);

		// Imprimimos el array devuelto por la función.
		System.out.println(Arrays.toString(resultado));

		// Cierre de Scanner.
		sc.close();
	}

	// En esta función sumamos los grupos de números y los mostramos en otro array.
	public static int[] suma(int t[], int numElementos) {

		// Creamos un nuevo array para almacenar los resultados de las sumas. De la
		// longitud necesaria dado el caso.
		int sumaTotal[] = new int[t.length - numElementos + 1];

		// Creamos esta variable para almacenar la suma de los números momentaneamente.
		int suma;

		// Realizamos la suma de grupos de números y almacenamos los resultados en el nuevo array.
		for (int i = 0; i < sumaTotal.length; i++) {
			suma = 0;

			for (int j = 0; j < numElementos; j++) {
				suma += t[i + j];
			}
			sumaTotal[i] = suma;
		}

		//Devolvemos el nuevo array con las sumas de números.
		return sumaTotal;
	}
}
