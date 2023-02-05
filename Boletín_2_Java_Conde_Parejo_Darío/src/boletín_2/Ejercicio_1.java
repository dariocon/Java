package boletín_2;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Realizar un método llamado numeroSolucionesEcuacionSegundoGrado que recibalos 
		 * coeficientes de una ecuación de segundo grado y devuelva el número desoluciones 
		 * que tiene. Si los argumentos no son válidos (el primer coeficiente tieneque ser 
		 *distinto de cero) debe devolver un -1.
		 */
	}
	static Double numeroSolucionesEcuacionSegundoGrado() {
		
		System.out.println("Introduce un número: ");
		Scanner scanner= new Scanner(System.in);
		Double a = scanner.nextDouble();
		System.out.println("Introduce un número: ");
		Double b = scanner.nextDouble();
		System.out.println("Introduce un número: ");
		Double c = scanner.nextDouble();
		double x1=0;
		double x2=0;
		Double resultado=0.0;
		
		
		if (a>0 && b>0 && c>0) {
			x1=(-b+Math.sqrt(Math.pow(b,2)-(4*a*c)))/2*a;
			x2=(-b-Math.sqrt(Math.pow(b,2)-(4*a*c)))/2*a;
			resultado=(x1+x2);
			
		}else {
			resultado=-1.0;
			
		}
		return resultado;
		
	}
	
		
	

}
