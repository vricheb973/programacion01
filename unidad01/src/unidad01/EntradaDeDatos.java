package unidad01;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Dime el precio que has pagado: ");
		double precio = scanner.nextDouble();
		final double DESCUENTO = 0.20;
		
		double precioConDescuento = precio * (1-DESCUENTO);
		
		System.out.printf("El precio con descuento aplicado es %.2f € \n", precioConDescuento);
		
		
	}

}
