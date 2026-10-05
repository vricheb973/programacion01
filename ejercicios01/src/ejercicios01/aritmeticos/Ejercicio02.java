package ejercicios01.aritmeticos;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		/* Dados los catetos de un triángulo rectángulo, calcular su hipotenusa. Nota: 
		 * la hipotenusa es igual a la raí­z cuadrada de la suma de los cuadrados 
		 * de los catetos.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dime el cateto A:");
		double catetoA = scanner.nextDouble();

		System.out.println("Dime el cateto B:");
		double catetoB = scanner.nextDouble();
		
		//Para raices cuadradas -> Math.sqrt
		//Para potencias -> c*c || Math.pow
		
		// h = sqrt(cA^2 + cB^2 )
		
		double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
		
		System.out.printf("La hipotenusa es %.2f \n", hipotenusa);

	}

}
