package basico;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Escriba su nombre: ");
		String nombre = in.nextLine();

		System.out.println("Seleccione una opcion: \n1.Para mostrar su nombre en mayusculas"
				+ "\n2.Para mostrar su nombre en minusculas");

		int opcion = in.nextInt();
		in.close();

		// Condicional con switch-case
		switch (opcion) {
		case 1:
			System.out.println(nombre.toUpperCase());
			break;
		case 2:
			System.out.println(nombre.toLowerCase());
			break;
		default:
			System.out.println("Opcion incorrecta");
		}
	}
}