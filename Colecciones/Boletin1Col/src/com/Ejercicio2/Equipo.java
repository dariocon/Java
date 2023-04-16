package com.Ejercicio2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.Ejercicio2.excepciones.AlumnoException;

public class Equipo {
	private String nombre;
    private Set<Alumno> alumnos;

    public Equipo() {
    	super();
        this.alumnos = new HashSet<>();

    }
    public Equipo(String nombre) {
    	this();
    	this.nombre = nombre;
    	
    }
    
    public Equipo(String nombre, Collection<Alumno> alumnos) {
    	this(nombre);
    	this.alumnos.addAll(alumnos);
    }

    public String getNombre() {
        return nombre;
    }

    public void addAlumno(Alumno alumno) throws AlumnoException {
        if (contieneAlumno(alumno)!=null) {
            throw new AlumnoException("El alumno ya está en el equipo");
        }
        this.alumnos.add(alumno);
    }

    public void borrarAlumno(Alumno alumno) throws AlumnoException {
        /*if (!alumnos.contains(alumno)) {
            throw new Exception("El alumno no está en el equipo");
        }
        alumnos.remove(alumno);*/
        
    	/*Iterator<Alumno> it = this.alumnos.iterator();
        boolean encontrado = false;
        while (it.hasNext()) {
        	if(it.next().equals(alumno)) {
        		it.remove();
        		encontrado = true;
                break;
        		
        	}
        }if (!encontrado) {
        	throw new AlumnoException("El alumno no está en el equipo");
        }*/
    	if(this.alumnos.contains(alumno)) {
			this.alumnos.remove(alumno);
		}else {
			throw new AlumnoException("El alumno no existe");
		}
    }

    public Alumno contieneAlumno(Alumno alumno) {
        return this.alumnos.contains(alumno)?alumno:null;
    	}

    public String mostrarAlumnos() {
    	
    	StringBuilder sb = new StringBuilder();
    	
        Iterator<Alumno> it = this.alumnos.iterator();
        System.out.println("El iterador: ");
        while (it.hasNext()) {
        	sb.append(it.next()).append(System.lineSeparator());;
        }
		return sb.toString();
    }
    
    

    public Equipo union(Equipo otroEquipo) {
    	
        Set<Alumno> union = new HashSet<>();
        

        // Agregamos los alumnos del primer equipo
        Iterator<Alumno> iterador = this.alumnos.iterator();
        while (iterador.hasNext()) {
            union.add(iterador.next());
        }

        iterador = otroEquipo.alumnos.iterator();
        while (iterador.hasNext()) {
            if (!union.contains(iterador.next())) {
                union.add(iterador.next());
            }
        }
        Equipo equipoUnido = new Equipo(nombre + " y " + otroEquipo.nombre, union); 

        return equipoUnido;
    }


    public Equipo interseccionEquipos(Equipo otroEquipo) {
        Set<Alumno> interseccion = new HashSet<>(this.alumnos);

        interseccion.retainAll(otroEquipo.alumnos);
        
        Equipo equipoIntersectivo = new Equipo(nombre + " y " + otroEquipo.nombre, interseccion); 
        
        
        
        return equipoIntersectivo;
    }
	public Set<Alumno> getAlumnos() {
		
		return alumnos;
	}

}



