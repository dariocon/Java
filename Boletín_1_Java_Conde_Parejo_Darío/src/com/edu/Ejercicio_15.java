package com.edu;

import java.util.Scanner;

public class Ejercicio_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Crea un programa que permita sumar N números. El usuario decide cuándo termina
		de introducir números al indicar la palabra ‘fin’.*/
		
		System.out.println("Introduce un número: ");
		Scanner scannner= new Scanner(System.in);
		String numCadena = scannner.nextLine();
		int numeros=0;
		
		while (!numCadena.equals("fin")) {
			int numero = Integer.parseInt(numCadena);
			numeros+=numero;
			System.out.println("Introduce un número: ");
			numCadena = scannner.nextLine();
			
		
		}
		System.out.println("Fin del programa. La suma de todos los números es "+numeros);
		
		
		
	}

}
