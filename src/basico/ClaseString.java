package basico;

public class ClaseString {
	public static void main(String[] args) {

		String palabra = "Colombia";

		// devuelve la longitud de una cadena
		int longitud = palabra.length();
		System.out.println(longitud);

		// devuelve el caracter especificado de una cadena
		char caracter = palabra.charAt(1);
		System.out.println(caracter);

		// extrae una parte de una cadena de texto
		String subCadena = palabra.substring(0, 5);
		System.out.println(subCadena);

		// convierte una cadena a mayusculas
		String cadenaMayusculas = palabra.toUpperCase();
		System.out.println(cadenaMayusculas);

		// convierte una cadena a minusculas
		String cadenaMinusculas = palabra.toLowerCase();
		System.out.println(cadenaMinusculas);

		// elimina los espacios en blanco que esten al inicio y al final de una cadena
		String palabraEspacios = " Hola mundo ";
		System.out.println(palabraEspacios.trim());
	}
}