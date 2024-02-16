package arrays;

import java.util.Scanner;

public class Ejercicio08 {
	/*
	 * Ejercicio 8:
	 * 
	 * Crea un array de números y otro de String de 10 posiciones cada uno. El
	 * primero lo rellenaremos con la nota de un examen (entre 0 y 10, debemos
	 * controlar que inserte una nota valida), pudiendo ser decimal la nota en el
	 * array de números, en el de Strings se insertaran los nombres de los alumnos.
	 * 
	 * Después, crearemos un array de String donde insertaremos los siguientes
	 * valores dependiendo la nota:
	 * 
	 * · Si la nota esta entre 0 y 4,99 , será un SUSPENSO.
	 * 
	 * · Si esta entre 5 y 6,99 , será un BIEN.
	 * 
	 * · Si esta entre 7 y 8,99 será un NOTABLE.
	 * 
	 * · Si esta entre 9 y 10 será un SOBRESALIENTE.
	 * 
	 * Muestra por pantalla, el alumno su nota y su resultado en palabras. Crea los
	 * métodos que creas conveniente
	 */

	public static void main(String[] args) {
		int[] notas = new int[2];
		String[] alumnos = new String[2];

		// Rellenar los arrays
		rellenarArrays(notas, alumnos);

		// Mostrar los resultados
		mostrarResultados(notas, alumnos);

	}

	private static void rellenarArrays(int[] notas, String[] alumnos) {
	    Scanner sc = new Scanner(System.in);

	    for (int i = 0; i < notas.length; i++) {
	        System.out.print("Introduce el nombre del alumno ");
	        alumnos[i] = sc.nextLine();

	        System.out.print("Introduce la nota del alumno (0-10) ");
	        int nota = sc.nextInt();
	        if ((nota<=10)||(nota >=0)) {
	        notas[i] = nota;
	        }
	       
	        sc.nextLine();
	    }
	}



	private static String obtenerCalificacion(int nota) {
		if (nota >= 0 && nota < 5) {
			return "SUSPENSO";
		} else if (nota >= 5 && nota < 7) {
			return "BIEN";
		} else if (nota >= 7 && nota < 9) {
			return "NOTABLE";
		} else {
			return "SOBRESALIENTE";
		}
	}

	private static void mostrarResultados(int[] notas, String[] alumnos) {
		System.out.println("Resultados:");
		for (int i = 0; i < notas.length; i++) {
			System.out.println(alumnos[i] + " tiene una nota de " + notas[i] + " - " + obtenerCalificacion(notas[i]));
		}
	}
}
