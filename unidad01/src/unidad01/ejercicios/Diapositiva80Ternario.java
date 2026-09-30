package unidad01.ejercicios;

import java.util.Scanner;

public class Diapositiva80Ternario {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("¿Está lloviendo?");
		boolean lluvia = scanner.nextBoolean();
		
		System.out.println("¿Has terminado las tareas?");
		boolean tareas = scanner.nextBoolean();
		
		System.out.println("¿Tienes que ir a la biblioteca?");
		boolean biblio = scanner.nextBoolean();
		
		boolean salir = (biblio || tareas && !lluvia);

		String mensaje = salir ? "Puedes salir a la calle" : "No puedes salir a la calle";
		
		System.out.println(mensaje);

	}

}
