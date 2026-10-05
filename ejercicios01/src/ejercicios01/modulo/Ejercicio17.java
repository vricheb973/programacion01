package ejercicios01.modulo;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {

		/*
		 * Dado un número de dos cifras, diseñe un algoritmo que 
		 * permita obtener el número invertido.
		 */
		
		// 25 -> 52
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dime un número de 2 cifras: ");
		int numero = scanner.nextInt();
		
		int unidades = numero % 10;
		int decenas = numero / 10;
		
		int invertido = unidades * 10 + decenas;
		
		System.out.println(unidades + "" + decenas );
		
		

	}

}
