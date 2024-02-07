package arraysfunciones;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Creamos la tabla y le introducimos los valores por parametros.
		int tabla[] = { 4, 2, 8, 6, 10 };

		// En esta variable llamamos a la función suma para que nos devuelva el
		// resultado.
		int resultado = Ejercicio1.suma(tabla);

		// Imprimimos el valor del resultado.
		System.out.println("Suma --> " + resultado);
	}

	// Creamos la función suma y como parametro de entrada la tabla.
	public static int suma(int tabla[]) {

		// Declaramos la variable suma para almacenar el resultado de la operación.
		int suma = 0;

		// Realizamos un for:each para recorrer la tabla y resolver todos sus numeros.
		for (int numero : tabla) {
			// Realizamos la suma.
			suma += numero;
		}

		// Devolvemos el resultado de la suma.
		return suma;
	}
}