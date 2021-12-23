package basico;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EntradaDeDatos {
	public static void main(String[] args) {

		// Entrada de datos por consola
		Scanner in = new Scanner(System.in);

		System.out.println("Escriba su nombre");
		String nombre = in.nextLine();
		in.close();

		// Entrada de datos con interfaz grafica
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Escriba su edad"));

		JOptionPane.showMessageDialog(null, nombre + ", en 10 años tendra " + (edad + 10) + " años");
	}
}