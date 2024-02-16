package arraysBidimensionales;
/* Crear una matriz de 5 filas y n columnas (se pide al usuario). Rellenarlo con números aleatorios entre 0 y 10 */

import java.util.Random;
import java.util.Scanner;

public class Ejercicio02 {

	public static final int filas = 5;
	public static final int MENOR = 0;
	public static final int MAYOR = 10;

	public static void main(String[] args) {
		
		int[][] numeros = new int[filas][obtenerTamañoColumnas()];
		rellenarArray(numeros);
		mostrarArray(numeros);
		
	}
	 public static int obtenerTamañoColumnas() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Escribe un tamaño para las columnas: ");
	        return sc.nextInt();
	        
	    }

	public static void mostrarArray(int[][] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(" " + nums[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void rellenarArray(int nums[][]) {
		Random random = new Random();
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = random.nextInt(MAYOR + 1); // Sumamos +1 para que el 10 este inclusivo en el rango

			}
		}
		
	}
	
}
