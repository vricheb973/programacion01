package ejercicios02;

import java.util.Scanner;

public class Diapositiva115Animales {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime la cantidad de comida que has comprado: ");
		int comidaDiaria = sc.nextInt();

		System.out.println("Dime la cantidad de animales: ");
		int numAnimales = sc.nextInt();
		
		System.out.println("Dime cuánto come cada animal: ");
		double kilosPorAnimal = sc.nextInt();
		
		if(numAnimales != 0) {
			double racion = comidaDiaria * 1.0 / numAnimales;
			
			if(racion >= kilosPorAnimal) {
				System.out.println("Hay suficiente comida para todos tus animales. ");
			}
			else {
				System.out.printf("No hay suficiente comida. Sólo hay %.2f kilos por animal. \n", racion);
			}
			
		}
		else {
			System.out.println("El número de animales no puede ser 0. ");
		}
	}

}
