package examen2023;

import java.util.Arrays;

public class Golosinas {

	public static String[][] nombresGolosinas = { { "KitKat", "Chicles de fresa", "Lacasitos", "Palotes" },
			{ "Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix" },
			{ "Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta" },
			{ "Lacasitos", "Crunch", "Milkybar", "KitKat" } };

	public static double[][] precio = { { 1.1, 0.8, 1.5, 0.9 }, { 1.8, 1, 1.2, 1 }, { 1.8, 1.3, 1.2, 0.8 },
			{ 1.5, 1.1, 1.1, 1.1 } };

	public static int[][] cantidades = new int[4][4];

	public static String[] ventas = new String[0];

	public static double precioTotal = 0;

	public static void rellenarMatriz(int num) {
		for (int i = 0; i < cantidades.length; i++) {
			for (int j = 0; j < cantidades[i].length; j++) {
				cantidades[i][j] = num;
			}
		}
	}

	public static void mostrarGolosinas() {
		for (int i = 0; i < nombresGolosinas.length; i++) {
			for (int j = 0; j < nombresGolosinas[i].length; j++) {
				System.out.println("Código: " + i + ", " + j + " - Nombre: " + nombresGolosinas[i][j] + " - Precio: "
						+ precio[i][j]);
			}
		}
	}

	public static boolean validarPosicion(int fila, int columna) {
		if (fila < 0 || fila > 3 || columna < 0 || columna > 3) {
			return false;
		}

		return true;
	}

	public static boolean hayValorPosicion(int fila, int columna) {
		if (cantidades[fila][columna] <= 0) {
			return false;
		}

		return true;
	}

	public static void aumentarPosicion(int fila, int columna, int cantidad) {
		cantidades[fila][columna] += cantidad;
	}

	public static void reducirPosicion(int fila, int columna, int cantidad) {
		int cantidadActual = cantidades[fila][columna];
		int cantidadResultante = cantidadActual - cantidad;

		if (cantidadResultante <= 0) {
			cantidades[fila][columna] = 0;
		} else {
			cantidades[fila][columna] = cantidadResultante;
		}
	}

	public static void anyadirVentas(int fila, int columna) {
		
		int tamanio = ventas.length + 1;
		
		if (tamanio > 1) {
			String[] copia = Arrays.copyOf(ventas, ventas.length);
			
			ventas = new String[tamanio];
			
			//copia = kitkat - tiburon
			
			//ventas = kitkat - tiburon
			// ventas = null - null - null
			
			for (int i = 0; i < ventas.length; i++) {
				if (i < ventas.length - 1) {
					// ventas = kitkat
					// ventas = kitkat - tiburon
					ventas[i] = copia[i];
				} else {
					// ventas = kitkat - tiburon - patata
					ventas[i] = ventas[tamanio - 1] = nombresGolosinas[fila][columna];
				}
			}
		} else {
			ventas = new String[tamanio];

			ventas[tamanio - 1] = nombresGolosinas[fila][columna];
		}
		

		precioTotal += precio[fila][columna];
	}

	public static void imprimirVentasTotales() {
		int cont = 0;

		for (int i = 0; i < ventas.length; i++) {
			System.out.print(ventas[i] + " - ");
			cont++;

			if (cont == 5) {
				System.out.println();
				cont = 0;
			}
		}
		
		System.out.println();
		
		System.out.println("Ventas totales: " + precioTotal + "€");
	}

}