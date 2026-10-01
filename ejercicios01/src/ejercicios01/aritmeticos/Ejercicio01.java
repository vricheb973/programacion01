package ejercicios01.aritmeticos;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		/*
		 * Calcular el perímetro y área de un rectángulo dada su base y su altura. 
		 * Tenemos que leer la base y la altura del rectángulo y calcular el 
		 * perímetro y el área.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dime la base del rectángulo: ");
		double base = scanner.nextDouble();

		System.out.println("Dime la altura del rectángulo: ");
		double altura = scanner.nextDouble();
		
		double area = base * altura;
		double perimetro = (base+altura) * 2;
		
		System.out.printf("El área es %.2f y el perímetro es %.2f \n", area, perimetro);
		
		

	}

}
