package arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio03 {
	/*
	 * Crea un array de números de un tamaño pasado por teclado, el array contendrá
	 * números aleatorios primos entre los números deseados, por último, nos indica
	 * cual es el mayor de todos.
	 * 
	 * Haz un método para comprobar que el número aleatorio es primo, puedes hacer
	 * todos los métodos que necesites.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese el tamaño del array:");
		int tamano = sc.nextInt();

		int[] arrayPrimos = generarArrayPrimos(tamano);

		mostrarArray(arrayPrimos);

		int mayor = encontrarMayor(arrayPrimos);
		System.out.println("El mayor de todos es: " + mayor);
	}

	private static int[] generarArrayPrimos(int tamano) {

		int[] arrayPrimos = new int[tamano];
		int i = 0;

		Random rand = new Random();

		while (i < tamano) {
			int numeroAleatorio = rand.nextInt(Integer.MAX_VALUE) + 1;  //Utilizo max/value para poder contar con el maximo posible de numeros enteros
																		// con el +1 nos aseguramos que no sea 0

			if (esPrimo(numeroAleatorio)) {
				arrayPrimos[i] = numeroAleatorio;
				i++;
			}
		}

		return arrayPrimos;
	}

	private static boolean esPrimo(int numeroAleatorio) {
	    // Verifica si el número es menor que 2, ya que los números primos son mayores o iguales a 2
	    if (numeroAleatorio < 2) {
	        return false; // El número no es primo
	    }

	    // Itera desde 2 hasta la raíz cuadrada del número (inclusive)
	    for (int i = 2; i <= Math.sqrt(numeroAleatorio); i++) {
	        // Comprueba si el número es divisible por i
	        if (numeroAleatorio % i == 0) {
	            return false; // El número no es primo, ya que es divisible por i
	        }
	    }

	    // Si el bucle no encontró ningún divisor, el número es primo
	    return true; // El número es primo
	}
	private static void mostrarArray(int[] array) {
		System.out.println("Array de números primos generados:");
		for (int i = 0; i < array.length; i++) {
			System.out.println("Índice " + i + ": " + array[i]);
		}
	}

	private static int encontrarMayor(int[] array) {
		int mayor = Integer.MIN_VALUE; // Inicializo la variable al valor minimo entero posible

		for (int i = 0; i < array.length; i++) {
			if (array[i] > mayor) {
				array[i]=mayor;
			}
		}

		return mayor;
	}
}