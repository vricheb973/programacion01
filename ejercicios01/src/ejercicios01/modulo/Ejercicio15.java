package ejercicios01.modulo;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que reciba una cantidad de segundos 
		 * y muestre por pantalla a cuantas horas, minutos y 
		 * segundos corresponde.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dime una cantidad de segundos: ");
		int segundos = scanner.nextInt();
		
		int segundosRestantes = segundos % 60;
		
		int minutos = (segundos / 60) % 60;
		
		int horas = segundos / 3600;
		
		System.out.printf("Son %d horas, %d minutos y %d segundos. \n", horas, minutos, segundosRestantes);
		
		

	}

}
