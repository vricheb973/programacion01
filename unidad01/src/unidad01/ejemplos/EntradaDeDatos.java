package unidad01.ejemplos;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		//Para recoger un entero
		System.out.println("Dime un entero: ");
		int entero = scanner.nextInt();

		//Para recoger un double
		System.out.println("Dime el precio que has pagado: ");
		double precio = scanner.nextDouble();
		final double DESCUENTO = 0.20;
		
		double precioConDescuento = precio * (1-DESCUENTO);
		
		System.out.printf("El precio con descuento aplicado es %.2f € \n", precioConDescuento);
		
		//Para recoger un String
		System.out.println("¿Cómo te llamas?");
		String nombre = scanner.next();
		
		System.out.printf("Hola %s, encantado de conocerte. \n", nombre);
	}

}
