package boletín_2;

import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Diseña una función que, dada una cadena de entrada, comprueba si es una
		contraseña fuerte o no. Se considera que una contraseña es fuerte si contiene 8 o
		más caracteres, y entre ellos al menos hay una mayúscula, una minúscula, un signo
		de puntuación y al menos un dígito.*/
		
		System.out.println(contrasenyaFuerte("A1?aAlddddddddddd"));
	}
	public static Boolean contrasenyaFuerte(String contrasenya) {
		System.out.println("Introduce una contraseña");
		/*Scanner scanner= new Scanner(System.in);*/
		boolean es_fuerte=false;
		final int LONGITUD_MINIMA_SEGURA=8;
		boolean minusculas=false;
		boolean mayusculas=false;
		boolean signosPuntuacion=false;
		boolean digitos=false;
		final String SIGNOS_PUNTUACION="?;,.?!¿¡-";
		
		
		if (contrasenya!=null && contrasenya.length()>=LONGITUD_MINIMA_SEGURA) {
			for (int i=0; i<contrasenya.length();i++){
				if (Character.isUpperCase(contrasenya.charAt(i))) {
					mayusculas=true;
				}else if (Character.isLowerCase(contrasenya.charAt(i))) {
					minusculas=true;
				}else if (Character.isDigit(contrasenya.charAt(i))) {
					digitos=true;
				}else {
					for (int j=0; SIGNOS_PUNTUACION.length()>j;j++) {
						if (contrasenya.charAt(i)==SIGNOS_PUNTUACION.charAt(j)) {
								signosPuntuacion=true;
						}				
					}
				}
			}if (minusculas==true && mayusculas==true && signosPuntuacion==true && digitos==true) {
				 es_fuerte=true;
				}
		}return es_fuerte;
		
	}

}

