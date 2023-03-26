package com.model;

import java.time.LocalDateTime;
import java.util.Objects;


public class Vehiculo implements Comparable<Vehiculo> {

	private String marca;
	private String modelo;
	private String matricula;
	private Combustible combustible;
	private LocalDateTime fechaEntrada;
	private TipoVehiculo tipoVehiculo;
	
	public Vehiculo(String marca, String modelo, String matricula, Combustible combustible, LocalDateTime fechaEntrada,
			TipoVehiculo tipoVehiculo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.combustible = combustible;
		this.fechaEntrada = LocalDateTime.now();
		this.tipoVehiculo = tipoVehiculo;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the combustible
	 */
	public Combustible getCombustible() {
		return combustible;
	}

	/**
	 * @param combustible the combustible to set
	 */
	public void setCombustible(String combustible) {
		this.combustible = Combustible.valueOf(combustible.toUpperCase());
	}

	/**
	 * @return the fechaEntrada
	 */
	public LocalDateTime getFechaEntrada() {
		return fechaEntrada;
	}

	/**
	 * @param fechaEntrada the fechaEntrada to set
	 */


	/**
	 * @return the tipoVehiculo
	 */
	public TipoVehiculo getTipoVehiculo() {
		return tipoVehiculo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}
	@Override
	public boolean equals(Object obj) {
		boolean sonIguales= this == obj;

		if (!sonIguales && obj!=null && obj instanceof Vehiculo) {
			Vehiculo casteado = (Vehiculo) obj;
			sonIguales= Objects.equals(casteado.matricula,this.matricula);
		}

		return sonIguales;
	}

	/**
	 * @param tipoVehiculo the tipoVehiculo to set
	 */
	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = TipoVehiculo.valueOf(tipoVehiculo.toUpperCase());
	}

	@Override
	public int compareTo(Vehiculo otroVehiculo) {
		int compararFecha=0;
		//if (otroVehiculo == null) {
			//compararFecha= 1;
	    //}else {
	    	//compararFecha=this.fechaEntrada.compareTo(otroVehiculo.fechaEntrada);
	    //}
	  
	    //return compararFecha;
		   if (otroVehiculo == null || otroVehiculo.getFechaEntrada() == null) {
			   compararFecha= 1;
		    } else if (this.getFechaEntrada() == null) {
		    	compararFecha=-1;
		    } else {
		    	compararFecha= this.getFechaEntrada().compareTo(otroVehiculo.getFechaEntrada());
		    }
		return compararFecha;
	}
	@Override
	public String toString() {
		return String.format("El %s, marca %s, modelo %s, con matricula %s y combustible %s entró en esta fecha: %s]",
tipoVehiculo, marca, modelo, matricula, combustible, fechaEntrada);
	}
	
	
}
