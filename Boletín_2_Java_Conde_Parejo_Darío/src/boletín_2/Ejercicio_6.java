package boletín_2;

import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Realizar un método llamado horaMayor que recibirá seis valores enteres, los tres
		primeros representarán la hora, minuto y segundos de la primera hora y los otros
		tres de la segunda hora. Se deberá devolver un 1 si la primera hora es mayor que la
		segunda, un 2 si la segunda hora es mayor que la primera, un 0 si son iguales y un
		-1000 si los datos no son correctos.*/
		horaMayor();
	}
	public static Integer horaMayor() {
		
		System.out.println("Introduce una hora para la primera hora: ");
		Scanner scanner= new Scanner(System.in);
		Integer hora1= scanner.nextInt();
		System.out.println("Introduce un minuto para la primera hora: ");
		Integer minuto1= scanner.nextInt();
		System.out.println("Introduce un segundo para la primera hora: ");
		Integer segundo1= scanner.nextInt();
		System.out.println("Introduce una hora para la segunda hora: ");
		Integer hora2= scanner.nextInt();
		System.out.println("Introduce un minuto para la segunda hora: ");
		Integer minuto2= scanner.nextInt();
		System.out.println("Introduce un segundo para la segunda hora: ");
		Integer segundo2= scanner.nextInt();
		int horaMayor=0;
		
		if ((hora1 >= 00 && hora2 >= 00) && (hora1 <= 24 && hora2 <= 24) &&  (minuto1 <= 60 && minuto2 <= 60) && (segundo2 <= 60 && segundo2 <= 60)) {
			if (hora1>=hora2) {
				if  (hora1==hora2) {
					horaMayor=minuto1>minuto2?1:2;
					if (minuto1==minuto2) {
						horaMayor=segundo1>segundo2?1:2;
						if (segundo1==segundo2){
							horaMayor=0;
						}
					}
				}
				horaMayor=1;
			}else {
				horaMayor=2;
			
			}
			
			
		
		}else
			horaMayor=-1000;
		return horaMayor;
	}
	
	
}
