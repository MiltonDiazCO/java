package basico;

public class Arreglos {
	public static void main(String[] args) {
		
		// Arreglos o vectores / unidimensionales 
		
		int[] arreglo = new int[3];
		
		arreglo[0] = 3;
		arreglo[1] = 6;
		arreglo[2] = 4;
		
		for(int valor : arreglo) {
			System.out.print(valor + ",");
		}
	}
}