package examenarray;

import java.util.Scanner;

public class main {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Golosinas.rellenarMatriz(5);

		while (true) {
			System.out.println("Menú:");
			System.out.println("1. Mostrar golosinas");
			System.out.println("2. Pedir golosina");
			System.out.println("3. Rellenar golosinas (Técnico)");
			System.out.println("4. Apagar máquina");

			int opcion = scanner.nextInt();
			switch (opcion) {
			case 1:
				Golosinas.mostrarGolosinas();
				break;
			case 2:
				pedirGolosina();
				break;
			case 3:
				rellenarGolosinas();
				break;
			case 4:
				System.out.println("Apagando máquina...");
				Golosinas.imprimirVentasTotales();
				return;
			default:
				System.out.println("Opción inválida. Inténtalo de nuevo.");
			}
		}
	}

	public static void pedirGolosina() {
		System.out.println("Ingrese la fila de la golosina:");
		int fila = scanner.nextInt();
		System.out.println("Ingrese la columna de la golosina:");
		int columna = scanner.nextInt();

		if (!Golosinas.validarPos(fila, columna)) {
			System.out.println("Posición inválida.");
			return;
		}

		if (!Golosinas.hayValorPosicion(fila, columna)) {
			System.out.println("No hay existencias de esa golosina.");
			return;
		}

		Golosinas.reducirPosicion(fila, columna, 1);
		Golosinas.anyadirVenta(fila, columna);
		System.out.println("Golosina comprada con éxito.");
	}

	public static void rellenarGolosinas() {
		System.out.println("Ingrese la contraseña:");
		String contraseña = scanner.next();
		if (!contraseña.equals("Maquina2023")) {
			System.out.println("Contraseña incorrecta.");
			return;
		}

		System.out.println("Ingrese la fila de la golosina:");
		int fila = scanner.nextInt();
		System.out.println("Ingrese la columna de la golosina:");
		int columna = scanner.nextInt();
		if (!Golosinas.validarPos(fila, columna)) {
			System.out.println("Posición inválida.");
			return;
		}

		System.out.println("Ingrese la cantidad:");
		int cantidad = scanner.nextInt();

		Golosinas.aumentarPosicion(fila, columna, cantidad);
		System.out.println("Golosinas rellenadas con éxito.");
	}
}