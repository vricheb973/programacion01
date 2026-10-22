package examen.pratico;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime un número: ");
		int numero = scanner.nextInt();

		int unidades = numero % 10;
		int decenas = numero / 10;
		
		int invertido = unidades * 10 + decenas;
		
		System.out.printf("El numero invertido es %d \n ", invertido);

		System.out.println(unidades + "" + decenas);
		System.out.printf("El número invertido es %d%d \n", unidades, decenas);
	}

}
