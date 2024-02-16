package arraysBidimensionales;

import java.util.Random;
import java.util.Scanner;

/* Hacer un programa que seleccione el mayor de los números de una lista numérica de 20 elementos,
 * generados aleatoriamente y lo lleve a la última posición, no se debe perder ninguno de los números de la lista
 * */

public class Ejercicio04 {

	public static final int MAYORDELALISTA = 100;

	public static void main(String[] args) {
		int[] lista = new int[obtenerTamanoLista()];
		rellenarArray(lista);
		mostrarArray(lista);
		System.out.println();
		sacarMayorAlFinal(lista);
		mostrarArray(lista);
	}

	public static int[] sacarMayorAlFinal(int[] lista) {
	    int indiceMayor = 0;
	    int valor = lista[indiceMayor];
	    
	    // Encontrar el índice del número mayor
	    for (int i = 0; i < lista.length; i++) {
	        if (lista[i] > lista[indiceMayor]) {
	            indiceMayor = i;
	            valor = lista[i];
	        }
	    }

	    // Intercambiar el número mayor con el último elemento
	    lista[indiceMayor] = lista[lista.length - 1];    // igualamos el indice al ultimo para guardar el ultimo en este lugar
	    lista[lista.length - 1] = valor;				// el ultimo lo transformamos en el valor grande que guardamos anteriormente

	    return lista;
	}

	public static int obtenerTamanoLista() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe un tamaño para la lista: ");
		return sc.nextInt();

	}

	public static void rellenarArray(int nums[]) {
		Random random = new Random();
		for (int i = 0; i < nums.length; i++) {
			nums[i] = random.nextInt(MAYORDELALISTA);

		}
	}

	public static void mostrarArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.println(" " + nums[i] + " ");
		}

	}
}
