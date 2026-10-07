package unidad01.ejercicios;

import java.util.Scanner;

public class Diapositiva104 {

	public static void main(String[] args) {

		/*
		 * Pedir tres números y mostrarlos ordenados de mayor a menor
		 */
		
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Dime un número: ");
		int a = sc.nextInt();

		System.out.println("Dime otro número: ");
		int b = sc.nextInt();

		System.out.println("Dime otro número: ");
		int c = sc.nextInt();
		
		// A > B > C
		if(a > b && b > c) {
			System.out.printf("%d > %d > %d \n", a, b, c);
		}
		// A > C > B
		else if(a > c && c > b) {
			System.out.printf("%d > %d > %d \n", a, c, b);
		}
		// B > A > C
		else if(b > a && a > c) {
			System.out.printf("%d > %d > %d \n", b, a, c);
		}
		// B > C > A
		else if(b > c && c > a) {
			System.out.printf("%d > %d > %d \n", b, c, a);
		}
		// C > A > B
		else if(c > a && a > b) {
			System.out.printf("%d > %d > %d \n", c, a, b);
		}
		// C > B > A
		else if(c > b && b > a){
			System.out.printf("%d > %d > %d \n", c, b, a);
		}
		else {
			System.out.println("Alguno o todos son iguales.");
		}
		
	}

}
