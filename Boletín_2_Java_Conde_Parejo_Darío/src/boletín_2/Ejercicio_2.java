package boletín_2;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Realiza un programa que pida un número por teclado y que después muestre ese
		número al revés.*/
		
		
	}
	public static String voltearNumero() {
		System.out.println("Introduce un número decimal: ");
		Scanner scanner= new Scanner(System.in);
		String numero= scanner.nextLine();
		String numeroDelReves="";
		
		if (Integer.parseInt(numero)>9) {
			for (int i=numero.length()-1; i>=0;i--) {
				numeroDelReves+=numero.charAt(i);
			}
		}return numeroDelReves;
	}

}