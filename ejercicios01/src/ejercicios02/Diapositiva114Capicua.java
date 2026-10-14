package ejercicios02;

import java.util.Scanner;

public class Diapositiva114Capicua {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número");
		int numero = sc.nextInt();
		
		// una cifra (siempre es capicúa)
		if(numero >= 0 && numero < 10) {
			System.out.printf("El %d es CAPICÚA \n", numero);
		}
		// dos cifras
		else if(numero < 100) {
			
			int unidades = numero % 10;
			int decenas = numero / 10;
			
			if(unidades == decenas) {
				System.out.printf("El %d es CAPICÚA \n", numero);
			}
			else {
				System.out.printf("El %d NO es CAPICÚA \n", numero);
			}
			
		}		
		// tres cifras
		else if(numero < 1000) {
			
			int aux = numero;
			
			int unidades = numero % 10;
			numero = numero / 10;
			int decenas = numero % 10;
			numero = numero / 10;
			int centenas = numero % 10;
			
			
			if(unidades == centenas) {
				System.out.printf("El %d es CAPICÚA \n", aux);
			}
			else {
				System.out.printf("El %d NO es CAPICÚA \n", aux);
			}
			
		}		
		// cuatro cifras // 9669
		else if(numero < 10000) {
			
			int aux = numero;
			
			int unidades = numero % 10;
			numero = numero / 10;
			int decenas = numero % 10;
			numero = numero / 10;
			int centenas = numero % 10;
			numero = numero / 10;
			int millares = numero % 10;
			
			if(unidades == millares && decenas == centenas) {
				System.out.printf("El %d es CAPICÚA \n", aux);
			}
			else {
				System.out.printf("El %d NO es CAPICÚA \n", aux);
			}
			
		}
		// 5 o más
		else {
			System.out.println("No se pueden introducir números de más de 4 cifras. ");
		}
		
		
		
	}

}
