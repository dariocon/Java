package com.comparadores;

import java.util.Comparator;

import com.model.Vehiculo;

public class ComparadorMatricula implements Comparator<Vehiculo> {
	public int compare(Vehiculo vehiculo1, Vehiculo vehiculo2) {
		int compararMatricula = 0;
		 if (vehiculo1 == null && vehiculo2 == null) {
			 compararMatricula = 0;
	     } else if (vehiculo1 == null) {
	    	 compararMatricula = 1;
	     } else if (vehiculo2 == null) {
	    	 compararMatricula = -1;
	     } else {
	    	 compararMatricula = vehiculo1.getMatricula().compareTo(vehiculo2.getMatricula());
	     }
	    	
	    return compararMatricula;
	}
	

}           


