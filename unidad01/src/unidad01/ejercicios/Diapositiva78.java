package unidad01.ejercicios;

import java.util.Scanner;

public class Diapositiva78 {
	
	public static void main(String[] args) {
		
		/*
		 * Escribir un programa que pida un número al usuario 
		 * e indique mediante un literal booleano si el número 
		 * es par.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número: ");
		int numero = sc.nextInt();
		
		boolean esPar = (numero%2 == 0);
		
		System.out.println("Par: " + esPar);
		
	}

}
