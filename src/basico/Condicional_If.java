package basico;

import java.util.Scanner;

public class Condicional_If {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Digite un número: ");
		int numero = in.nextInt();

		in.close();

		// condicional con if-else
		if (numero == 0) {
			System.out.println(numero + ", es un numero neutro");
		} else if (numero % 2 == 0) {
			System.out.println(numero + ", es un numero par");
		} else {
			System.out.println(numero + ", es un numero impar");
		}
	}
}