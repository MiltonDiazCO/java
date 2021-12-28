package basico;

import javax.swing.JOptionPane;

public class Ciclos {
	public static void main(String[] args) {
		
		String opcion = "";
		String[] arregloPaises = {"Colombia", "España", "Mexico"};

		// Ciclo for
		for (int i = 0; i <= 5; i++) {
			System.out.println("Ciclo N° " + i);
		}
		
		//ciclo for each
		for(String pais : arregloPaises) {
			System.out.println(pais);
		}

		// Ciclo while
		while (opcion.equalsIgnoreCase("Si") == false) {
			opcion = JOptionPane.showInputDialog("Escriba 'Si' para finalizar el programa");
		}

		// Ciclo do-while
		do {
			opcion = JOptionPane.showInputDialog("Escriba 1 para finalizar el programa");
		} while(opcion.equalsIgnoreCase("1") != true);
	}
}