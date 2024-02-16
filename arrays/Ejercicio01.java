package arrays;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] numeros = new int[10];

		rellenarArray(numeros);
		mostrarArrayz(numeros);
		sc.close();
	}

	public static void rellenarArray(int[] num) { // Static por que es un metodo de clases y no de objeto
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < num.length; i++) {
			System.out.println("Escribe un numero");
			num[i] = sc.nextInt();
		}
	}

	public static void mostrarArrayz(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.println("El indice " + i + " tiene el valor" + num[i]);
		}
	}

}
