package arrays;

public class Ejercicio10 {
/* Dado un array de números de 5 posiciones con los siguientes valores {1,2,3,4,5},
 * guardar los valores de este array en otro array distinto, pero con los valores
 * invertidos, es decir, que el segundo array deberá tener los valores {5,4,3,2,1}. */
	
	
	 public static void main(String[] args) {
	        int[] arrayOriginal = {1, 2, 3, 4, 5};

	        // Crear un nuevo array con la misma longitud que el original
	        int[] arrayInvertido = new int[arrayOriginal.length];

	        // Copiar los valores en orden inverso
	        for (int i = 0; i < arrayOriginal.length; i++) {
	            arrayInvertido[i] = arrayOriginal[arrayOriginal.length - 1 - i];
	        }

	  
	        System.out.print("Array Original: ");
	        mostrarArray(arrayOriginal);

	   
	        System.out.print("Array Invertido: ");
	        mostrarArray(arrayInvertido);
	    }

	   
	    private static void mostrarArray(int[] array) {
	        for (int valor : array) {
	            System.out.print(valor + " ");
	        }
	        System.out.println();
	    }
}
