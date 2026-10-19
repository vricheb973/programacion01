package ejercicios02.condicionales;

import java.util.Scanner;

public class Ejercicio03IfElse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime un dia: ");
		int dia = sc.nextInt();

		System.out.println("Dime un mes: ");
		int mes = sc.nextInt();
		
		System.out.println("Dime un año: ");
		int anio = sc.nextInt();
		
		boolean fechaCorrecta = false;
		
		if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			
			if(dia >= 1 && dia <= 31) {
				fechaCorrecta = true;
			}
		}
		else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			if(dia >= 1 && dia <= 30) {
				fechaCorrecta = true;
			}
		}
		else if(mes == 2) {
			boolean bisiesto = ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0);
			if(bisiesto && dia >= 1 && dia <= 29) {
				fechaCorrecta = true;
			}
			else if(!bisiesto && dia >= 1 && dia <= 28) {
				fechaCorrecta = true;
			}
		}
		else {
			System.out.println("El mes es incorrecto. ");
		}
		
		if(fechaCorrecta) {
			System.out.println("La fecha ingresada es correcta. ");
		}
		else {
			System.out.println("La fecha ingresada es incorrecta. ");
		}
	}

}
