package unidad01.ejemplos;

public class Aritmeticos {

	public static void main(String[] args) {

		//Suma
		int suma = 2 + 3;
		
		//Resta
		int resta = 9 - 6;
		
		//Multiplicar
		int multiplicacion = 2 * 6;
		
		//División
		int divisionEntera = 9 / 2; 
		System.out.println("La división entera de 9 / 2 es " + divisionEntera);
		
		double divisionDecimales = (9 * 1.0) / 2;
		System.out.println("La división con decimales de 9 / 2 es " + divisionDecimales);
		
		//Módulo
		int num = 89;
		int resto = 89 % 2;
		System.out.println("El resto de dividir 89 / 2 = " + resto);
		
		int minutos = 90;
		System.out.printf("He tardado %d horas y %d minutos \n", minutos/60, minutos%60);
		
		//Incrementos
		int a = 1;
		int b = 2;

		// Cuando el ++/-- va delante de la variable es la primera operación que se realiza
		// Cuando el ++/-- va detrás de la variable es la última operación que se realiza
		int c = a++ * ++b;
		
		System.out.println("El valor de a es " + a);
		System.out.println("El valor de b es " + b);
		System.out.println("El valor de c es " + c); //6
		
		

	}

}
