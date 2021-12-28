package basico;

public class ClaseMath {
	public static void main(String[] args) {
		
		// la clase Math permite hacer calculos matematicos
		
		// calcular raíz cuadrada
		double raiz = Math.sqrt(9.0);
		System.out.println(raiz);
		
		// redondear un número
		int numRound = Math.round(3.0F);
		System.out.println(numRound);

		// elevar un número a una potencia
		int numPotencia = (int) Math.pow(5.0, 3.0);
		System.out.println(numPotencia);		
	}
}