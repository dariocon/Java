package boletín_2;

import java.util.Scanner;

public class Ejercicio_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Realiza un método llamado toBinary que reciba un número decimal como
		argumento y devuelva un String con el número binario correspondiente.*/
		System.out.println(toBinary(557));

	}
	public static String toBinary(int numDecimal) {

		/*Sin tanto lío: String binario = Integer.toBinaryString(decimalInicial);*/
		
		
		StringBuilder binario = new StringBuilder();
		int resto=0;
		
		while (numDecimal>0) {
			resto= (numDecimal%2);
			numDecimal=numDecimal/2;
			binario.insert(0, String.valueOf(resto));
		
		}
		return binario.toString();
		/*return voltearNumero(binario);
		
	}
	private static StringBuilder voltearNumero(StringBuilder binario) {
		// TODO Auto-generated method stub
		return binario;*/
	}
}
