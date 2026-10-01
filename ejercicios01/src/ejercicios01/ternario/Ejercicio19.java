package ejercicios01.ternario;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {

		/*
		 * Diseñar un algoritmo que reciba la edad de un usuario y un valor 
		 * booleano o entero que indique si tiene pase VIP. Mostrar el mensaje 
		 * "Acceso permitido" si es mayor o igual a 18 años o si cuenta con 
		 * pase VIP, y "Acceso denegado" en caso contrario.
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dime tu edad: ");
		int edad = scanner.nextInt();
		
		System.out.println("¿Eres vip? (false/true)");
		boolean vipB = scanner.nextBoolean();
		
//		System.out.println("¿Eres vip? 0(no) / 1(si)");
//		int vipE = scanner.nextInt();
//		
//		System.out.println("¿Eres vip? NO/SI");
//		String vipS = scanner.next();
		

		String mensaje = (edad >= 18 || vipB) ? "Acceso permitido" : "Acceso denegado";
//		String mensaje = (edad >= 18 || vipE == 1) ? "Acceso permitido" : "Acceso denegado";
//		String mensaje = (edad >= 18 || vipS.equals("SI")) ? "Acceso permitido" : "Acceso denegado";
		
		System.out.println(mensaje);

	}

}
