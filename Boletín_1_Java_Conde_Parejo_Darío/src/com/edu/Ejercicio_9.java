package com.edu;

import java.util.Scanner;

public class Ejercicio_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce un número: ");
		Scanner scannner= new Scanner(System.in);
		Integer numero = scannner.nextInt();
		int resto=0;
		
		for (int i=1;i<=4;i++) {
			System.out.println("Introduce un número: ");
			numero = scannner.nextInt();
			resto = numero%3;
			if (resto==0) {
				System.out.println(numero + " es múltiplo de 3");
			}
			

		}

	}

}
