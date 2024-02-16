package arraysBidimensionales;

import java.util.Random;

/*
Diseñar un programa que:

a) Cree un array bidimiensional de longitud 5 x 15 (filas ´ columnas) y nombre ‘marco’.

b) Cargue el array con dos únicos valores 0 y 1, donde el valor 1
   ocupará las posiciones o elementos que delimitan el array, es decir, las más externas,
   mientras que el resto de los elementos contendrán el valor 0.

c) Visualiza el contenido de la matriz en pantalla

1 1 1 1 1 1 1 1 1 1 1 1 1 1 1

1 0 0 0 0 0 0 0 0 0 0 0 0 0 1

1 0 0 0 0 0 0 0 0 0 0 0 0 0 1

1 0 0 0 0 0 0 0 0 0 0 0 0 0 1

1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 */
public class Ejercicio03 {

	public static void main(String[] args) {
		int[][] marco = new int[5][15];
		
		rellenarArray(marco);
		mostrarArray(marco);
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
				nums[i][j] = random.nextInt(2);
				if ((i == 0 || i == nums.length - 1) || (j == 0 || j == nums[i].length - 1)) {
					nums[i][j] = 1;
				} else {
					nums[i][j] = 0;
				}

			}
		}

	}
}
