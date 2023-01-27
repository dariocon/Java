package com.edu;

import java.util.Scanner;

public class Ejercicio_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Realiza un programa que pida números hasta que se teclee uno negativo y muestre
		cuántos números se han introducido.*/
		
		/* Realiza un programa que pida números hasta que se teclee uno negativo y muestre
	cuántos números se han introducido.*/
		
		
		System.out.println("Introduce un número: ");
		Scanner scannner= new Scanner(System.in);
		Integer numero = scannner.nextInt();
		int contador=0;
		
		while (numero>=0) {
			System.out.println("Introduce un número: ");
			numero = scannner.nextInt();
			contador+=1;
		}
		System.out.println(contador);
		
	}

}
