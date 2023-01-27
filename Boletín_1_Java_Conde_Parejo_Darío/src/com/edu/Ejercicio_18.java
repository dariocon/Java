package com.edu;

public class Ejercicio_18 {
	/* Realizar un método llamado calcularAreaCirculo que devuelva el 
	 * área de un círculo
	y otro llamado calcularLongitudCirculo que devuelva su longitud.*/

	public static double calcularAreaCirculo(double radio) {

		double area = Math.pow(radio, radio)*Math.PI;
		
		return area;
		
	}
	public static double calcularLongitudCirculo(double radio) {
		double longitud = (radio*2)*Math.PI;
		
		return longitud;
	}

}
