package com.edu;

import java.util.Scanner;

public class Ejercicio_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce un número: ");
		Scanner scannner= new Scanner(System.in);
		Integer numero = scannner.nextInt();
		int PrimerTermino = 1;
		int SegundoTermino = 1;
		int resto =0;
		
		for (int i=0; i<numero;i++) {

			resto = PrimerTermino+SegundoTermino;
			PrimerTermino = SegundoTermino;
			SegundoTermino = resto;
			
		}

	}

}
