package com.edu;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nota_final="";
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce la nota de la parte práctica: ");
		double nota_prac= sc.nextFloat();
		
		System.out.println("Introduce la nota de la parte teórica: ");
		double nota_teoria= sc.nextFloat();
		
		System.out.println("Introduce la nota de la parte de problemas: ");
		double nota_problemas= sc.nextFloat();
		
		double media=(nota_prac*0.10)+(nota_problemas*0.50)+(nota_teoria*0.40);
		
		if ((media>=9) && (media<11)) {
			nota_final="Sobresaliente";
				
		}else if ((media<9) && (media>6.99)) {
			nota_final="Notable";
		}else if ((media<7) && (media>4.99)) {
			nota_final="Suficiente";
		}else if (media<5) {
			nota_final="Suficiente";
		}
		
		System.out.println("La nota final es " + media + ", un " + nota_final);
		
		
	}

}
