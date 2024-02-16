package arrays;

import java.util.Scanner;

public class Ejercicio07 {
	/* Calcula la letra de un DNI, pediremos el DNI por teclado y nos devolverá el DNI completo.

Para calcular la letra, cogeremos el resto de dividir nuestro dni entre 23, el resultado debe 
estar entre 0 y 22. Haz un método donde según el resultado de la anterior formula busque en un 
array de caracteres la posición que corresponda a la letra. Esta es la tabla de caracteres:

POSICIÓN LETRA
0 T 	10 X
1 R		11 B
2 W		12 N
3 A		13 J
4 G		14 Z
5 M		15 S
6 Y		16 Q
7 F		17 V
8 P		18 H
9 D		19 L
20 C	21 K
22 E */
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Introduce el DNI:");
		
		int dni = sc.nextInt();
		char letraElegida = calcularLetra(dni);
		
		
		System.out.println("El dni resultante es " + dni + letraElegida );
		
		
	}
	

	public static char calcularLetra(int dni) {
		
	    char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
	    
	    int indiceLetra = dni % 23;
	    
	    char letraElegida = letras[indiceLetra];

	    return letraElegida;
	}

}
