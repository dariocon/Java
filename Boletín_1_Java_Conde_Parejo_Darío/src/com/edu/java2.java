package com.edu;

import java.util.Scanner;

public class java2 {

	
	public static void main(String[] args) {
		int edad=0;
		
		
		
		System.out.println("Introduce tu edad: ");
		Scanner scannner= new Scanner(System.in);
		String loquehaleido = scannner.nextLine();
		edad = Integer.valueOf(loquehaleido);
		if (edad>=18) {
			System.out.println("Eres mayor de edad");
			if (edad>65) {
				System.out.println("Eres un anciano");
			}else {
				System.out.println("Eres un adulto");
			}
		}else {
			System.out.println("No eres mayor de edad. Eres un niño");
		}
		
		
	}

	

}
