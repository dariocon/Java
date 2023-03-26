package com.model;

import java.util.Arrays;

import com.comparadores.ComparadorCombustibleTipo;
import com.comparadores.ComparadorMarcaModelo;
import com.comparadores.ComparadorMatricula;

public class Parking {

	private static final int MAX_SIZE = 50;
	private Vehiculo[] vehiculo;
	
	
	public Parking() {
		super();
		this.vehiculo=  new Vehiculo[MAX_SIZE];
		
	}
	
	public boolean acceder(Vehiculo vehiculoEntrante) {
		boolean acceso=false;

		for (int i=0;i<vehiculo.length && !acceso;i++) {
			if (this.vehiculo[i]==null) {
				this.vehiculo[i]=vehiculoEntrante;
				acceso=true;
			}

		}
	  
		if (!acceso) {
			throw new IllegalStateException("El estacionamiento está lleno");
			}
		return acceso;
		
	}
	public boolean salir(Vehiculo vehiculoSaliente) {
		boolean salida=false;
		//Lo ideal sería usar stream y filter en vez de un bucle.
		for (int i=0;i<vehiculo.length && !salida;i++) {
			if (this.vehiculo[i].getMatricula().equals(vehiculoSaliente.getMatricula())) {
				this.vehiculo[i]=null;
				salida=true;
			}
		}
		if (!salida) {
	        throw new IllegalArgumentException("El vehículo no se encuentra en el estacionamiento");
	    	}
		return salida;
	
			
	}

	public String compararPorCombustibleTipo() {
		Arrays.sort(this.vehiculo,new ComparadorCombustibleTipo());
		return arrayToString();
	}
	public String compararPorFechaEntrada() {
		Arrays.sort(vehiculo);
		return arrayToString();
	}
	public String compararPorMarcaModelo() {
		Arrays.sort(this.vehiculo,new ComparadorMarcaModelo());
		return arrayToString();
	}
	public String compararPorMatricula() {
		Arrays.sort(this.vehiculo,new ComparadorMatricula());
		return arrayToString();
	}
	private String arrayToString() {
	    StringBuilder sb = new StringBuilder();
	    for(int i = 0; i < this.vehiculo.length; i++) {
	        if(this.vehiculo[i] != null) {
	            sb.append(this.vehiculo[i]).append("\n");
	        }   
	    }
	    return sb.toString();
	}

	
	
	
	
	

	
	
	

}
