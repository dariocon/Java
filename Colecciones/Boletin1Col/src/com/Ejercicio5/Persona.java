package com.Ejercicio5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


import com.Ejercicio5.comparador.ComparadorAlfabetico;

public abstract class Persona {

	protected int edad;
	protected String nombre;
	protected List<Mensaje> mensajes;
	protected int numeroMensaje=1;
	
	public Persona() {
		
		this.mensajes = new ArrayList<>();
	}
    public Persona(int edad, String nombre, Collection<Mensaje> mensajes) {
    	this();
    	this.edad=edad;
    	this.nombre=nombre;
    	this.mensajes.addAll(mensajes);
    }
	public int getEdad() {
		return edad;
	}
	public String getNombre() {
		return nombre;
	}
	protected abstract void enviarMensaje(String texto, Persona destinatario) throws Exception;
	
	public String leerMensajes () throws Exception {
	    if (this.mensajes.isEmpty()) {
	        throw new Exception("No hay mensajes para leer.");
	    }

    	StringBuilder sb = new StringBuilder();
    	numeroMensaje = 1;
        Iterator<Mensaje> it = this.mensajes.iterator();
        while (it.hasNext()) {
        	Mensaje mensaje = it.next();
        	sb.append("Mensaje ").append(numeroMensaje++)
        	.append(": De: ").append(mensaje.getRemitente().getNombre())
        	.append(" Texto: ")
        	.append(mensaje.getTexto())
        	.append(" Fecha y hora: ")
        	.append(mensaje.getFecha())
        	.append(System.lineSeparator());
        }
        
        
		return sb.toString();
		
	}
	public String leerMensajesAlfabeticamente () throws Exception{
		//Si leerMensaje recibiera una lista:
		
		/*List<Mensaje> mensajesOrdenados = new ArrayList<>(this.mensajes);
		  mensajesOrdenados.sort(new ComparadorAlfabetico());
	    
		return leerMensajes(mensajesOrdenados);*/
		mensajes.sort(new ComparadorAlfabetico());
		return leerMensajes();
	
	}
	public void borrarMensaje(int numeroMensaje) throws Exception {
	    int posicion = numeroMensaje - 1; 
	    if (posicion >= 0 && posicion < this.mensajes.size()) {
	    	this.mensajes.remove(posicion);
	            
	    }else {
	    
	    throw new Exception("El mensaje no existe.");
	    }
	}
    public String buscarMensajesPorFrase(String frase) {
    	
    	StringBuilder sb = new StringBuilder();
    	
        Iterator<Mensaje> it = this.mensajes.iterator();
        while (it.hasNext()) {
        	Mensaje mensaje = it.next();
        	if (mensaje.getTexto().contains(frase)){
        		sb.append(mensaje).append(System.lineSeparator());;
        	}
        	
        }
		return sb.toString();
    }


	public int getNumeroMensaje() {
		return numeroMensaje;
	}
	
	
	
}
