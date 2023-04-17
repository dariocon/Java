package com.Ejercicio5.comparador;

import java.util.Comparator;

import com.Ejercicio5.Mensaje;

public class ComparadorAlfabetico implements Comparator<Mensaje> {

	public int compare(Mensaje mensaje1, Mensaje mensaje2) {
		int compararNombre = 0;
		 if (mensaje1 == null && mensaje2 == null) {
			 compararNombre = 0;
	     } else if (mensaje1 == null) {
	    	 compararNombre = 1;
	     } else if (mensaje2 == null) {
	    	 compararNombre = -1;
	     } else {
	    	 compararNombre = mensaje1.getRemitente().getNombre().compareTo(mensaje2.getRemitente().getNombre());
	     }
	    	
	    return compararNombre;
	}

}
