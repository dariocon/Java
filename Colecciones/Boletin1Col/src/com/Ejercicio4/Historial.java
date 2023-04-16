package com.Ejercicio4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import com.Ejercicio2.Alumno;
import com.Ejercicio2.excepciones.AlumnoException;
import com.Ejercicio4.excepciones.PaginaException;

public class Historial {

	private List<Pagina> paginas;

	public Historial() {
		
		this.paginas = new ArrayList<>();
	}
    public Historial(Collection<Pagina> paginas) {
    	this();
    	this.paginas.addAll(paginas);
    }
	public void addPagina (Pagina pagina) throws PaginaException{
		//Si el historial está vacío, entonces se agrega la nueva página sin hacer ninguna comprobación.
		if (!paginas.isEmpty()) {
			if (pagina.getFechaHora().isBefore(this.paginas.get(paginas.size()-1).getFechaHora())) {
				 throw new PaginaException("Consulta anterior a la última introducida");
			}
				
		}this.paginas.add(pagina);
	           
	        
	}
	public void borrarPagina (Pagina pagina) throws PaginaException{
		//Si el historial está vacío, entonces se agrega la nueva página sin hacer ninguna comprobación.
		if (this.paginas.contains(pagina)) {
			this.paginas.remove(pagina);
		}else {
			throw new PaginaException("La página no existe");
		}
	}
	public void borrarHistorial () {
		 paginas.clear();
	}
    public String mostrarHistorialCompleto() {
    	
    	StringBuilder sb = new StringBuilder();
    	
        Iterator<Pagina> it = this.paginas.iterator();
        while (it.hasNext()) {
        	sb.append(it.next()).append(System.lineSeparator());;
        }
		return sb.toString();
    }
    public String mostrarHistorialDia(LocalDate dia) {
    	
    	StringBuilder sb = new StringBuilder();
    	
        Iterator<Pagina> it = this.paginas.iterator();
        while (it.hasNext()) {
        	Pagina pagina = it.next();
        	if (pagina.getFechaHora().getDayOfYear()==dia.getDayOfYear()) {
        		sb.append(pagina).append(System.lineSeparator());;
        	}
        	
        }
		return sb.toString();
    }
    @Override
	public String toString() {
		return String.format("%s %n", paginas);
	}
	
	

}
