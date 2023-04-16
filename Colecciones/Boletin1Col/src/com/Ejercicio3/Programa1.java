package com.Ejercicio3;

import java.util.ArrayList;
import com.Ejercicio3.EquipoGenerico;
import com.Ejercicio3.excepciones.AlumnoException;
import com.Ejercicio3.Alumno;
import java.util.List;


public class Programa1 {

	public static void main(String[] args) throws AlumnoException {
		
		/* Equipo equipo1 = new Equipo("Equipo1");
	     Equipo equipo2 = new Equipo("Equipo2");

	     Alumno alumno1 = new Alumno("Juan", "12345678A");
	     Alumno alumno2 = new Alumno("Pedro", "23456789B");
	     Alumno alumno3 = new Alumno("María", "34567890C");

	     equipo1.addAl*/
	     
	   //Ejemplo de carga de alumnos repetidos
		EquipoGenerico<Alumno> equipoA = new EquipoGenerico<Alumno>("Equipo A");
		EquipoGenerico<Integer> equipoB = new EquipoGenerico<Integer>("Equipo B");
		
		Alumno al1 = new Alumno("Juanito", "12385678A");
	    Alumno al2 = new Alumno("Pedro Piqué", "23416789B");
	    equipoA.addAlumno(al1);
	    equipoA.addAlumno(al2);
	    equipoA.addAlumno(new Alumno("Trinidad", "34767890C"));
	    equipoA.addAlumno(new Alumno("Luis", "34567990C"));
			
			
	    System.out.println(equipoA.mostrarAlumnos());
	    

	    equipoB.addAlumno(1);
	    equipoB.addAlumno(2);
	    equipoB.addAlumno(3);
	    equipoB.addAlumno(4);
	     

	     
			
	    try {
	    	 equipoA.addAlumno(al2);
				
				//¡¡NUNCA!! hacer lo siguiente:
				// equipoA.getAlumnos().add(al2);
				
	    } catch (AlumnoException e) {
				System.out.println("La excepción ha funcionado correctamente");

	     }
	    try {
	    	 equipoB.addAlumno(1);
				
				//¡¡NUNCA!! hacer lo siguiente:
				// equipoA.getAlumnos().add(al2);
				
	    } catch (AlumnoException e) {
				System.out.println("La excepción ha funcionado correctamente");

	     }
			
	     System.out.println(equipoB.mostrarAlumnos());
	     System.out.println(equipoB.contieneAlumno(1)!=null?"El equipo contiene al alumno": "El alumno no está en el equipo");
			
	     try {
	    	 equipoB.borrarAlumno(1);

	     } catch (AlumnoException e) {
	    	 System.out.println("No se ha podido borrar el alumno porque no se encuentra en este equipo.");
	     }
	     System.out.println(equipoB.contieneAlumno(1)!=null?"El equipo contiene al alumno": "El alumno no está en el equipo");
			


		

	}

}
