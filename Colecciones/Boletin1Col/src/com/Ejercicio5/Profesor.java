package com.Ejercicio5;

import java.util.Collection;

public class Profesor extends Persona {

	public Profesor() {
		// TODO Auto-generated constructor stub
	}

	public Profesor(int edad, String nombre, Collection<Mensaje> mensajes) {
		super(edad, nombre, mensajes);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void enviarMensaje(String texto, Persona destinatario) {
		Mensaje mensaje = new Mensaje(texto, this, destinatario);
	    destinatario.mensajes.add(mensaje);
	}

}
