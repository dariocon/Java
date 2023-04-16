package com.Ejercicio4;

import java.time.LocalDateTime;
import java.util.Objects;

import com.Ejercicio2.Alumno;

public class Pagina {

	private String url;
	private LocalDateTime fechaHora;
	
	public Pagina(String url, LocalDateTime fechaHora) {
		super();
		this.url = url;
		this.fechaHora = LocalDateTime.now();
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaHora, url);
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean sonIguales= this == obj;

		if (!sonIguales && obj!=null && obj instanceof Pagina) {
			Pagina casteado = (Pagina) obj;
			sonIguales= Objects.equals(casteado.fechaHora, this.fechaHora) && Objects.equals(url, this.url);
		}

		return sonIguales;
	}

	public String getUrl() {
		return url;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}
	@Override
	public String toString() {
		return String.format("%s, se visito el %s", url, fechaHora);
	}
	
	
		
	

}
