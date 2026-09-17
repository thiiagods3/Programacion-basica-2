package ar.edu.unlam.pb2;



public class Pelicula {
	//titulo genero duracion edad minima sinopsis
	
	private String titulo;
	private Genero genero;
	private int duracion;
	private int edadMinima;
	private String sinopsis;
	
	public Pelicula(String titulo, Genero genero, int duracion, int edadMinima) {
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
		this.edadMinima = edadMinima;
	}
	
	public boolean puedeVerla(int edad) {
		return edad >= edadMinima;
	}
	
	
	public boolean puedeVerla(int edad, boolean cuotaAlDia) {
		if (!this.puedeVerla(edad)) {
			return false;
		}
		if (!cuotaAlDia) {
			return false;
		}
		return true;
	}
	
	
	
	
	

}
