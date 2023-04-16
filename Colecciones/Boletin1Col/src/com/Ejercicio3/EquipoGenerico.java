package com.Ejercicio3;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.Ejercicio3.excepciones.AlumnoException;

public class EquipoGenerico <T> {
	private String nombre;
    private Set<T> alumnos;

    public EquipoGenerico() {
    	super();
        this.alumnos = new HashSet<>();

    }
    public EquipoGenerico(String nombre) {
    	this();
    	this.nombre = nombre;
    	
    }
    
    public EquipoGenerico(String nombre, Collection<T> alumnos) {
    	this(nombre);
    	this.alumnos.addAll(alumnos);
    }

    public String getNombre() {
        return nombre;
    }

    public void addAlumno(T alumno) throws AlumnoException {
        if (contieneAlumno(alumno)!=null) {
            throw new AlumnoException("El alumno ya está en el equipo");
        }
        this.alumnos.add(alumno);
    }

    public void borrarAlumno(T alumno) throws AlumnoException {
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

    public T contieneAlumno(T alumno) {
        return this.alumnos.contains(alumno)?alumno:null;
    	}

    public String mostrarAlumnos() {
    	
    	StringBuilder sb = new StringBuilder();
    	
        Iterator<T> it = this.alumnos.iterator();
        System.out.println("El iterador: ");
        while (it.hasNext()) {
        	sb.append(it.next()).append(System.lineSeparator());;
        }
		return sb.toString();
    }
    
    

    public EquipoGenerico<T> union(EquipoGenerico<T> otroEquipo) {
    	
        Set<T> union = new HashSet<>();
        

        // Agregamos los alumnos del primer equipo
        Iterator<T> iterador = this.alumnos.iterator();
        while (iterador.hasNext()) {
            union.add(iterador.next());
        }

        iterador = otroEquipo.alumnos.iterator();
        while (iterador.hasNext()) {
            if (!union.contains(iterador.next())) {
                union.add(iterador.next());
            }
        }
        EquipoGenerico<T> equipoUnido = new EquipoGenerico<T>(nombre + " y " + otroEquipo.nombre, union); 

        return equipoUnido;
    }


    public EquipoGenerico<T> interseccionEquipos(EquipoGenerico<T> otroEquipo) {
        Set<T> interseccion = new HashSet<>(this.alumnos);

        interseccion.retainAll(otroEquipo.alumnos);
        
        EquipoGenerico<T> equipoIntersectivo = new EquipoGenerico<T>(nombre + " y " + otroEquipo.nombre, interseccion); 
        
        
        
        return equipoIntersectivo;
    }
	public Set<T> getAlumnos() {
		
		return alumnos;
	}

}



