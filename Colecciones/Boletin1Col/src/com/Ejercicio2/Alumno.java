package com.Ejercicio2;

import java.util.Objects;




public class Alumno {
	
	private String nombre;
	private String dni;
	
	public Alumno(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}
	


	public String getNombre() {
	    return nombre;
	}
	
	public String getDni() {
	    return dni;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dni, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		boolean sonIguales= this == obj;

		if (!sonIguales && obj!=null && obj instanceof Alumno) {
			Alumno casteado = (Alumno) obj;
			sonIguales= Objects.equals(casteado.nombre,this.nombre) && Objects.equals(casteado.dni,this.dni) ;
		}

		return sonIguales;
	}
	public String toString() {
		return String.format("Alumno con nombre %s y dni %s", 
							 this.nombre, this.dni);
	}

	

}
