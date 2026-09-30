package unidad01.ejercicios;

import java.util.Scanner;

public class Diapositiva79 {

	public static void main(String[] args) {
		
		/*
		 * Realizar una aplicación que solicite al usuario su edad y 
		 * le indique si está en edad laboral, es decir, que sea mayor 
		 * o igual que 16 y menor que 67. El resultado debe expresarse 
		 * mediante un literal booleano (true o false).
		 */

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dime tu edad: ");
		int edad = scanner.nextInt();
		
		boolean edadLaboral = ((edad >= 16) && (edad < 67));
		
		System.out.println("Edad laboral: " + edadLaboral);

	}

}
