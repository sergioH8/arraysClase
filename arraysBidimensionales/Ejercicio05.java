package arraysBidimensionales;

import java.util.Random;
import java.util.Scanner;

/* Crear dos matrices de nxn y sumar sus valores, los resultados se deben almacenar en otra matriz.
 * Los valores y la longitud, serán insertados por el usuario. Mostrar las matrices originales y el resultado.
 * 
 */

public class Ejercicio05 {
	public static final int MAYORDELALISTA = 10;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Creamos la primera lista");
		
		int[][] lista1 = crearNuevoArray();
		rellenarArray(lista1);
		System.out.println("Creamos la segunda lista");
		int[][] lista2 = new int [lista1.length][lista1[0].length];
		rellenarArray(lista2);
		System.out.println("Creamos la tercera lista");
		int[][] lista3 = sumarArray(lista1, lista2);
		mostrarArrays(lista1, lista2, lista3);

	}

	public static void rellenarArray(int nums[][]) {
		Random random = new Random();
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = random.nextInt(MAYORDELALISTA );
			}
		}
	}

	public static int[][] crearNuevoArray() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un tamaño para x");
		int x = sc.nextInt();
		System.out.println("Escribe un tamaño para y  ");
		int y = sc.nextInt();
		int[][] numeros1 = new int[x][y];
		return numeros1;

	}

	public static void mostrarArray(int[][] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(" " + nums[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] sumarArray(int[][] nums, int[][] nums2) {
		 if (nums.length != nums2.length || nums[0].length != nums2[0].length) {
		        System.out.println("Las matrices no tienen las mismas dimensiones");
		        return null;
		    }
		int[][] lista3 = new int[nums.length][nums[0].length];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {

				lista3[i][j] = nums[i][j] + nums2[i][j];

			}

		}

		return lista3;
	}

	private static void mostrarArrays(int[][] lista1, int[][] lista2, int[][] lista3) {
		System.out.println("Mostrando los tres arrays...");
		System.out.println("Primer array");
		mostrarArray(lista1);
		System.out.println("Segundo array");
		mostrarArray(lista2);
		System.out.println("Tercer array");
		mostrarArray(lista3);
	}
}
