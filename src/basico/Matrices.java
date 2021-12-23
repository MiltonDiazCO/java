package basico;

import javax.swing.JOptionPane;

public class Matrices {
	public static void main(String[] args) {
		
		// matrices - bidimensionales

		int filas = Integer.parseInt(JOptionPane.showInputDialog("Escriba el número de filas"));
		
		int columnas = Integer.parseInt(JOptionPane.showInputDialog("Escriba el numero de columnas"));
		
		// definiendo la matriz
		int[][] arregloNumeros = new int[filas][columnas];	
		
		// llenando la matriz con números aleatorios
		for(int i = 0; i < filas; i++) {
			for(int j = 0; j < columnas; j++) {
				arregloNumeros[i][j] = (int) Math.round(Math.random() * 100);
			}
		}
		
		// imprimir por pantalla los valores de la matriz
		for(int z = 0; z < filas; z++) {
			for(int h = 0; h < columnas; h++) {
				System.out.print(arregloNumeros[z][h] + ",");
			}
			System.out.println();
		}		
	}
}