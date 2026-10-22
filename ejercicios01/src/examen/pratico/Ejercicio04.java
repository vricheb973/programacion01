package examen.pratico;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("¿Cuántos alumnos van al viaje?:");
		int alumnos = scanner.nextInt();
		
		double costeTotal = 0.0;
		double costePorAlumno = 0.0;
				
		if(alumnos >= 100) {
			costePorAlumno = 65.0;
			costeTotal = alumnos * costePorAlumno;
		}
		else if(alumnos >= 50 ) {
			costePorAlumno = 70.0;
			costeTotal = alumnos * costePorAlumno;
		}
		else if(alumnos >= 30) {
			costePorAlumno = 95.0;
			costeTotal = alumnos * costePorAlumno;
		}
		else if(alumnos >= 1) {
			costeTotal = 4000;
			costePorAlumno = costeTotal / alumnos;
		}
		else {
			System.out.println("Error al meter los alumnos");
		}
		
		System.out.printf("El coste total es %.2f € y el coste por alumno es %.2f € \n", costeTotal, costePorAlumno);


	}

}
