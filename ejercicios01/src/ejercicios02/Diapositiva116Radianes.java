package ejercicios02;

import java.util.Scanner;

public class Diapositiva116Radianes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime una cantidad de grados: ");
		int grados = sc.nextInt();
		
		int aux = grados;
		grados = grados % 360;
		
		double radianes = grados * Math.PI / 180;
		
		System.out.printf("El ángulo %d equivale a %.3f radianes \n", aux, radianes);

	}

}
