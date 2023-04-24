package com.Ejercicio8;

import java.util.ArrayList;
import java.util.List;

import com.Ejercicio2.Alumno;
import com.Ejercicio2.Equipo;
import com.Ejercicio2.excepciones.AlumnoException;

public class Programa {

	public static void main(String[] args) throws Exception {
		
		/* Equipo equipo1 = new Equipo("Equipo1");
	     Equipo equipo2 = new Equipo("Equipo2");

	     Alumno alumno1 = new Alumno("Juan", "12345678A");
	     Alumno alumno2 = new Alumno("Pedro", "23456789B");
	     Alumno alumno3 = new Alumno("María", "34567890C");

	     equipo1.addAl*/
	     
	   //Ejemplo de carga de alumnos repetidos
	     List<Alumno> alumnos = new ArrayList<>();
	     Alumno al1 = new Alumno("Juan Luque", "12345678A");
	     Alumno al2 = new Alumno("Pedro Piqueras", "23456789B");
	     alumnos.add(al1);
	     alumnos.add(al1);
	     alumnos.add(al2);
	     alumnos.add(al2);
	     alumnos.add( new Alumno("María", "34567890C"));
	     alumnos.add( new Alumno("Luis García", "34567890C"));
			
			
			
	     Equipo equipoA = new Equipo("EquipoA", alumnos);
			
	    try {
	    	 equipoA.addAlumno(al2);
				
				//¡¡NUNCA!! hacer lo siguiente:
				// equipoA.getAlumnos().add(al2);
				
	    } catch (AlumnoException e) {
				System.out.println("La excepción ha funcionado correctamente");

	     }
			
	     System.out.println(equipoA.mostrarAlumnos());
	     System.out.println(equipoA.contieneAlumno(al2)!=null?"El equipo contiene al alumno": "El alumno no está en el equipo");
			
	     try {
	    	 equipoA.borrarAlumno(al2);

	     } catch (AlumnoException e) {
	    	 System.out.println("No se ha podido borrar el alumno porque no se encuentra en este equipo.");
	     }
	     System.out.println(equipoA.contieneAlumno(al2)!=null?"El equipo contiene al alumno": "El alumno no está en el equipo");
			


		

	}

}
