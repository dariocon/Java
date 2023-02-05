package boletín_2;

import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Realizar un método llamado esMultiplo que recibirá dos números y devuelva True si
		el primer número es múltiplo del segundo.*/
	}
		
	public static Boolean esMultiplo() {
			
		System.out.println("Introduce un número: ");
		Scanner scanner= new Scanner(System.in);
		Integer num1= scanner.nextInt();
		System.out.println("Introduce un número: ");
		Integer num2= scanner.nextInt();
		int resto;
		resto= num1%num2;
		boolean multiplo=false;
			
		if (resto==0) {
			multiplo=true;
		}
		return multiplo;
	}

}
