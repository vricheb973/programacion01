package unidad01.ejercicios;

import java.util.Scanner;

public class Diapositiva112A {

	public static void main(String[] args) {

		/*
		 * Pedir una nota entera de O a 10 y mostrarla de la siguiente 
		 * forma: insuficiente (de O a 4),  suficiente (5), bien (6), 
		 * notable (7 y 8) y sobresaliente (9 y 10).
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime un número: ");
		int nota = sc.nextInt();
		
		switch(nota) {
			case 0:
			case 1: 
			case 2: 
			case 3: 
			case 4: 
				System.out.println("Insuficiente");
				break;
			case 5: 
				System.out.println("Suficiente");
				break;
			case 6: 
				System.out.println("Bien");
				break;
			case 7: 
			case 8: 
				System.out.println("Notable");
				break;
			case 9: 
			case 10: 
				System.out.println("Sobresaliente");
				break;
			default:
				System.out.println("Has metido una nota fuera de rango (0-10). ");
				
		}
		

	}

}
