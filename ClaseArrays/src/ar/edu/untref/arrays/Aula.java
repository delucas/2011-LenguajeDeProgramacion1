package ar.edu.untref.arrays;

public class Aula {

	Alumno[] losAlumnos;
	
	public Aula(Alumno[] losAlumnos){
		this.losAlumnos = losAlumnos;
	}

	public int contarAlumnos() {
		
		int contador = 0;
		for (int i = 0; i < losAlumnos.length; i++){
			if (losAlumnos[i] != null) {
				contador  ++;
			}
		}
		
		return contador;
		
	}

	public Alumno dameAlumno(int i) {
		return losAlumnos[i];
	}

	public int contarPorNombre(String nombre) {
		int contador = 0;
		for (int i = 0; i < losAlumnos.length; i++){
			if (losAlumnos[i] != null && "Juan".equals(losAlumnos[i].decirNombre())) {
				contador  ++;
			}
		}
		
		return contador;
		
	}
	
}
