package unidad01.ejemplos;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.util.Scanner;

public class AnioBisiesto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime un año: ");
		int anio = sc.nextInt();
		
		if((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
			System.out.println("El año es bisiesto");
		}
		else {
			System.out.println("El año no es bisiesto");
		}

		int mes = 1;
		int dia = 1;
		
		try {
			LocalDate.of(anio, Month.of(mes), dia);
			System.out.println("Fecha correcta");
		}
		catch(DateTimeException e) {
			System.out.println("Fecha incorrecta");
		}

		final double tipoA1 = 0.20;
		final double tipoA2 = 0.30;
		final double tipoB1 = -0.30;
		final double tipoB2 = -0.50;
		
		
		
	}

}
