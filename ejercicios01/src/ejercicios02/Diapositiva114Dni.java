package ejercicios02;

import java.util.Scanner;

public class Diapositiva114Dni {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el número del DNI: ");
		int dni = sc.nextInt();
		
		switch(dni % 23) {
			case 0 -> System.out.printf("Tu DNI es %d%s", dni, "T");
			case 1 -> System.out.printf("Tu DNI es %d%s", dni, "R");
			case 2 -> System.out.printf("Tu DNI es %d%s", dni, "W");
			case 3 -> System.out.printf("Tu DNI es %d%s", dni, "A");
			case 4 -> System.out.printf("Tu DNI es %d%s", dni, "G");
			case 5 -> System.out.printf("Tu DNI es %d%s", dni, "M");
			case 6 -> System.out.printf("Tu DNI es %d%s", dni, "Y");
			case 7 -> System.out.printf("Tu DNI es %d%s", dni, "F");
			case 8 -> System.out.printf("Tu DNI es %d%s", dni, "P");
			case 9 -> System.out.printf("Tu DNI es %d%s", dni, "D");
			case 10 -> System.out.printf("Tu DNI es %d%s", dni, "X");
			case 11 -> System.out.printf("Tu DNI es %d%s", dni, "B");
			case 12 -> System.out.printf("Tu DNI es %d%s", dni, "N");
			case 13 -> System.out.printf("Tu DNI es %d%s", dni, "J");
			case 14 -> System.out.printf("Tu DNI es %d%s", dni, "Z");
			case 15 -> System.out.printf("Tu DNI es %d%s", dni, "S");
			case 16 -> System.out.printf("Tu DNI es %d%s", dni, "U");
			case 17 -> System.out.printf("Tu DNI es %d%s", dni, "V");
			case 18 -> System.out.printf("Tu DNI es %d%s", dni, "H");
			case 19 -> System.out.printf("Tu DNI es %d%s", dni, "L");
			case 20 -> System.out.printf("Tu DNI es %d%s", dni, "C");
			case 21 -> System.out.printf("Tu DNI es %d%s", dni, "K");
			case 22 -> System.out.printf("Tu DNI es %d%s", dni, "E");
			default -> System.out.println("Error. Esto no puede pasar en la vida. ");
		}
		

	}

}
