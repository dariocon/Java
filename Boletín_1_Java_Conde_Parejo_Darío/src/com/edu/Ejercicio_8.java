package com.edu;

import java.util.Scanner;

public class Ejercicio_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce un número: ");
		Scanner scannner= new Scanner(System.in);
		Integer numero = scannner.nextInt();
		int suma=0;
		
		for (int i=1;i<=15;i++) {
			suma+=numero;
			System.out.println("Introduce un número: ");
			numero = scannner.nextInt();
			
		
		}
		System.out.println("Fin del programa. La suma de todos los números es "+suma);
	}

}
