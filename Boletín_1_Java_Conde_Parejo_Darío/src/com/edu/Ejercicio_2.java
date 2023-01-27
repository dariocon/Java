package com.edu;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce un día de la semana [1-7]");
		Scanner scannner= new Scanner(System.in);
		int dia= Integer.valueOf(scannner.nextLine());
		if (dia==2 || dia==3 || dia==5) {
				System.out.println("Programación");
		}else if (dia==1) {
			System.out.println("Base de datos");
			
		}else if (dia==4) {
			System.out.println("FOL");
		}
	}

}
