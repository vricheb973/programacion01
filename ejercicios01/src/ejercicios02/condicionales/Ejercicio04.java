package ejercicios02.condicionales;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime cuántos kilos has cogido: ");
		double kilos = sc.nextDouble();

		System.out.println("Dime el precio inicial: ");
		double precioInicial = sc.nextDouble();

		System.out.println("Dime el tipo (A o B): ");
		String tipo = sc.next();

		System.out.println("Dime el tamaño (1 o 2): ");
		int tam = sc.nextInt();

		final double TIPO_A1 = 0.2;
		final double TIPO_A2 = 0.3;
		final double TIPO_B1 = -0.3;
		final double TIPO_B2 = -0.5;
		
		double precioFinal = 0.0;
		
		if(tipo == "A" && tam == 1) {
			precioFinal = (precioInicial + TIPO_A1) * kilos;
		}
		else if(tipo == "A" && tam == 2) {
			precioFinal = (precioInicial + TIPO_A2) * kilos;
		}
		else if(tipo == "B" && tam == 1) {
			precioFinal = (precioInicial + TIPO_B1) * kilos;
		}
		else if(tipo == "B" && tam == 2) {
			precioFinal = (precioInicial + TIPO_B2) * kilos;
		}
		
		if(precioFinal != 0.0) {
			System.out.printf("El precio final es %.2f € \n", precioFinal);	
		}
		else {
			System.out.println("Has introducido un tipo o tamaño que no es válido. ");
		}

	}

}
