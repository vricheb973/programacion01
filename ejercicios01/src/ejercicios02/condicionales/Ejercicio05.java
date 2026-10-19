package ejercicios02.condicionales;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);


		System.out.println("1. América del Norte (24€/kg).");
		System.out.println("2. América Central (20€/kg).");
		System.out.println("3. América del Sur (21€/kg).");
		System.out.println("4. Europa (10€/kg).");
		System.out.println("5. Asia (18€/kg).");
		System.out.println("Dime la zona (1-5): ");
		int zona = sc.nextInt();

		System.out.println("Dime el peso del paquete en gramos (1-5000): ");
		int peso = sc.nextInt();
		
		double precioTotal = 0.0;
		
		if(peso > 0 && peso <= 5000) {
			switch(zona) {
			case 1 -> precioTotal = (peso/1000.0) * 24.0;
			case 2 -> precioTotal = (peso/1000.0) * 20.0;
			case 3 -> precioTotal = (peso/1000.0) * 21.0;
			case 4 -> precioTotal = (peso/1000.0) * 10.0;
			case 5 -> precioTotal = (peso/1000.0) * 18.0;
			default -> System.out.println("La zona introducida no es válida.");
			
			}
		}
		else {
			System.out.println("El peso introducido no es válido.");
		}
		
		if(precioTotal != 0.0) {
			System.out.printf("El precio total es %.2f € \n", precioTotal);
		}
		
	}

}
