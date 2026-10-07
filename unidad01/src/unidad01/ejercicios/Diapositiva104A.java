package unidad01.ejercicios;

import java.util.Scanner;

public class Diapositiva104A {

	public static void main(String[] args) {

		/*
		 * Pedir tres números y mostrarlos ordenados de mayor a menor
		 */
		
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Dime un número: ");
		int a = sc.nextInt();

		System.out.println("Dime otro número: ");
		int b = sc.nextInt();

		System.out.println("Dime otro número: ");
		int c = sc.nextInt();
		
		// A es el mayor
		if(a > b && a > c) {
			// B > C
			if(b > c) {
				
			}
			// C > B
			
				
			// B == C	
		}
		// B es el mayor 
		else if(b > a && b > c) {
			
		}		
		// C es el mayor
		else if(c > a && c > b) {
			
		}		
		
	}

}
