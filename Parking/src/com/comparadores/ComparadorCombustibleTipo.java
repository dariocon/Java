package com.comparadores;

import java.util.Comparator;

import com.model.Vehiculo;

public class ComparadorCombustibleTipo implements Comparator<Vehiculo> {
	@Override
    public int compare(Vehiculo vehiculo1, Vehiculo vehiculo2) {
        int comparacionTipoCombustible = 0;
        
        if (vehiculo1 == null && vehiculo2 == null) {
            comparacionTipoCombustible = 0;
        } else if (vehiculo1 == null) {
            comparacionTipoCombustible = 1;
        } else if (vehiculo2 == null) {
            comparacionTipoCombustible = -1;
        } else {
            comparacionTipoCombustible = vehiculo1.getTipoVehiculo().compareTo(vehiculo2.getTipoVehiculo());
            if (comparacionTipoCombustible == 0) {
                comparacionTipoCombustible = vehiculo1.getCombustible().compareTo(vehiculo2.getCombustible());
            }
        }
        
        return comparacionTipoCombustible;
	}

}
