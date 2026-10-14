package ejercicios02;

import java.util.Random;
import java.util.Scanner;

public class Diapositiva116JuegoSuma {

	public static void main(String[] args) {

		Random r = new Random();
		
		int inicio = 1;
		int fin = 99;

		int aleatorio1 = r.nextInt(inicio, fin+1);
		int aleatorio2 = r.nextInt(inicio, fin+1);
		
		System.out.printf("%d + %d = ? \n", aleatorio1, aleatorio2);
		
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		if(numero == (aleatorio1 + aleatorio2)) {
			System.out.println("Has acertado");
		}
		else {
			System.out.printf("Has fallado, el resultado correcto era %d \n", aleatorio1 + aleatorio2);
		}

	}

}
