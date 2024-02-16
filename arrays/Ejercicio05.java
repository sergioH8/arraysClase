package arrays;

import java.util.Random;
/* Crea un array de números de un tamaño pasado por teclado,
 *  el array contendrá números aleatorios entre 1 y 300.

Mostrar aquellos números que acaben en un dígito que nosotros
 le indiquemos por teclado (debes controlar que se introduce un
  número correcto), estos deben guardarse en un nuevo array.

Por ejemplo, si tenemos un array de 10 posiciones, e indicamos 
mostrar los números acabados en 5, podría salir 155, 25, etc.*/
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Ingrese el tamaño del array: ");
        int tamano = sc.nextInt();

        // Crear un array de números aleatorios entre 1 y 300
        int[] numeros = generaArrayAleatorio(tamano);

       
        System.out.print("Ingrese un dígito para filtrar: ");
        int digitoFiltro = sc.nextInt();

        // Filtrar y mostrar los números que terminan en el dígito proporcionado
        int[] numerosFiltrados = filtraPorDigito(numeros, digitoFiltro);

        // Mostrar los números filtrados
        System.out.println("Números que terminan en " + digitoFiltro + ":");
        mostrarArray(numerosFiltrados);
    }

    private static int[] generaArrayAleatorio(int tamano) {
        Random rand = new Random();
        int[] numeros = new int[tamano];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(300) + 1; // Genera un número aleatorio entre 1 y 300
        }

        return numeros;
    }

    private static int[] filtraPorDigito(int[] array, int digitoFiltro) {
        int[] resultado = new int[array.length];
        int i = 0;

        for (int numero : array) {
            if (terminaEnDigito(numero, digitoFiltro)) {
                resultado[i] = numero;
                i++;
            }
        }

        // Crear un nuevo array del tamaño exacto de los números filtrados
        int[] numerosFiltrados = new int[i];
        for (int j = 0; j < i; j++) {
            numerosFiltrados[j] = resultado[j];
        }

        return numerosFiltrados;
    }
    private static boolean terminaEnDigito(int numero, int digitoFiltro) {
        return Math.abs(numero % 10) == digitoFiltro;  //Math.abs para mostrar el valor absoluto y que no sea negativo
    }

    private static void mostrarArray(int[] array) {
        for (int numero : array) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
