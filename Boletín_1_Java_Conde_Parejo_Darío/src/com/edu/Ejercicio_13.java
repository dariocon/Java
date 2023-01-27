package com.edu;

import java.util.Scanner;

public class Ejercicio_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Programa que reciba 10 números y nos indique el valor máximo y mínimo.*/
		System.out.println("Introduce un número: ");
		Scanner scannner= new Scanner(System.in);
		Integer numero = scannner.nextInt();
		int valorMaximo=0;
		int valorMinimo=0;
		
		for (int i=0;i<11;i++) {
			if (numero>valorMaximo) {
				valorMaximo=numero;
			}
			else if (numero<valorMinimo) {
				valorMinimo=numero;
			}
			System.out.println("Introduce un número: ");
			numero = scannner.nextInt();

		}
		System.out.println(valorMaximo);
		System.out.println(valorMinimo);
		
	
		
	}

}
