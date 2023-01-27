package com.edu;

public class Ejercicio_7 {
	
	public static void secuencia100For() {
		// TODO Auto-generated method stub
		int numeros=0;
		for (int i= 1;i<=100;i++) {
			numeros=numeros+1;
			System.out.println(numeros);
			
			
		}
		System.out.println("Fin");

	}
	public static void secuencia100While() {
		
		int numerosW=0;
		while (numerosW<100) {
			numerosW+=1;
			System.out.println(numerosW);
			
		}
	}
	
	
	public static void secuencia100DoWhile() {
		
		int numerosW=0;
		do {
			numerosW+=1;
			System.out.println(numerosW);
		} while (numerosW<100);
			
		
	}
	
	public static void secuencia100For2() {
		// TODO Auto-generated method stub
		int numeros=101;
		for (int i= numeros;i>0;i--) {
			numeros=numeros-1;
			System.out.println(numeros);
			
			
		}
		System.out.println("Fin");

	}
	public static void secuencia100While2() {
		
		int numerosW=101;
		while (numerosW>0) {
			numerosW-=1;
			System.out.println(numerosW);
			
		}
	}
	
	
	public static void secuencia100DoWhile2() {
		
		int numerosW=101;
		do {
			numerosW-=1;
			System.out.println(numerosW);
		} while (numerosW>0);
			
		
	}
	
	public static void multiplos100For() {
		// TODO Auto-generated method stub
		int resto;
		int numero2 = 5;

		
		for (int i=0;i<=100;i++) {
			resto = i%numero2;
			if (resto==0) {
				  System.out.println(i + " es múltiplo de " + numero2);
			}
		}
	}
	public static void secuencia320_160_20() {
		// TODO Auto-generated method stub
		int numeros=320;
		for (int i= numeros;i>160;i=i-20) {
			numeros=numeros-20;
			System.out.println(numeros);
			
			
		}
		System.out.println("Fin");

	}
	
	
	public static void main(String[] args) {
		// Ejercicio 7

		// a1.
		secuencia100For();
		// a2. 
		secuencia100While();
		// a3.
		secuencia100DoWhile();
		// b1.
		secuencia100For2();
		//b2.
		secuencia100While2();
		//b3.
		secuencia100DoWhile2();
		//c.
		multiplos100For();
		//d.
		secuencia320_160_20();
		
		
		
	}
	

}
