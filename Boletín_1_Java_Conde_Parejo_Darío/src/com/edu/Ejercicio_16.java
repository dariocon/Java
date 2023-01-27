package com.edu;

import java.util.Scanner;

public class Ejercicio_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Pedir 10 valores numéricos que representan el salario mensual de 10 empleados.
		Mostrar su suma y cuantos hay mayores de 1000€.*/
		
		System.out.println("Introduce un número: ");
		Scanner scannner= new Scanner(System.in);
		Integer salario = scannner.nextInt();
		int salarioMayor1000=0;
		int suma=0;
		
		for (int i=0;i<10;i++) {
			suma+=salario;
			if (salario>1000) {
				salarioMayor1000+=1;
			}
			System.out.println("Introduce un número: ");
			salario = scannner.nextInt();
		}
			
		System.out.println(suma);
		System.out.println(salarioMayor1000);
			
			
			

			
			
		
	}

}
