package ejercicios01.ternario;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Dime la nota del primer parcial: ");
		int nota1 = scanner.nextInt();
		
		System.out.println("Dime la nota del segundo parcial: ");
		int nota2 = scanner.nextInt();
		
		System.out.println("Dime la nota del tercer parcial: ");
		int nota3 = scanner.nextInt();
		
		double media = (nota1 + nota2 + nota3) / 3.0;
		

		String mensaje = (nota1 >=3 && nota2 >= 3 && nota3 >= 3 && media >=5 ) ? "Aprobado" : "Suspenso";
		
		System.out.println(mensaje);
		
		scanner.close();

	}

}
