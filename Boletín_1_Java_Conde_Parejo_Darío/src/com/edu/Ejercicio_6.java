package com.edu;

import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Programar un sistema de calefacción-refrigeración que compruebe en función del
día y el mes, la estación en la que estamos y dependiendo de la estación programe
la temperatura: Invierno→19º, Primavera→20º, Verano→24º, Otoño→19º.
El método deberá recibir como parámetro el mes y el día actual y devolver los
grados a los que deberemos programar el sistema. */
		
		String ESTACION="";
		System.out.println("Introduce el mes: ");
		Scanner scanner= new Scanner(System.in);
		int mes= Integer.valueOf(scanner.nextLine());
		System.out.println("Introduce el dia: ");
		Scanner scannneer= new Scanner(System.in);
		int dia= Integer.valueOf(scanner.nextLine());
		
		if (mes == 12 || mes == 1 || mes == 2 || mes == 3) {
			if ((mes==12 & dia>=21) || (mes==3 & dia<20)) 
				ESTACION = "INVIERNO";
			
		}else if (mes == 3 || mes == 4 || mes == 5) {
			if ((mes==3 & dia>=20) || (mes==6 & dia<21)) 
				ESTACION = "PRIMAVERA";
			
		}else if  (mes == 6 || mes == 7 || mes == 8) {
			if ((mes==6 & dia>=21) || (mes==9 & dia<23)) 
				ESTACION = "VERANO";
		}else if (mes == 9 || mes == 10 || mes == 11) {
			if ((mes==9 & dia>=23) || (mes==12 & dia<21)) 
				ESTACION = "OTOÑO";
		}else {
			ESTACION = "ERROR";
		}
		
		System.out.println("La estación es " + ESTACION);
	}

}
