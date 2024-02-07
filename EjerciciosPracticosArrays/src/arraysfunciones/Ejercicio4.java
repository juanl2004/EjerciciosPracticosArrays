package arraysfunciones;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Creamos un array de 7 números y una clave que debe de aparecer.
		int[] t = { 1, 3, 5, 7, 10, 15, 19 };
		int clave = 19;

		// Llamamos a la función.
		int resultado = Ejercicio4.buscar(t, clave);

		// Comprobamos si el resultado que nos devuelve la función es distinto a -1, si
		// es así es que hemos encontrado la clave en el array.
		if (resultado != -1) {
			System.out.println("La clave " + clave + " se encuentra en la posicion --> " + resultado);
			// Si no, devuelve -1, y significa que no la hemos encontrado.
		} else {
			System.out.println("La clave " + clave + " no se encuentra en la tabla");
		}
	}

	// En esta función buscamos la clave introducida en un array.
	public static int buscar(int t[], int clave) {

		// Recorremos cada posoción de array.
		for (int i = 0; i < t.length; i++) {
			// Y vamos comprobando hasta que algun vaor sea igual a la clave.
			if (t[i] == clave) {
				// Si se encuentra, devolvemos la posición
				return i;
			}
		}

		// Si la clave no se encuentra, devolvemos el -1.
		return -1;

	}

}
