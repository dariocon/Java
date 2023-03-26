package com.comparadores;

import java.util.Comparator;

import com.model.Vehiculo;

public class ComparadorMarcaModelo implements Comparator<Vehiculo>{
	
	@Override
	public int compare(Vehiculo vehiculo1, Vehiculo vehiculo2) {
		int comparacionMarcaModelo = 0;
        
        if (vehiculo1 == null && vehiculo2 == null) {
            comparacionMarcaModelo = 0;
        }else if (vehiculo1 == null) {
            comparacionMarcaModelo = 1;
        }else if (vehiculo2 == null) {
            comparacionMarcaModelo = -1;
        }else {
            comparacionMarcaModelo = vehiculo1.getMarca().compareTo(vehiculo2.getMarca());
            if (comparacionMarcaModelo == 0) {
                comparacionMarcaModelo = vehiculo1.getModelo().compareTo(vehiculo2.getModelo());
            }
        }
        
        return comparacionMarcaModelo;
    }
}
