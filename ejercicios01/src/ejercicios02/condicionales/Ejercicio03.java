package ejercicios02.condicionales;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime un dia: ");
		int dia = sc.nextInt();

		System.out.println("Dime un mes: ");
		int mes = sc.nextInt();
		
		System.out.println("Dime un año: ");
		int anio = sc.nextInt();
		
		boolean fechaCorrecta = false;
		
		switch(mes) {
		//Meses de 31 dias
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if(dia >= 1 && dia <= 31) {
				fechaCorrecta = true;
			}
			break;
		//Meses de 30 dias
		case 4:
		case 6:
		case 9:
		case 11:
			if(dia >= 1 && dia <= 30) {
				fechaCorrecta = true;
			}
			break;
		//Febrero
		case 2:
			boolean bisiesto = ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0);
			if(bisiesto && dia >= 1 && dia <= 29) {
				fechaCorrecta = true;
			}
			else if(!bisiesto && dia >= 1 && dia <= 28) {
				fechaCorrecta = true;
			}
		default:
			System.out.println("El mes es incorrecto. ");
			break;
		}
		
		if(fechaCorrecta) {
			System.out.println("La fecha ingresada es correcta. ");
		}
		else {
			System.out.println("La fecha ingresada es incorrecta. ");
		}
		
	}

}
