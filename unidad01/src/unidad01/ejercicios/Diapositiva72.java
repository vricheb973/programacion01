package unidad01.ejercicios;

import java.util.Scanner;

public class Diapositiva72 {

	public static void main(String[] args) {
		
		/*
		 * Desarrollar una aplicación que calcule la media aritmética 
		 * de dos notas enteras. Hay que tener en cuenta que la media 
		 * puede contener decimales (redondeamos a 3 decimales).
		 */
		
		// Ctrl + Shift + o (Auto importar)
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dime la primera nota: ");
		int nota1 = scanner.nextInt();	
		
		System.out.println("Dime la segunda nota: ");
		int nota2 = scanner.nextInt();
		
		double mediaAritmetica = (nota1 + nota2) * 1.0 / 2;
		
		System.out.printf("La media es %.3f \n", mediaAritmetica);
		
		

	}

}
