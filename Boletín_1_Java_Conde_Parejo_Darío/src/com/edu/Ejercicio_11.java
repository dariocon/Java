package com.edu;

import java.util.Scanner;

public class Ejercicio_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce un número: ");
		Scanner scannner= new Scanner(System.in);
		Integer numero = scannner.nextInt();
		int cuadrado=0;
		
		cuadrado=numero*numero;
		while (numero>=0) {
			System.out.println(cuadrado);
			System.out.println("Introduce un número: ");
			numero = scannner.nextInt();

		}
		
	}

}
