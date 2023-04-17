package com.Ejercicio5;

import java.time.LocalDateTime;
import java.util.Objects;


public class Mensaje {

	private String texto;
	private LocalDateTime fecha;
	private  Persona remitente;
	private Persona destinatario;
	
	public Mensaje(String texto, Persona remitente, Persona destinatario) {
		super();
		this.texto = texto;
		this.fecha = LocalDateTime.now();
		this.remitente = remitente;
		this.destinatario = destinatario;

	}

	public String getTexto() {
		return texto;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public Persona getRemitente() {
		return remitente;
	}
	@Override
	public int hashCode() {
		return Objects.hash(texto, fecha, remitente, destinatario);
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean sonIguales= this == obj;

		if (!sonIguales && obj!=null && obj instanceof Mensaje) {
			Mensaje casteado = (Mensaje) obj;
			sonIguales= Objects.equals(casteado.fecha, this.fecha) &&
					Objects.equals(casteado.texto, this.texto) 
					&& Objects.equals(casteado.remitente, this.remitente) &&
					Objects.equals(casteado.destinatario, this.destinatario);
;
		}

		return sonIguales;
	}

	
	@Override
	public String toString() {
	    return String.format("Mensaje: %s. Fecha: %s. De: %s. Para: %s.", texto, fecha, remitente.getNombre(), destinatario.getNombre());
	}


	public Persona getDestinatario() {
		return destinatario;
	}
	
	
	

}
