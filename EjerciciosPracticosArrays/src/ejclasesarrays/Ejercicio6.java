package ejclasesarrays;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		// Creamos esta variable para ir guardando el valor que va generando
		// aleatoriamente.
		int numero = 0;
		// Creamos esta variable para hacer una copia de la variable i dentro del for y
		// poder usarla fuera.
		int indiceBusqueda = 0;
		// Declaramos esta variable para guardar el valor que ha introducido el usuario.
		int valor;
		// Declaramos contador para registrar las veces en la que apararece el núméro en
		// la tabla.
		int contador = 0;

		// Creamos una tabla llamada "tabla" de longitud 1000.
		int tabla[] = new int[1000];

		// Creamos el Scanner ya que tenemos que pedir un número al usuario
		Scanner sc = new Scanner(System.in);

		// Mediante este for recorremos la tabla entera y en cada vuelta vamos
		// completanto un espacio con un valor aleatorio.
		for (int i = 0; i < tabla.length; i++) {
			// En la variable número guardamos los números aleatorios que se van generando
			// entre 1 y 100.
			numero = (int) (Math.random() * 100);
			// Los vamos almacenando en la tabla.
			tabla[i] = numero;
		}

		// Le pedimos al usuario que introduzca el número que desea buscar en la tabla.
		System.out.println("Introduce el número que deseeas buscar --> ");
		// Leemos el número introducido.
		valor = sc.nextInt();

		// Mediante este bucle for recorremos la tabla de inicio a fin.
		for (int i = 0; i < tabla.length; i++) {

			// Comprobamos si alguno de los valores guardados en nuestra tabla son iguales
			// al número introducido por el usuario. Si es así la variable "indiceBusqueda"
			// es igual a la variable "i", para saber si existen o no el número introducido.
			// Y contador++ para registrar cuantas veces se repite el número en la tabla.
			if (tabla[i] == valor) {
				indiceBusqueda = i;
				contador++;
			}
		}

		// Con este condicional conseguimos imprimir si el valor que hemos introducido
		// no aparace en el caso de que contador sea igual a 0.
		if (contador == 0) {
			System.out.println("El elemento " + valor + " no se encuentra en la tabla.");

			// Si indice de busqueda es mayor que 0 entonces se imprirá cuantas veces se
			// repite el número introducido por el usuario e la tabla.
		} else if (indiceBusqueda >= 0) {
			System.out.print("El valor " + valor + " se encuentra " + contador + " veces.");

		}
		
		// Cierre de Scanner
		sc.close();
	}

}
