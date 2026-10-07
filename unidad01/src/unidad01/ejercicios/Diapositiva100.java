package unidad01.ejercicios;

import java.util.Scanner;

public class Diapositiva100 {

	public static void main(String[] args) {

		/*
		 * Solicitar dos números enteros y mostrar cuál es el mayor.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Dime otro número: ");
		int numero2 = sc.nextInt();
		
		if(numero2 > numero1) {
			System.out.printf("El número %d es el mayor. \n",  numero2);
		}
		else {
			System.out.printf("El número %d es el mayor. \n",  numero1);
		}
		
		if(numero1 == numero2) {
			System.out.println("Los números son iguales");
		}
		

	}

}
