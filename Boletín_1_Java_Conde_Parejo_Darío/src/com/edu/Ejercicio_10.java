package com.edu;

import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Realiza un programa que sume los 100 números siguientes a un número entero y
		positivo introducido por teclado. Se debe comprobar que el dato introducido es
		correcto (que es un número positivo).*/

		// TODO Auto-generated method stub
		
		System.out.println("Introduce un número: ");
		Scanner scannner= new Scanner(System.in);
		Integer numero = scannner.nextInt();
		int suma=0;
		
		while (numero<0) {
			System.out.println("Introduce un número: ");
			numero = scannner.nextInt();
		}
		for (int i=numero+100;i>=numero;i--) {
			suma+=i;
				
			
		
		}
		System.out.println(suma);
		
	}

}
