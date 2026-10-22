package ejercicios02.condicionales;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("¿Cuántas acciones quieres comprar?");
		int acciones = sc.nextInt();
		
		System.out.println("¿Eres gran accionista? (true/false)");
		boolean granAccionista = sc.nextBoolean();

		System.out.println("¿Cuántos años tienes de carnet?");
		int aniosCarnet = sc.nextInt();
		
		// 9 acciones
		final double PRIMER_TRAMO = 50.0;
		final double SEGUNDO_TRAMO = 150.0;
		final double TERCER_TRAMO = 300.0;
		final double CUARTO_TRAMO = 500.0;
		
		double precio = 0.0;
		
		
		// Las 10 primeras acciones se venden en el tramo barato (50 euros por acción).
		if(acciones > 0 && acciones <= 10) {
			precio = PRIMER_TRAMO * acciones;
		}
		// Las siguientes 40 acciones se venden en el tramo intermedio (150 euros por acción).
		else if(acciones > 10 && acciones <= 50) {
			precio = (PRIMER_TRAMO * 10) + SEGUNDO_TRAMO * (acciones - 10);
		}
		// Las siguientes 50 acciones se venden en el tramo alto (300 euros por acción).
		else if(acciones > 50 && acciones <= 100) {
			precio = (PRIMER_TRAMO * 10) + (SEGUNDO_TRAMO * 40) + TERCER_TRAMO * (acciones - 50);
		}
		// A partir de las 100 acciones se venden en el tramo caro (500 euros por acción).
		else if(acciones > 100) {
			precio = (PRIMER_TRAMO * 10) + (SEGUNDO_TRAMO * 40) + (TERCER_TRAMO * 50) +
					(CUARTO_TRAMO * (acciones - 100));
		}
		
		if(granAccionista) {
			precio = precio * 1.15;
		}
		else {
			if(aniosCarnet >= 10) {
				precio = precio * 0.8;
			}
			else {
				precio = precio * 0.9;
			}
		}
		
		System.out.printf("Pagarás %.2f € \n", precio);
		
	}

}
