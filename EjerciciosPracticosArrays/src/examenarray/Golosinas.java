package examenarray;

public class Golosinas {
	static String[][] nombresGolosinas = { { "KitKat", "Chicles de fresa", "Lacasitos", "Palotes" },
			{ "Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix" },
			{ "Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta" },
			{ "Lacasitos", "Crunch", "Milkybar", "KitKat" } };
	static double[][] precio = { { 1.1, 0.8, 1.5, 0.9 }, { 1.8, 1, 1.2, 1 }, { 1.8, 1.3, 1.2, 0.8 },
			{ 1.5, 1.1, 1.1, 1.1 } };
	static int[][] cantidades = new int[nombresGolosinas.length][nombresGolosinas[0].length];
	static String[] ventas = new String[100];
	static double total = 0;

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
				System.out.println(
						"Código: " + i + "" + j + ", Nombre: " + nombresGolosinas[i][j] + ", Precio: " + precio[i][j]);
			}
		}
	}

	public static boolean validarPos(int fila, int columna) {
		return fila >= 0 && fila < nombresGolosinas.length && columna >= 0 && columna < nombresGolosinas[0].length;
	}

	public static boolean hayValorPosicion(int fila, int columna) {
		return cantidades[fila][columna] > 0;
	}

	public static void aumentarPosicion(int fila, int columna, int cantidad) {
		cantidades[fila][columna] += cantidad;
	}

	public static void reducirPosicion(int fila, int columna, int cantidad) {
		cantidades[fila][columna] -= cantidad;
	}

	public static void anyadirVenta(int fila, int columna) {
		int totalVentas = 0;
		ventas[totalVentas] = nombresGolosinas[fila][columna];
		total += precio[fila][columna];
	}

	public static void imprimirVentasTotales() {
		System.out.println("Ventas realizadas:");
		int totalVentas = 0;
		for (int i = 0; i < totalVentas; i++) {
			System.out.println("- " + ventas[i]);
		}
		System.out.println("Total: " + total);
	}
}
