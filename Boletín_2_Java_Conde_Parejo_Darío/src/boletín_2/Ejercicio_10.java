package boletín_2;

import java.util.Scanner;

public class Ejercicio_10 {

	public Ejercicio_10(int num1, int num2) {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*10. Realiza un método llamado gcd (greaterCommonDivisor) que recibirá dos números y
		devuelva el máximo común divisor según el algoritmo de Euclides.*/
		System.out.println(greaterCommonDivisor(56,34));
	}
	public static Integer greaterCommonDivisor(int num1, int num2) {
		int gcd=0;
		while (num2>0) {
			if(num1 > num2) {
				num1 = (num1 - num2);
			}else {
				num2 = (num2 - num1);
			}
			gcd=num1;
		}
		
		return gcd;
	
		
	}

}
