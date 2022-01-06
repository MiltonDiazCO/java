package colecciones;

import java.util.HashMap;

public class Mapas {
	public static void main(String[] args) {

		// los mapas se caracterizan por guardar los elementos con una clave y su valor
		HashMap<String, Ciudad> mapaCiudades = new HashMap<String, Ciudad>();

		// el método put permite agregar elementos a la colección
		mapaCiudades.put("1", new Ciudad("Bogota", 21, 8));
		mapaCiudades.put("2", new Ciudad("Medellin", 15, 6));
		mapaCiudades.put("3", new Ciudad("Cali", 19, 5));
		mapaCiudades.put("4", new Ciudad("Barranquilla", 12, 18));

		// recorriendo los valores del mapa
		for(HashMap.Entry<String, Ciudad> ciudad : mapaCiudades.entrySet()) {
			System.out.println(ciudad);
		}
	}
}

class Ciudad {

	private String nombreCiudad;
	private int latitud, longitud;

	public Ciudad(String nombreCiudad, int latitud, int longitud) {

		this.nombreCiudad = nombreCiudad;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public String toString() {
		return "[" + nombreCiudad + ", " + latitud + ", " + longitud + "]";
	}
}