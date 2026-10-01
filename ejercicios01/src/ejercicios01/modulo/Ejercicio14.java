package ejercicios01.modulo;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que reciba una cantidad de minutos y muestre por 
		 * pantalla a cuantas horas y minutos corresponde.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dime una cantidad de minutos: ");
		int minutosTotales = scanner.nextInt();
		
		int horas = minutosTotales / 60;
		int minutos = minutosTotales % 60;
		
		System.out.printf("%d minutos equivalen a %d horas y %d minutos. \n", minutosTotales, horas, minutos);

	}

}
