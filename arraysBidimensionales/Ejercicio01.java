package arraysBidimensionales;
/* Crear una matriz de 3×3 con los números del 1 al 9. Mostrar por pantalla, tal como aparece en la matriz. */


public class Ejercicio01 {
	
	public static void main(String[] args) {
		 int[][] numeros = {{1,2,3},{4,5,6},{7,8,9}}; 
		 
		 mostrarArray(numeros);
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
