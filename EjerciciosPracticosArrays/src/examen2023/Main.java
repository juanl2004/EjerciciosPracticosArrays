package examen2023;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Golosinas.rellenarMatriz(5);
		
		int opcion = 0;
		int fila = 0;
		int columna = 0;
		int cantidad = 0;
		
		while(opcion != 4) {
			System.out.println("--MENU--");
			System.out.println("1. Mostrar golosinas -->");
			System.out.println("2. Pedir golosina -->");
			System.out.println("3. Rellenar golosinas (Técnicos)-->");
			System.out.println("4. Apagar máquina -->");
			
			System.out.print("Introduce una opción: ");
			opcion = sc.nextInt();
			
			switch(opcion) {
				case 1:
					Golosinas.mostrarGolosinas();
					break;
				case 2:	
					System.out.println("Introduce la fila: ");
					fila = sc.nextInt();
					
					System.out.println("Introduce la columna: ");
					columna = sc.nextInt();
					
					if (Golosinas.validarPosicion(fila, columna)) {
						if (Golosinas.hayValorPosicion(fila, columna)) {
							Golosinas.reducirPosicion(fila, columna, 1);
							Golosinas.anyadirVentas(fila, columna);
							
							System.out.println("Compra realizada");
						} else {
							System.out.println("Error. No queda esta chuchería");
						}
					} else {
						System.out.println("Error. posicion inválida");
					}
					break;
				case 3:
					String contrasena = "";
					
					sc.nextLine();
					
					System.out.println("Introduzca la contraseña: ");
					contrasena = sc.nextLine();
					
					if(contrasena.equals("Maquina2023")) {
						
						System.out.println("Introduce la fila: ");
						fila = sc.nextInt();
						
						System.out.println("Introduce la columna: ");
						columna = sc.nextInt();
						
						System.out.println("Introduce la cantidad que deseas añadir: ");
						cantidad = sc.nextInt();
						
						if (Golosinas.validarPosicion(fila, columna)) {
							Golosinas.aumentarPosicion(fila, columna, cantidad);
							System.out.println("Añadido correctamente");
						} else {
							System.out.println("Error. posicion inválida");
						}
						
					} else {
						System.out.println("Contraseña incorrecta");
					}
					break;
				case 4:
					Golosinas.imprimirVentasTotales();
					break;
				default :
					System.out.println("Opción invalida.");
					break;
			}
			
		}

	}

}