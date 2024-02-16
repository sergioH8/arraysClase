package arrays;

import java.util.Scanner;

public class Ejercicio02 {
	/*
	 * Crea un array de números donde le indicamos por teclado el tamaño del array,
	 * rellenaremos el array con números aleatorios entre 0 y 9, al final muestra
	 * por pantalla el valor de cada posición y la suma de todos los valores. Haz un
	 * método para rellenar el array (que tenga como parámetros los números entre
	 * los que tenga que generar), para mostrar el contenido y la suma del array y
	 * un método privado para generar número aleatorio (lo puedes usar para otros
	 * ejercicios).
	 * 
	 * Para la creación de número aleatorios podemos crear:
	 * 
	 * ((int)Math.floor(Math.random()*(a-b)+b))
	 * 
	 * Donde a y b son los números que se van a usar cómo intervalos.
	 */

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ejecutarPrograma();
	}

	private static void ejecutarPrograma() {
		System.out.println("Ingrese el tamaño del array:");
		int tamano = sc.nextInt();

		int[] numeros = generaArrayAleatorio(tamano);

		mostrarArray(numeros);

		int suma = sumaArray(numeros);
		System.out.println("La suma de los elementos es: " + suma);
	}

	public static int[] generaArrayAleatorio(int tamano) {
	
		int[] numeros = new int[tamano];
		
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = ((int)Math.floor(Math.random()*(numeros.length-1)+1));
	
		}

		return numeros;
	}

	private static void mostrarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("El índice " + i + " tiene el valor " + array[i]);
		}
	}

	private static int sumaArray(int[] array) {
		int suma = 0;

		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}

		return suma;
	}
}