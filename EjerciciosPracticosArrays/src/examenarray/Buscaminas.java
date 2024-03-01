package examenarray;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Buscaminas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean error = true;
		
		while (error) {
			System.out.println("Introduce las filas y columnas que debe tener el tablero");
			
			try {
				int f = sc.nextInt();
				int c = sc.nextInt();
				
				error = false;
				
				int[][] tablero = new int[f][c];
				
				String[][] tableroVisible = new String[f][c];
				
				int minasEncontradas = 0;

				inicializarTablero(tablero);
				
				inicializarTableroVisible(tableroVisible);
				
				crearMinas(tablero, 5);
				
				while (minasEncontradas < 5) {
					imprimirTablero(tableroVisible);
					
					System.out.println("Ingrese las coordenadas (fila 0 a " + (f - 1) + ") - (columna 0 a " + (c - 1) + ")");
					
					try {
						int fila = sc.nextInt();
						int columna = sc.nextInt();
						
						if (fila < 0 || fila > (f - 1) || columna < 0 || columna > (c - 1)) {
							System.out.println("Vuelve a intentarlo. Coordenadas incorrectas");
						} else {
							if (tablero[fila][columna] == 1) {
								System.out.println("Has encontrado una mina");
								minasEncontradas++;
								tableroVisible[fila][columna] = "*";
							} else {
								System.out.println("No has encontrado una mina");
								tableroVisible[fila][columna] = " ";
							}
						}
						
					} catch(InputMismatchException e) {
						System.out.println("Error, has introducido caracteres.");
						sc.nextLine();
					}
					
				}
				
				System.out.println("Has ganado");

				
			} catch (InputMismatchException e){
				System.out.println("Error, no has introducido lo que debes de introducir.");
				error = true;
				sc.nextLine();
			}
		}
		
	}

	public static void inicializarTablero(int[][] tab){
		for (int[] fila : tab) {
			Arrays.fill(fila, 0);
		}
	}
	
	public static void inicializarTableroVisible(String[][] vis) {
		for(String[] fila: vis) {
			Arrays.fill(fila, "#");
		}
	}
	
	public static void crearMinas(int[][] tab, int numMinas) {
		Random ran = new Random();
		
		int minasColocadas = 0;
		
		while (numMinas > minasColocadas) {
			int fila = ran.nextInt(tab.length);
			int columna = ran.nextInt(tab[0].length);
			
			if (tab[fila][columna] != 1) {
				tab[fila][columna] = 1;
				minasColocadas++;
			}
		}
	}
	
	public static void imprimirTablero(String[][] tab) {
		System.out.println("Tablero: ");
		for (String[] fila : tab) {
			for (String celda : fila) {
				System.out.print(celda + " ");
			}
			System.out.println();
		}
	}
}

