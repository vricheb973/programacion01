package ejercicios02.condicionales;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el número de alumnos: ");
		int alumnos = sc.nextInt();
		
		double costeTotal = 0.0;
		double costePorAlumno = 0.0;
		
		if(alumnos >= 100) {
			costePorAlumno = 65;
			costeTotal = alumnos * costePorAlumno;
		}
		else if(alumnos >= 50 && alumnos <= 99) {
			costePorAlumno = 70;
			costeTotal = alumnos * costePorAlumno;
		}
		else if(alumnos >= 30 && alumnos <= 49) {
			costePorAlumno = 95;
			costeTotal = alumnos * costePorAlumno;
		}
		else if(alumnos < 30 && alumnos > 0) {
			costeTotal = 4000;
			costePorAlumno = costeTotal / alumnos;
		}
		else {
			System.out.println("Tienes que introducir al menos un alumno. ");
		}
		
		if(costeTotal != 0.0) {
			System.out.printf("El coste por alumno es %.2f € y el coste total es %.2f € \n", costePorAlumno, costeTotal);
		}

	}

}
