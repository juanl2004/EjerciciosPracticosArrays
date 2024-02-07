package ejerciciosarrays;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Creamos una tabla llamada "num" con una longitud determinada (12).
		int num[] = new int[12];

		// Aqui indicamos el valor que le damos a cada indice en la tabla num.
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;

		// Con este for imprimimos la tabla num.
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

	}

}
