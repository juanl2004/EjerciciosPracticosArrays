package arraysfunciones;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Creamos el Scanner para solicitar números al usuario.
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario la longitud de la tabla.
		System.out.print("Introduce la longitud de la tabla --> ");
		int longitud = sc.nextInt();

		// Solicitamos al usuario el valor hasta donde generar números.
		System.out.print("Introduce el valor hasta donde generar números --> ");
		int fin = sc.nextInt();

		// Llamamos al método rellenaPares y imprimimos el resultado.
		System.out.println(Arrays.toString(Ejercicio3.rellenaPares(longitud, fin)));

		// Cierre de Scanner
		sc.close();
	}

	// Función que se encarga de generar números pares dentro del array especificado
	// y hasta el valor especificado.
	public static int[] rellenaPares(int longitud, int fin) {

		//Creamos una tabla con la longitud especificada.
		int[] j = new int[longitud];

		//Recorremos el array y lo vamos rellennado de números.
		for (int i = 0; i < j.length; i++) {

			//Geneneramos números aleatorios dentro del rango especificado.
			j[i] = (int) (Math.random() * (fin - 2) + 2);

			// Verificar si el número generado es par.
			while (j[i] % 2 != 0) {
				// Generar otro número si el anterior no es par.
				j[i] = (int) (Math.random() * (fin - 1) + 2);
			}

		}

		//Devolvemos la tabla modificada.
		return j;

	}

}
