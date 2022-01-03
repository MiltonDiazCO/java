package colecciones;

import java.util.ArrayList;

public class ArrayLists {
	public static void main(String[] args) {

		// la clase ArrayList permite crear arreglos dinámicos
		ArrayList<String> arregloNombres = new ArrayList<String>();

		// el método add permite agregar elementos al arreglo
		arregloNombres.add("Juan");
		arregloNombres.add("Luis");

		// imprimiendo el tamaño del arreglo
		System.out.println(arregloNombres.size());

		// el método get permite acceder a un elemento en concreto del arreglo
		System.out.println(arregloNombres.get(1));

		// el método set permite reemplazar un elemento en concreto del arreglo
		arregloNombres.set(0, "Oscar");
	}
}