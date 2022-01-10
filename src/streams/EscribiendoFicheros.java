package streams;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class EscribiendoFicheros {

	public static void main(String[] args) {

		String frase = "Escribiendo..";

		String ruta = JOptionPane.showInputDialog("Digite la ruta y extension del archivo");
		
		try {
			// la clase FileWriter nos permite escribir caracteres en un fichero
			FileWriter escritor = new FileWriter(ruta);

			escritor.write(frase);
			escritor.flush();
			escritor.close();
			
			System.out.println("Archivo modificado o creado correctamente");

		} catch (IOException e) {
			System.out.println("No se encontro el archivo");
		}
	}
}