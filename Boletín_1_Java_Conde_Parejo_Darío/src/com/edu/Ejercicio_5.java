package com.edu;

import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /* Realiza un método que reciba una hora por parámetro y que muestre luego buenos
días, buenas tardes o buenas noches según corresponda. Se utilizarán los tramos
de 6 a 12, de 13 a 20 y de 21 a 5, respectivamente, sólo teniendo en cuenta el valor
de las horas.
 */
		
		System.out.println("Introduce el mes: ");
		Scanner scanner= new Scanner(System.in);
		int hora= 0;	 
		if (hora>=6 & hora<13) {
			System.out.println("Buenos días");
		}else if (hora>=13 & hora<21) {
			System.out.println("Buenas tardes");
		}else if (hora>=21 & hora<6) {
			System.out.println("Buenas noches");
		}
		
		

	}

}
