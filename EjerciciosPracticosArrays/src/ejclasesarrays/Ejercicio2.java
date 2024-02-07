package ejclasesarrays;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Declaramos la variable inicio para guardar el valor del indice desde donde
		// empezar.
		int inicio = 0;
		// Declaramos la variable fin para guardar el valor del indice que indica donde
		// debemos de parar.
		int fin = 0;

		// Creamos la tabla con una longitud determinada de 55.
		int tabla[] = new int[55];

		// Mediante este bucle for conseguimos contar hasta diez, implementando el
		// número tanta veces como el valor de el, en el caso del 2 se repite 2
		// veces.
		for (int i = 1; i <= 10; i++) {
			// En cada vuelta al fin se le sumará su cantidad mas el valor del
			// número, así sabemos hasta donde llegar.
			fin += i;
			// Luego con la clase fill completamos el número tantan veces como indican
			// inicio y fin que se modificará en cada vuelta.
			Arrays.fill(tabla, inicio, fin, i);
			// Inicio sigue la misma lógica que la variable fin.
			inicio += i;
		}

		//Imprimimos la tabla.
		System.out.println(Arrays.toString(tabla));

	}

}