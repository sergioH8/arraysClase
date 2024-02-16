package arrays;

import java.util.Scanner;

public class Ejercicio09 {
	/*
	 * Crea una aplicación que pida un numero por teclado y después comprobaremos si
	 * el número introducido es capicúa, es decir, que se lee igual sin importar la
	 * dirección. Por ejemplo, si introducimos 30303 es capicúa, si introducimos
	 * 30430 no es capicúa. Piensa como puedes dar la vuelta al número. Una forma de
	 * pasar un número a un array es esta
	 * Character.getNumericValue(cadena.charAt(posición)).
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero");

		int numero = sc.nextInt();

		if (esCapicua(numero)) {
			System.out.println("Es un numero capicua");
		} else {
			System.out.println("No es capicua");
		}
	}

	public static boolean esCapicua(int numero) {

		int auxiliar = numero;
		int numeroInvertido = 0;

		while (auxiliar > 0) {
			int resto = auxiliar % 10;
			auxiliar = auxiliar / 10;
			numeroInvertido = numeroInvertido * 10 + resto;
		}
		if(numeroInvertido == numero) {
			return true;
		}
		return false;

	}
}
