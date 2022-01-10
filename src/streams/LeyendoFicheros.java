package streams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class LeyendoFicheros {

	public static void main(String[] args) {

		try {
			
			String ruta = JOptionPane.showInputDialog("Digite la ruta del archivo que desea leer");
			
			// la clase FileReader nos permite leer datos de un archivo
			FileReader entrada = new FileReader(ruta);

			// leyendo el primer caracter del archivo
			int lecturaEntrada = entrada.read();
			System.out.print((char) lecturaEntrada);

			// impriemiendo el contenido del archivo, -1 indica el final del archivo
			while (lecturaEntrada != -1) {

				lecturaEntrada = entrada.read();

				if (lecturaEntrada != -1) {
					System.out.print((char) lecturaEntrada);
				}
			}

			entrada.close();

		} catch (FileNotFoundException e) {
			System.out.println("No se encontro el archivo");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}