package com.Ejercicio5;

import java.util.Collection;

public class Alumno extends Persona {

	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	public Alumno(int edad, String nombre, Collection<Mensaje> mensajes) {
		super(edad, nombre, mensajes);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void enviarMensaje(String texto, Persona destinatario) throws Exception {
		if (this.edad<18 && !(destinatario instanceof Profesor)) {
			  throw new Exception("El alumno es menor de edad.");
			
		}else {
			Mensaje mensaje = new Mensaje(texto, this, destinatario);
		    destinatario.mensajes.add(mensaje);
		}
	}

}
