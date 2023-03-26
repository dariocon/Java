package com;

import java.time.LocalDateTime;
import java.util.Arrays;

import com.model.Combustible;
import com.model.Parking;
import com.model.TipoVehiculo;
import com.model.Vehiculo;

public class Main {

	public static void main(String[] args) {
		Parking a = new Parking();
		
		
		
		
		a.acceder(new Vehiculo("Renault", "Clío", "5678FFJ", Combustible.GASOLINA, LocalDateTime.now(), TipoVehiculo.TRANSPORTE_MERCANCIAS));
		a.acceder(new Vehiculo("Ford", "Mondeo", "5789FFJ", Combustible.GASOLINA, LocalDateTime.now().plusDays(3), TipoVehiculo.AUTOMOVIL));
		a.acceder(new Vehiculo("BMW", "X6", "5790FFJ", Combustible.GASOLINA, LocalDateTime.now().plusDays(6), TipoVehiculo.TRANSPORTE_MERCANCIAS));
		a.acceder(new Vehiculo("Audi", "Q8", "5900FFJ", Combustible.GASOIL, LocalDateTime.now().plusDays(7), TipoVehiculo.AUTOMOVIL));
		
		
		//System.out.println(a);
		
		
		//System.out.println("Ordenar por fecha de entrada");
		//System.out.println(p.Arrays.sort());	
		
		System.out.println("Ordenar por combustible y tipo de vehículo");
		System.out.println(a.compararPorCombustibleTipo());
		System.out.println("Ordenar por matrícula");
		System.out.println(a.compararPorMatricula());
		System.out.println("Ordenar por marca y modelo");
		System.out.println(a.compararPorMarcaModelo());
		//El método de fecha me salta NullPointerException.
		System.out.println(a.compararPorFechaEntrada());
	}

}
