package ar.edu.untref.arrays;

import org.junit.Assert;
import org.junit.Test;

public class AulaTests {

	@Test
	public void testQuePuedoCrearUnAulaVacia(){
		
		Alumno[] losAlumnos = new Alumno[50];
		Aula miAula = new Aula(losAlumnos);
		
		Assert.assertEquals(0, miAula.contarAlumnos());
		
	}
	
	@Test
	public void testQuePuedoCrearUnAulaConUnAlumno(){
		
		Alumno[] losAlumnos = new Alumno[50];
		
		Alumno tomasito = new Alumno("Tommy");
		losAlumnos[0] = tomasito;
				
		Aula miAula = new Aula(losAlumnos);
		
		Assert.assertEquals(1, miAula.contarAlumnos());
		Assert.assertNotNull(miAula.dameAlumno(0));
		
	}
	
	@Test
	public void testQuePuedoCrearUnAulaConDosAlumnoForma2(){
		
		Alumno tomasito = new Alumno("Tommy");
		Alumno juliancito = new Alumno("July");

		Alumno[] losAlumnos = {tomasito, null, null, juliancito};
				
		Aula miAula = new Aula(losAlumnos);
		
		Assert.assertEquals(2, miAula.contarAlumnos());
		
		Assert.assertNotNull(miAula.dameAlumno(0));
		Assert.assertNull(miAula.dameAlumno(1));
		Assert.assertNull(miAula.dameAlumno(2));
		Assert.assertNotNull(miAula.dameAlumno(3));
		
	}
	
	@Test
	public void testQuePuedoCrearUnAulaCon14Juanes(){
		
		final int CANTIDAD_DE_LUGARES = 50;
		
		Alumno[] losAlumnos = new Alumno[CANTIDAD_DE_LUGARES];
		
		for (int i = 0; i < 14; i ++) {
			losAlumnos[i] = new Alumno("Juan");
		}
				
		Aula miAula = new Aula(losAlumnos);
		
		Assert.assertEquals(14, miAula.contarAlumnos());
		
		for (int i = 0; i < 14; i++) {
			Assert.assertNotNull(miAula.dameAlumno(i));
		}
		
		for (int i = 14; i < CANTIDAD_DE_LUGARES; i++) {
			Assert.assertNull(miAula.dameAlumno(i));
		}
		
	}
	
	@Test
	public void testParaContarPorNombre(){
		
		final int CANTIDAD_DE_LUGARES = 50;
		
		Alumno[] losAlumnos = new Alumno[CANTIDAD_DE_LUGARES];
		
		for (int i = 0; i < 35; i ++) {
			losAlumnos[i] = new Alumno("Juan");
		}
				
		Aula miAula = new Aula(losAlumnos);
		
		Assert.assertEquals(35, miAula.contarPorNombre("Juan"));
		
	}
	
	@Test
	public void testParaContarPorNombreAlgunosNoJuan(){
		
		Alumno[] losAlumnos = {
				new Alumno("Juan"),
				null,
				new Alumno("Juliancito"),
				null,
				new Alumno("Juan")
		};
				
		Aula miAula = new Aula(losAlumnos);
		
		Assert.assertEquals(2, miAula.contarPorNombre("Juan"));
		
	}
	
}
