package arraysBidimensionales;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Lista {
	   public static int[][] crearNuevoArray(int[][] lista) {
	        try {
	            System.out.println("Has elegido generar Array");
	            Scanner sc = new Scanner(System.in);
	            System.out.println("Escribe un tamaño para tu array");
	            int tamaño = sc.nextInt();
	            
				int[][] numeros = new int[tamaño][tamaño];
	            rellenarArray(numeros);
	            System.out.println(" Esta es tu nueva array ");
	            mostrarArray(numeros);
	            return numeros;
	        } catch (InputMismatchException e) {
	            System.out.println("Por favor, ingresa un número válido.");
	            return null;
	        }
	    }


	    public static void rellenarArray(int nums[][]) {
	        try {
	            Random random = new Random();
	            for (int i = 0; i < nums.length; i++) {
	                for (int j = 0; j < nums[i].length; j++) {
	                    nums[i][j] = random.nextInt(10 + 1);
	                }
	            }
	            comprobarArray(nums);
	        } catch (Exception e) {
	            System.out.println("Error al rellenar la array.");
	        }
	    }
	    public static boolean comprobarArray(int nums[][]) {
		    try {
		        if (nums == null || nums.length == 0 || nums[0].length == 0) {
		            System.out.println("Debes generar la array antes de seleccionar otras opciones.");
		            return false;
		        }
		        return true;
		    } catch (Exception e) {
		        System.out.println("Error al comprobar la array.");
		        return false;
		    }
		}

	    public static int sumaFila(int nums[][]) {
	        try {
	            System.out.println("Has elegido Suma una fila ");
	            int fila = eligeFila(nums);
	            int suma = 0;
	            for (int j = 0; j < nums[fila].length; j++) {
	                suma += nums[fila][j];
	            }
	            return suma;
	        } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error al sumar la fila.");
	            return 0;
	        }
	    }

	    public static int sumaColumna(int nums[][]) {
	        try {
	            System.out.println("Has elegido Suma una columna");
	            int columna = eligeColumna(nums);
	            int suma = 0;
	            for (int i = 0; i < nums.length; i++) {
	                suma += nums[i][columna];
	            }
	            return suma;
	        } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error al sumar la columna.");
	            return 0;
	        }
	    }

	    public static int eligeFila(int[][] nums) {
	        try {
	            Scanner sc = new Scanner(System.in);
	            int fila;
	            do {
	                System.out.println("Escribe un número para la fila que quieres sumar (entre 0 y " + (nums.length - 1) + "):");
	                while (!sc.hasNextInt()) {
	                    System.out.println("Por favor, ingresa un número válido.");
	                    sc.next();
	                }
	                fila = sc.nextInt();
	                System.out.println("Fila seleccionada: " + fila); // Imprimir la fila seleccionada
	            } while (fila < 0 || fila >= nums.length);
	            return fila;
	        } catch (InputMismatchException e) {
	            System.out.println("Por favor, ingresa un número válido.");
	            return 0;
	        }
	    }
	    
	    
	   
	    public static int eligeColumna(int[][] nums) {
	        try {
	            Scanner sc = new Scanner(System.in);
	            int columna;
	            do {
	                System.out.println("Escribe un número para la columna que quieres sumar (entre 0 y " + (nums[0].length - 1) + "):");
	                while (!sc.hasNextInt()) {
	                    System.out.println("Por favor, ingresa un número válido.");
	                    sc.next();
	                }
	                columna = sc.nextInt();
	                System.out.println("Fila seleccionada: " + columna); // Imprimir la fila seleccionada
	            } while (columna < 0 || columna >= nums[0].length);
	            return columna;
	        } catch (InputMismatchException e) {
	            System.out.println("Por favor, ingresa un número válido.");
	            return 0;
	        }
	    }

	    public static int calculaDiagonalPrincipal(int nums[][]) {
	        try {
	            System.out.println("Has elegido Suma una diagonal principal");
	            int diagonal = 0;
	            for (int i = 0, j = 0; i < nums.length; i++, j++) {
	                diagonal += nums[i][j];
	            }
	            return diagonal;
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error al calcular la diagonal principal.");
	            return 0;
	        }
	    }
	    public static int calculaDiagonalInversa(int nums[][]) {
	        try {
	            System.out.println("Has elegido Suma una diagonal inversa");
	            int diagonal = 0;
	            for (int i = nums.length-1, j = 0;  i >= 0; i--, j++) {
	                diagonal += nums[i][j];
	            }
	            return diagonal;
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error al calcular la diagonal inversa.");
	            return 0;
	        }
	    }
	    public static int sumaTotal(int nums[][]) {
	        try {
	            System.out.println("Has elegido La suma de todos los valores");
	            int sumaTotal = 0;
	            for (int i = 0; i < nums.length; i++) {
	                for (int j = 0; j < nums[i].length; j++) {
	                    sumaTotal += nums[i][j];
	                }
	            }
	            return sumaTotal;
	        } catch (Exception e) {
	            System.out.println("Error al calcular la suma total.");
	            return 0;
	        }
	    }

	    public static int media(int nums[][]) {
	        try {
	            System.out.println("Has elegido La media de todos los valores");
	            int sumaTotal = sumaTotal(nums);
	            return sumaTotal / (nums.length * nums[0].length);
	            
	        } catch (ArithmeticException e) {
	            System.out.println("Error al calcular la media: división por cero.");
	            return 0;
	        } catch (Exception e) {
	            System.out.println("Error al calcular la media.");
	            return 0;
	        }
	    }
	
	public static void mostrarArray(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {  
        	for(int j = 0; j<nums[i].length;j++) {
            System.out.print(" "+ nums[i][j] + " "); 
        }
        System.out.println();
        }
    }
	
}
