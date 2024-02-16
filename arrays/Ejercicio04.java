package arrays;

/*
 * Crea un array de caracteres que contenga de la ‘A’ a la ‘Z’ (solo las
 * mayúsculas). Después, ve pidiendo posiciones del array por teclado y si la
 * posición existe en el array, el valor se añadirá a una cadena que se mostrara
 * al final, se dejará de insertar cuando se introduzca un -1.
 * 
 * Por ejemplo, si escribo los siguientes números
 * 
 * · 0 //Añadirá la ‘A’
 * 
 * · 5 //Añadirá la ‘F’
 * 
 * · 25 //Añadirá la ‘Z’
 * 
 * · 50 //Error, inserte otro numero
 * 
 * · -1 //fin
 * 
 * Cadena resultante: AFZ
 */
import java.util.Scanner;
import java.util.Random;

public class Ejercicio04 {
	public static void main(String[] args) {
		Random random = new Random();

		// Tamaño del array igual al número de letras del alfabeto (26)
		int tamanoArray = 26;
		char letraInicial = 'A';
		char[] letras = new char[tamanoArray];

	
		for (int i = 0; i < letras.length; i++) {	// Inicializar el array con las letras del alfabeto
			letras[i] = (char) (letraInicial + i); // Casteamos el resultado en un char para la array
		}

		// Crear cadena para almacenar los valores
		String cadenaResultante = "";

		Scanner scanner = new Scanner(System.in);

		// Pedir posiciones por teclado hasta que se introduce -1
		int posicion;
		do {
			System.out.print("Introduce una posición (0-" + (tamanoArray - 1) + ") o -1 para salir: ");
			posicion = scanner.nextInt();

			if (posicion >= 0 && posicion < tamanoArray) {

				cadenaResultante = cadenaResultante + letras[posicion];
			} else if (posicion != -1) {
				System.out.println(
						"Error, inserta otro número. La posición debe estar entre 0 y " + (tamanoArray - 1) + ".");
			}
		} while (posicion != -1);

		System.out.println("Cadena resultante: " + cadenaResultante);
	}
}
