package unidad01.ejercicios;

import java.util.Scanner;

public class Diapositiva70 {

	public static void main(String[] args) {
		
		/*
		 * Pedir al usuario dos números y mostrar la suma, resta, 
		 * división y multiplicación de ambos.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dime el primer número: ");
		int numero1 = scanner.nextInt();	
		
		System.out.println("Dime el segundo número: ");
		int numero2 = scanner.nextInt();
		
		int suma = numero1 + numero2;
		int resta = numero1 - numero2;
		int multiplicacion = numero1 * numero2;
		double division = (numero1 * 1.0) / numero2;

		System.out.printf("Suma = %d \n", suma);
		System.out.printf("Resta = %d \n", resta);
		System.out.printf("Multiplicación = %d \n", multiplicacion);
		System.out.printf("División = %.3f \n", division);

	}

}
