package unidad01.ejercicios;

import java.util.Scanner;

public class Diapositiva103 {

	public static void main(String[] args) {

		/*
		 * Escribir una aplicación que indique cuántas cifras tiene un 
		 * número entero introducido por teclado que estará comprendido 
		 * entre 0 y 99999.
		 */
		
		Scanner sdc = new Scanner(System.in);
		
		System.out.println("Dime un número: ");
		int numero = sdc.nextInt();
		
		if(numero >= 0 && numero < 10) {
			System.out.println("Tiene 1 cifra. ");
		}
		else if(numero >= 10 && numero < 100) {
			System.out.println("Tiene 2 cifras. ");
		}
		else if(numero >= 100 && numero < 1000) {
			System.out.println("Tiene 3 cifras. ");
		}
		else if(numero >= 1000 && numero < 10000) {
			System.out.println("Tiene 4 cifras. ");
		}
		else if(numero >= 10000 && numero < 100000) {
			System.out.println("Tiene 5 cifras. ");
		}
		else {
			System.out.println("Has introducido  un número fuera del rango (0-99999). ");
		}

		
	}

}
