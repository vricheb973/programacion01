package ejercicios01.modulo;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {

		/*
		 * Un ciclista parte de una ciudad A a las HH horas, MM minutos y 
		 * SS segundos. El tiempo de viaje hasta llegar a otra ciudad B es 
		 * de T segundos. Escribir un algoritmo que determine la hora de 
		 * llegada a la ciudad B.
		 */
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Dime la hora de salida: ");
		int hSalida = scanner.nextInt();
		
		System.out.println("Dime los minutos de salida: ");
		int mSalida = scanner.nextInt();
		
		System.out.println("Dime los segundos de salida: ");
		int sSalida = scanner.nextInt();
		
		System.out.println("¿Cuántos segundos tardas en llegar? ");
		int segundos = scanner.nextInt();
		
		int segundosTotales = hSalida * 3600 + mSalida * 60 + sSalida + segundos;
		
		int sLlegada = segundosTotales % 60;
		
		int mLlegada = (segundosTotales / 60) % 60;
		
		int hLlegada = (segundosTotales / 3600) % 24;
		
		System.out.printf("Llegas a la ciudad B a las %02d:%02d:%02d \n", hLlegada, mLlegada, sLlegada);
		
	}

}
