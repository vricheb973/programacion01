package unidad01.ejercicios;

import java.util.Scanner;

public class Diapositiva71 {

	public static void main(String[] args) {
		
		/*
		 * Pedir al usuario su edad y mostrar la que tendrá el próximo año.
		 * Hacer con el  operador de incremento (++).
		 */

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduzca su edad: ");
		int edad = scanner.nextInt();
		
//		edad++; // edad = edad + 1;
		
		// Primero se ejecuta el ++edad y acto seguido seguido se ejecuta el printf 
		System.out.printf("El próximo año tendrás %d años \n", ++edad);

	}

}
