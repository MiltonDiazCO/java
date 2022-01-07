package colecciones;

import java.util.LinkedList;

public class ListasEnlazadas {
	public static void main(String[] args) {

		// la clase LinkedList se utiliza para trabajar listas enlazadas
		LinkedList<String> listOne = new LinkedList<String>();

		listOne.add("Colombia");
		listOne.add("Mexico");
		listOne.add("Honduras");
		listOne.add("España");

		// eliminando un elemento de la lista
		listOne.remove(3);

		System.out.println(listOne);
	}
}