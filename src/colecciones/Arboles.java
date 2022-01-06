package colecciones;

import java.util.TreeSet;

public class Arboles {
	public static void main(String[] args) {

		// la clase TreeSet se utiliza para trabajar colecciones de tipo árbol
		TreeSet<String> treeOne = new TreeSet<String>();

		treeOne.add("Madrid");
		treeOne.add("New York");
		treeOne.add("Caracas");
		treeOne.add("Bogota");

		System.out.println(treeOne);
	}
}