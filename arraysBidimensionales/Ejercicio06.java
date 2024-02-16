package arraysBidimensionales;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcion = 0;
		int[][] lista = null;

		while (opcion != 8) {
			System.out.println("Escribe la opcion: ");
			System.out.println("Primero has de generar una Array: ");
			System.out.println("1- Generar Array: ");
			System.out.println("2- Suma una fila: ");
			System.out.println("3- Suma una columna: ");
			System.out.println("4- Suma una diagonal principal: ");
			System.out.println("5- Suma una diagonal inversa: ");
			System.out.println("6- Suma de todos los valores: ");
			System.out.println("7- La media de todos los valores: ");
			System.out.println("8- Salir: ");
			 try {
		            opcion = sc.nextInt();

		            switch (opcion) {
		                case 1:
		                    lista = Lista.crearNuevoArray(lista);
		                    break;
		                case 2:
		                    if (Lista.comprobarArray(lista)) {
		                        int sumaFila = Lista.sumaFila(lista);
		                        System.out.println("La suma de la fila es: " + sumaFila);
		                    }
		                    break;
		                case 3:
		                    if (Lista.comprobarArray(lista)) {
		                        int sumaColumna = Lista.sumaColumna(lista);
		                        System.out.println("La suma de la columna es: " + sumaColumna);
		                    }
		                    break;
		                case 4:
		                    if (Lista.comprobarArray(lista)) {
		                        int diagonalPrincipal = Lista.calculaDiagonalPrincipal(lista);
		                        System.out.println("La suma de la diagonal principal es: " + diagonalPrincipal);
		                    }
		                    break;
		                case 5:
		                    if (Lista.comprobarArray(lista)) {
		                        int diagonalInversa = Lista.calculaDiagonalInversa(lista);
		                        System.out.println("La suma de la diagonal inversa es: " + diagonalInversa);
		                    }
		                    break;
		                case 6:
		                    if (Lista.comprobarArray(lista)) {
		                        int sumaTotal = Lista.sumaTotal(lista);
		                        System.out.println("La suma total es: " + sumaTotal);
		                    }
		                    break;
		                case 7:
		                    if (Lista.comprobarArray(lista)) {
		                        int media = Lista.media(lista);
		                        System.out.println("La media de todos los valores es: " + media);
		                    }
		                    break;
		                case 8:
		                    System.out.println("Has elegido Salir");
		                    break;
		                default:
		                    System.out.println("La opcion que has elegido es incorrecta");
		            }
		        } catch (InputMismatchException e) {
		            System.out.println("Por favor, ingresa un número válido ");
		            sc.nextLine();
		        }
		    }
		    sc.close();
		}
}