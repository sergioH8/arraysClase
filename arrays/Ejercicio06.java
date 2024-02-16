package arrays;
/*Crea dos arrays de números con un tamaño pasado por teclado.

Uno de ellos estará rellenado con números aleatorios y el otro será copia del anterior,
 después crea un nuevo array con el tamaño pasado por teclado.

Después, crea un método que tenga como parámetros, los dos arrays y devuelva uno 
nuevo con la multiplicación de la posición 0 del array1 con el del array2 y así 
sucesivamente, quedará almacenado en el tercer array. Por último, muestra el contenido
 de cada array.*/

import java.util.Random;
import java.util.Scanner;

public class Ejercicio06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Pedir al usuario el tamaño del array
		System.out.print("Ingrese el tamaño del primer array: ");
		int tamano1 = sc.nextInt();
		int[] lista1 = generaArrayAleatorio(tamano1);

		int[] lista2 = lista1.clone(); // Hacemos un clone de : lista1

		int[] resultado = generaNuevoArray(lista1, lista2);
		
	
		
		mostrarArrays(resultado, resultado, resultado);
		
		
	}

	public static int[] generaArrayAleatorio(int tamano) {
		
		Random rand = new Random();
		int[] numeros = new int[tamano];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rand.nextInt(10); // Genera un número aleatorio entre 0 y 9
		}

		return numeros;
	}

	public static int[] generaNuevoArray(int[] lista1, int[] lista2) {
	    int[] lista3 = new int[lista1.length];  

	    for (int i = 0; i < lista1.length; i++) {
	        lista3[i] = lista1[i] + lista2[i];  // Sumamos los indices de las dos listas anteriores para la nueva lista
	    }

	    return lista3;
	}


	private static void mostrarArray(int[] array) {
		
	    for (int i = 0; i < array.length; i++) {
	        System.out.println("El índice " + i + "  tiene el valor " + array[i]);
	    }
	}

	private static void mostrarArrays(int[] lista1, int[] lista2, int[] lista3) {
		System.out.println("Mostrando los tres arrays...");
		System.out.println("Primer array");
	    mostrarArray(lista1);
	    System.out.println("Segundo array");
	    mostrarArray(lista2);
	    System.out.println("Tercer array");
	    mostrarArray(lista3);
	}

	 
}
