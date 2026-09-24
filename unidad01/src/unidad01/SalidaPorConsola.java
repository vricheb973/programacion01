package unidad01;

import java.time.LocalTime;

public class SalidaPorConsola {

	public static void main(String[] args) {

//		//Esta función imprime en una nueva línea (imprime un salto de línea al final)
//		System.out.println("H");
//		System.out.println("o");
//		System.out.println("l");
//		System.out.println("a");
//
//		//El print a secas no imprime salto de línea
//		System.out.print("H");
//		System.out.print("o");
//		System.out.print("l");
//		System.out.print("a");
//		
//		System.out.println(LocalTime.now());
		
		System.out.println("El número " + 21 + " no tiene decimales. ");
		System.out.printf("El número %d no tiene decimales. \n", 21);
		
		double alto = 0.60;
		double ancho = 1.20;
		double largo = 2.05;
		
		System.out.println("El ropero tiene " + alto + " cm de alto, " + ancho + " cm de ancho y " + largo + " cm de largo. ");
		System.out.printf("El ropero tiene %.2f cm de alto, %.2f cm de ancho y %.2f cm de largo. \n", alto, ancho, largo);
		

		
		
		
		

	}

}
