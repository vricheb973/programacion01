package unidad01.ejercicios;

import java.util.Scanner;

public class Diapositiva96 {

	public static void main(String[] args) {

		/*
		 * Diseñar una aplicación que solicite al usuario un número e indique 
		 * si es par o impar. Haciendo uso del if podemos mostrar como 
		 * resultado final:
		 * “Es par”
		 * “Es impar”
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número: ");
		int numero = sc.nextInt();
		
		String mensaje = "Es par";
		
		if(numero % 2 != 0) {
			mensaje = "Es impar";
		}
		

		System.out.println(mensaje);
		
	}

}
