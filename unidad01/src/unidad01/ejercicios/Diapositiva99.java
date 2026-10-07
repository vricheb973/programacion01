package unidad01.ejercicios;

import java.util.Scanner;

public class Diapositiva99 {

	public static void main(String[] args) {

		/*
		 * Pedir dos números enteros y decir si son iguales o no.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Dime otro número: ");
		int numero2 = sc.nextInt();
		
		if(numero1 == numero2) {
			System.out.println("Son iguales");
		}
		else {
			System.out.println("No son iguales");
		}

	}

}
