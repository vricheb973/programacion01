package ejercicios01.aritmeticos;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		/*
		 * Escribir un algoritmo para calcular la nota final de un estudiante, 
		 * considerando que: por cada respuesta correcta 5 puntos, por una 
		 * incorrecta -1 y por respuestas en blanco 0. Imprime el resultado 
		 * obtenido por el estudiante.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dime las correctas: "); // 9
		int correctas = scanner.nextInt();

		System.out.println("Dime las incorrectas: "); // 1
		int incorrectas = scanner.nextInt();

		System.out.println("Dime las que has dejado en blanco: "); //2
		int blanco = scanner.nextInt();
		
		int notaFinal = correctas * 5 - incorrectas;
		int puntuacionMaxima = (correctas + incorrectas + blanco) * 5;
		
		System.out.printf("Has obtenido %d/%d \n", notaFinal, puntuacionMaxima);
		
	}

}
