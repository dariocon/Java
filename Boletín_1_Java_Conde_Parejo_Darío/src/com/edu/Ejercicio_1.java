package com.edu;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
	
		System.out.println("Introduce un número: ");
		Scanner scanner= new Scanner(System.in);
		int num1= Integer.valueOf(scanner.nextLine());
		System.out.println("Introduce otro número: ");
		Scanner scannneer= new Scanner(System.in);
		int num2= Integer.valueOf(scanner.nextLine());
		int resto;
		resto= num1%num2;
		
		if (resto==0) {
			System.out.println("Son múltiplos");
		}else {
			System.out.println("No son múltiplos");
		
		}
		
	}
	
}		
		

