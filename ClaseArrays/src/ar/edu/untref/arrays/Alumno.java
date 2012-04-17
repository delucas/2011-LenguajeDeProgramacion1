package ar.edu.untref.arrays;

public class Alumno {

	private String nombre;
	
	public Alumno(String nombre) {
		this.nombre = nombre;
	}
	

	public String saludar(){
		return "Hola, soy " + this.nombre;
	}
	
	public String decirNombre(){
		return this.nombre;
	}
	
}
