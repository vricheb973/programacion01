package ejercicios02;

import java.util.Scanner;

public class Diapositiva115NumerosLetras {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número de 2 cifras: ");
		int numero = sc.nextInt();

		if(numero < 1 || numero > 99) {
			System.out.println("ERROR. Solo se admiten números del 1 al 99");
		}
		else {
			// Aqui hacemos el ejercicio.
			int unidades = numero % 10;
			int decenas = numero / 10;
			
			switch(decenas) {
			case 0:
				
			case 1: 
				switch(unidades) {
					case 0 -> System.out.println("Diez");
					case 1 -> System.out.println("Once");
					case 2 -> System.out.println("Doce");
					case 3 -> System.out.println("Trece");
					case 4 -> System.out.println("Catorce");
					case 5 -> System.out.println("Quince");
					case 6 -> System.out.println("Dieciséis");
					case 7 -> System.out.println("Diecisiete");
					case 8 -> System.out.println("Dieciocho");
					case 9 -> System.out.println("Diecinueve");
				}
				break;
			case 2:
				switch(unidades) {
					case 0:
						System.out.println("Veinte");
						break;
					default:
						System.out.print("Veinti");
						switch(unidades) {
						case 1 -> System.out.println("uno");
						case 2 -> System.out.println("dos");
						case 3 -> System.out.println("tres");
						case 4 -> System.out.println("cuatro");
						case 5 -> System.out.println("cinco");
						case 6 -> System.out.println("seis");
						case 7 -> System.out.println("siete");
						case 8 -> System.out.println("ocho");
						case 9 -> System.out.println("nueve");
						}
						break;
				}
				
			
			}
			
		}
		
	}

}
