package unidad01.ejercicios;

import java.util.Scanner;

public class Diapositiva91 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		/* Escribe una aplicación que pida al usuario dos números enteros 
		 * y muestre true si ambos números son distintos entre sí o 
		 * alguno de ellos es cero; y false en caso contrario.
		 */
		System.out.println("Dime un número entero: ");
		int entero1 = scanner.nextInt();
		
		System.out.println("Dime otro número entero: ");
		int entero2 = scanner.nextInt();
		
		boolean resultado1 = entero1 != entero2 || entero1 == 0 || entero2 == 0;
		
		System.out.println("Ambos números son distintos entre sí o "
				+ "alguno de ellos es cero: " + resultado1);
		
		/*
		 * Realiza un programa que informe al usuario (mostrando true) si un 
		 * número es múltiplo de otro número. Ambos números se piden 
		 * por teclado.
		 */
		
		boolean multiplo = (entero1 % entero2 == 0);
		
		System.out.printf("%d es múltiplo de %d: %b \n", entero1, entero2, multiplo);
		
	}

}
