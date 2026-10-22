package examen.pratico;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime un número: ");
		int numero = scanner.nextInt();
		
		switch(numero) {
		case 1,3,5,7,8,10,12 -> System.out.println("Tiene 31 días. ");
		case 4,6,9,11 -> System.out.println("Tiene 30 días. ");
		case 2 -> System.out.println("Tiene 28 o 29 días. ");
		default -> System.out.println("Error. ");
		}
		
		switch(numero) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Tiene 31 días. ");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Tiene 30 días. ");
			break;
		case 2:
			System.out.println("Tiene 28 o 29 días. ");
			break;
		default:
			System.out.println("Error. ");
			break;
		}
		
		if(numero == 1 || numero == 3 || numero == 5 || numero == 7 || numero == 8 || numero == 10 || numero == 12) {
			System.out.println("Tiene 31 días. ");
		}
		else if(numero == 4 || numero == 6 || numero == 9 || numero == 11) {
			System.out.println("Tiene 30 días. ");
		}
		else if(numero == 2) {
			System.out.println("Tiene 28 o 29 días. ");
		}
		else {
			System.out.println("El mes es incorrecto. ");
		}


	}

}
