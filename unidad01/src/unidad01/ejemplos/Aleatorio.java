package unidad01.ejemplos;

import java.util.Random;

public class Aleatorio {

	public static void main(String[] args) {

		Random r = new Random();
		
		int inicio = 1;
		int fin = 10;
		
		int aleatorio = r.nextInt(inicio, fin+1);

	}

}
