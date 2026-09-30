package unidad01.ejercicios;

import java.util.Scanner;

public class Diapositiva80 {

	public static void main(String[] args) {

		/*
		 * Diseñar un algoritmo que nos indique si podemos salir a la calle. 
		 * Existen dos aspectos que nos influyen en esta decisión: si está 
		 * lloviendo y si hemos terminado nuestras tareas.
		 * 
		 * Sólo podemos salir a la calle si no está lloviendo y hemos 
		 * finalizado nuestras tareas. Existe otra opción en la que, 
		 * indistintamente de lo anterior, podremos salir a la calle: 
		 * el hecho de que tengamos que ir a la biblioteca (para realizar 
		 * algún trabajo, entregar los libros, etcétera). 
		 * 
		 * Debemos solicitar al usuario (mediante un booleano) si llueve, 
		 * si ha finalizado las tareas y si necesita ir a la biblioteca. 
		 * El algoritmo debe mostrar mediante un booleano (true o false) 
		 * si  se le concede el permiso para salir a la calle.
		 */
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("¿Está lloviendo?");
		boolean lluvia = scanner.nextBoolean();
		
		System.out.println("¿Has terminado las tareas?");
		boolean tareas = scanner.nextBoolean();
		
		System.out.println("¿Tienes que ir a la biblioteca?");
		boolean biblio = scanner.nextBoolean();
		
		boolean salir = (biblio || tareas && !lluvia);
		
		System.out.println("Puedes salir a la calle: " + salir);
		
	}

}
