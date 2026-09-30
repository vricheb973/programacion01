package unidad01.ejercicios;

import java.util.Scanner;

public class Diapositiva74 {

	public static void main(String[] args) {

		/*
		 * Realizar una aplicación que solicite al usuario su edad 
		 * y le indique si es mayor de edad (mediante un literal 
		 * booleano: true o false).
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("¿Cuántos años tienes?");
		int edad = scanner.nextInt();
		
		boolean mayorEdad = (edad >= 18);

		System.out.println("Mayor de edad: " + mayorEdad);
		
	}

}
