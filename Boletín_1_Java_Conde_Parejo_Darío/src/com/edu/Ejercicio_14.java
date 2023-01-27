package com.edu;

import java.util.Scanner;

public class Ejercicio_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Realiza un programa que vaya pidiendo números hasta que se introduzca un número negativo
		 *  y nos diga cuántos números se han introducido, la media de los impares y
		 *   el mayor de los pares. El número negativo sólo se utiliza para indicar elfinal 
		 *   de la introducción de datos pero no se incluye en el cómputo.*/
		 
		System.out.println("Introduce un número: ");
		Scanner scannner= new Scanner(System.in);
		Integer numero = scannner.nextInt();
		int contador=0;
		int contadorMediaImpares=0;
		int ImparesSuma=0;
		int valorMaximoPares=0;
		
		
		while (numero>=0) {
			System.out.println("Introduce un número: ");
			numero = scannner.nextInt();
			contador+=1;
			if (numero%2!=0) {
				ImparesSuma+=numero;
				contadorMediaImpares+=1;

			}else {
				if (numero>valorMaximoPares) 
				valorMaximoPares=numero;
			}
			
		}
		int mediaImpares=(ImparesSuma/contadorMediaImpares);
		System.out.println(contador);
		System.out.println(mediaImpares);
		System.out.println(valorMaximoPares);
	}

}
