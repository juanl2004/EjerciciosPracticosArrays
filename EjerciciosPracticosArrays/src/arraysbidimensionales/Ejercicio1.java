package arraysbidimensionales;

public class Ejercicio1 {

	public static void main(String[] args) {
	
	//Creamos la tabla con 3 filas y 6 columnas.
	int num [][] = new int [3][6];

	//Introducimos paso a paso cada una de los valores en la posición especificada.
	num[0][0] = 0;
	num[0][1] = 30;
	num[0][2] = 2;
	num[0][5] = 5;
	num[1][0] = 75;
	num[1][4] = 0;
	num[2][2] = -2;
	num[2][3] = 9;
	num[2][5] = 11;
	
	//Creamos este bucle for para recorrer la tabla y imprimirla en forma bonita.
	for(int[] fila : num) {
		for(int valor : fila) {
			System.out.print(valor + "\t");
		}
		System.out.println();
	}
	
	
	}

}
