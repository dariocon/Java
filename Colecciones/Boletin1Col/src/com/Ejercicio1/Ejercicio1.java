package com.Ejercicio1;
import java.util.Arrays;


public class Ejercicio1 {
	public static void main(String[] args) {
		/*1*/
		
		Integer[] arrayNumeros = {1,2,3,4,5,6};
		String[] arrayNumeros2 = {"1","2","3","4","5","6"};
		
		System.out.println(Arrays.toString(reverse(arrayNumeros)));
		System.out.println(Arrays.toString(reverse(arrayNumeros2)));
		
		
	}
	
	protected static <T> T[] reverse(T[] arrayOriginal) {
		int contador=0;
		T[] arrayRevertida = Arrays.copyOf(arrayOriginal, arrayOriginal.length);
		
		for(int i=arrayOriginal.length-1; i>=0;i--) {
			arrayRevertida[contador]=arrayOriginal[i];
			contador++;
				
			
		}
		//MANERA CON DOS FOR
		/*for(int i=arrayOriginal.length-1; i>=0;i--) {
			for (int j=0;j<arrayOriginal.length;j++) {
				arrayRevertida[arrayOriginal.length - i - 1] = arrayOriginal[i];
	        				
			}
		}*/
		return arrayRevertida;
		}
}
